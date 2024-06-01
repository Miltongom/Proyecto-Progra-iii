create schema Proyecto_PrograIII;

CREATE TABLE Usuarios (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL UNIQUE,
    Correo VARCHAR(100) NOT NULL UNIQUE,
    Contraseña VARCHAR(50) NOT NULL,
    Fecha_de_Nacimiento Date NOT NULL
);

/*Para borrar una tabla*/
drop table usuarios;
