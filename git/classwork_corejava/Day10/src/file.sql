-- Insert
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_demo`(in id int, in name varchar(50), in address varchar(50))
begin
	insert into employee values (id, name, address);
    select * from employee;
end$$
DELIMITER ;

-- Read
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `show_data`()
begin
	select * from employee;
end$$
DELIMITER ;

-- Update Name
Delimiter //
Create procedure `update_name`(in pid int, in pname varchar(50))
begin
	update employee set name = pname where id = pid;
    select * from employee;
end //
Delimiter ;

call update_name(4, 'Hari');

-- Update Address
Delimiter //
Create procedure `update_address`(in pid int, in paddress varchar(50))
begin
	update employee set address = paddress where id = pid;
    select * from employee;
end //
Delimiter ;

call update_address(4, 'address5');

-- Delete
Delimiter //
Create procedure `delete_data`(in pid int)
begin
	delete from employee where id = pid;
    select * from employee;
end //
Delimiter ;

call delete_data(3);