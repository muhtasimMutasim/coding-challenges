
-- This is for the second highest salary Leet code challenge.

USE test;

/*  Test Case 1
Create table If Not Exists `Employee` (Id int, Salary int);
Truncate table `Employee`;
insert into `Employee` (Id, Salary) values ('1', '100');
insert into `Employee` (Id, Salary) values ('2', '200');
insert into `Employee` (Id, Salary) values ('3', '300');
*/
/**/
Create table If Not Exists `Employee` (Id int, Salary int);
Truncate table `Employee`;
insert into `Employee` (Id, Salary) values ('1', '100');


-- SELECT Salary AS SecondHighest FROM `Employee`;

/*
SELECT Employee.Salary
FROM `Employee`
WHERE Employee.Salary (CASE
    WHEN COUNT(Salary) > 1 THEN Salary = ( SELECT MAX(Salary) FROM `Employee` WHERE Salary < (SELECT MAX(Salary) FROM `Employee`) )
    ELSE Salary = Salary
    END);
*/

/*
SELECT Salary AS SecondHighest FROM `Employee`
WHERE Salary = ( SELECT DISTINCT(Salary) FROM `Employee` as e1 
WHERE ( SELECT COUNT(DISTINCT(Salary)) = 2 FROM `Employee` as e2
WHERE e1.Salary <= e2.salary ));
*/

/*

Gets the Max Salary with alias SecondHighestSalary 
Where the 'Salary' cannot be inside the values ( SELECR MAX(Salary) FROM Employee)

*/

SELECT MAX(salary) as SecondHighestSalary FROM Employee WHERE Salary NOT IN ( SELECT Max(Salary) FROM Employee);

