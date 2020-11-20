# Manual de setup Trimix Test Code paso a paso

### Creacion de la base de datos

* Utilizando la interfaz grafica de MySQL crear una nueva conexion. Los parametros deben ser los siguientes (password = root):

![alt text](https://github.com/mikedr/trimix/blob/master/manual/DB001.png)

* Luego ejecutar el siguiente script para crear la tabla necesaria: 
** [SQL script](https://github.com/mikedr/trimix/blob/master/manual/crearDByTabla.sql)

### Clonar el repositorio en un directorio local

El primer paso consiste en clonar el repositorio a un directorio de la PC local.

### Importar el proyecto al IDE

Click en Import...

![alt text](https://github.com/mikedr/trimix/blob/master/manual/001.png)

Luego elegir esta opcion:

![alt text](https://github.com/mikedr/trimix/blob/master/manual/002.png)

Luego ingresar en la siguiente ventana el path del proyecto donde fue clonado desde GitHub:

![alt text](https://github.com/mikedr/trimix/blob/master/manual/003.png)


18:47:38	CREATE TABLE `persona` (   `id` int(11) NOT NULL AUTO_INCREMENT,   `perNombre` varchar(45) NOT NULL,   `perApellido` varchar(45) NOT NULL,   `perNumeroDocumento` int(11) NOT NULL,   `perTipoDocumento` varchar(45) NOT NULL,   `perFechaNacimiento` datetime DEFAULT NULL,   PRIMARY KEY (`id`) ) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci	Error Code: 1046. No database selected Select the default DB to be used by double-clicking its name in the SCHEMAS list in the sidebar.	0.000 sec


