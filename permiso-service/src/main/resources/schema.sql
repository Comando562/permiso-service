DROP TABLE IF EXISTS Permiso;
CREATE TABLE Permiso (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    descripcion VARCHAR(50) NOT NULL,
    activo INT NOT NULL,
    id_Padre INT NOT NULL,
    icono VARCHAR(50) NOT NULL
);
DROP TABLE IF EXISTS Tipo_Usuario_Permiso;
CREATE TABLE Tipo_Usuario_Permiso (
                                      id INT AUTO_INCREMENT  PRIMARY KEY,
                                      id_Tipo_Usuario INT NOT NULL,
                                      id_Permiso INT NOT NULL,
                                      activo INT NOT NULL
);