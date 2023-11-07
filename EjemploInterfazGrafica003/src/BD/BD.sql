CREATE DATABASE taller003;

CREATE TABLE Marca
(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  boolean         not null,
    unique(nombre)
);

insert into marca values (null, 'Nissan', 1);
insert into marca values (null, 'MG', 1);
insert into marca values (null, 'Fiat', 1);
insert into marca values (null, 'Mazda', 1);
insert into marca values (null, 'Chevrolet', 1);


-- Ejercicio 18/19: Crear Tabla, modelo, controlador y Formulario
 -- para la entidad Cargo y comuna (gerente, vendedor, etc)
 -- los atributos son: id, nombre y habilitado.