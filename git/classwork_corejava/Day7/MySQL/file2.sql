use demo;
create table student (
	id int auto_increment primary key,
    name varchar(16),
    city varchar(12),
    marks decimal(5, 2) default 0 check (marks <= 100.00)
);

select * from student;

insert into student(name, city, marks) values ('Ram', 'Hyd', 100), ('Krishna', 'Hyd', 100), ('Hari', 'Hyd', 100);

delete from student 
where id = 1;

update student
set marks = 80
where id = 4