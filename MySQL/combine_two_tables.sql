-- This File is for testing out the combine two tables leet code challenge.


USE test;

/*
DROP TABLE IF EXISTS `Person`;
DROP TABLE IF EXISTS `Address`;

Create table `Person` (PersonId int, FirstName varchar(255), LastName varchar(255));
Create table `Address` (AddressId int, PersonId int, City varchar(255), State varchar(255));
Truncate table `Person`;
insert into `Person` (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen');
Truncate table Address;
insert into `Address` (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York');

*/

/*
SELECT `Person`.PersonId, `Person`.FirstName, `Person`.LastName
FROM `Person`;
*/
/*
SELECT `Person`.FirstName, `Person`.LastName, `Address`.City, `Address`.State 
FROM `Person`, `Address`  
WHERE `Person`.PersonId <> `Address`.PersonId;
*/

SELECT `Person`.FirstName, `Person`.LastName, `Address`.City, `Address`.State 
FROM `Person` LEFT JOIN `Address` ON `Person`.PersonId = `Address`.PersonId;




