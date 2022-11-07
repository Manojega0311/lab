show databases;
create database bank
use bank
create table branches2
(branchcode int primary key,
location varchar(200)not null);
insert into branches2 values(2,'delhi'),(3,'chennai'),(4,'bangalore');
select * from branches2;
create table bankmaster(acno int primary key,custname varchar(20) not null,city varchar(40)default 'hyd');
insert into bankmaster values(105,null,3000,'sbi1');
select * from bankmaster;
create table banktransaction(acno int,ttype char(1),tdate datetime not null,amount int not null);
insert into banktransaction values(104,j,03-11-2022,3000);
select * from banktransaction;
