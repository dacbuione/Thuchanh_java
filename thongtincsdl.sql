create database thongtincsdl
use thongtincsdl
create table thongtin(
	id int identity(1,1) primary key,
	name nvarchar(50) not null,
	born date not null,
	room nvarchar(10) not null,
)
insert into thongtin(name,born,room) values('Name A','06-06-1997','Room 1')
insert into thongtin(name,born,room) values('Name B','06-30-1997','Room 1')
insert into thongtin(name,born,room) values('Name C','06-29-1997','Room 1')
insert into thongtin(name,born,room) values('Name D','06-28-1997','Room 1')
insert into thongtin(name,born,room) values('Name E','06-26-1997','Room 1')