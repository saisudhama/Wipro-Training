show databases;
create database Demo;
Use demo;
create table wipro (
	location varchar(12),
    rating int,
    capacity int
);
 
 set sql_safe_updates = 0;
 
select * from wipro;

insert into wipro(location, rating, capacity) values ('Banglore', 5, 50000);

update wipro set rating = 4 where location = 'Banglore';

delete from wipro where rating = 4
