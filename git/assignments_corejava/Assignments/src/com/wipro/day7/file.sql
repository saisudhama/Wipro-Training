
create database company;

use company;
create table employee (
	id int auto_increment primary key,
    name varchar(32) not null,
    salary decimal(10, 3)
);

select * from employee;

insert into employee (name, salary) values ('Ram', 900000), ('Krishna', 300000), ('Hari', 500000);

delete from employee
where id = 3;

update employee
set salary = 400000
where name = 'Krishna';
