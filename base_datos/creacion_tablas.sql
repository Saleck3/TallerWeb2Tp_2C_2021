CREATE DATABASE IF NOT EXISTS tp_taller_web;

USE tp_taller_web;

create table usuarios (
	id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(50),
    mail varchar(50) unique,
    password varchar(50),
    rol varchar(20)
);

create table cervezas(
	id_cerveza int primary key auto_increment, 
    marca varchar(30),
    sabor varchar(30)
);

create table cervecerias(
	id_cerveceria int primary key auto_increment,
    nombre varchar(30),
    ubicacion varchar(40)
);

create table vende(
	id_cerveceria int,
    id_cerveza int
);

alter table vende add foreign key (id_cerveceria) references cervecerias(id_cerveceria);
alter table vende add foreign key (id_cerveza) references cervezas(id_cerveza);

create table feedback(
	id_feedback int primary key auto_increment, 
    id_cerveceria int, 
    pun_cerveceria smallint, 
    comentario varchar(1000)
);

alter table feedback add foreign key (id_cerveceria) references cervecerias(id_cerveceria);

create table feed_cerveza(
	id_feedback int, 
    id_cerveza int, 
	pun_cerveza smallint
);

alter table feed_cerveza add primary key (id_feedback, id_cerveza);
alter table feed_cerveza add foreign key (id_feedback) references feedback(id_feedback);
alter table feed_cerveza add foreign key (id_cerveza) references cervezas(id_cerveza);