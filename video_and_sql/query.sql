CREATE DATABASE IF NOT EXISTS StudentsDB;
use StudentsDB;

create table IF NOT EXISTS Student 
(
Student_Id int primary key auto_increment,
Name varchar(50),
Department varchar(50),
Country varchar(50)
);
