create database bdcasa;

create table usuarios(
    nombre varchar(30) primary key not null,
    contraseña varchar(30)
)

insert into usuarios values('Josue','qwer5256');


create table cuentas(
    nombre varchar(30),
    cuenta varchar(30),
    correo varchar(50),
    contraseña varchar(30)
)

insert into cuentas values('Josue', 'Zoom', 'josue@gmail.com', 'qwer5256');

update cuentas set cuenta='asdasd', correo='asdasd', contraseña='asdasd' where cuenta='Caca' and nombre='Josue';

select * from cuentas;
select * from usuarios;