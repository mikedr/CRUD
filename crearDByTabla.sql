CREATE DATABASE `trimixdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `perNombre` varchar(45) NOT NULL,
  `perApellido` varchar(45) NOT NULL,
  `perNumeroDocumento` int(11) NOT NULL,
  `perTipoDocumento` varchar(45) NOT NULL,
  `perFechaNacimiento` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

