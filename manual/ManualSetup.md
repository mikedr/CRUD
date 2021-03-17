# Manual de setup paso a paso

### Creación de la base de datos

* Utilizando la interfaz gráfica de MySQL crear una nueva conexión. Los parámetros deben ser los siguientes (password = root):

![alt text](https://github.com/mikedr/trimix/blob/master/manual/DB001.png)

Luego ejecutar el siguiente script para crear la tabla necesaria: [SQL script](https://github.com/mikedr/trimix/blob/master/manual/crearDByTabla.sql)

### Clonar el repositorio

El primer paso consiste en clonar el repositorio a un directorio de la PC local.

### Importar el proyecto al IDE

Click en Import...

![alt text](https://github.com/mikedr/trimix/blob/master/manual/001.png)

Luego elegir esta opción:

![alt text](https://github.com/mikedr/trimix/blob/master/manual/002.png)

Luego ingresar en la siguiente ventana el path del proyecto donde fue clonado desde GitHub. Luego "Finalizar".

![alt text](https://github.com/mikedr/trimix/blob/master/manual/003.png)

### Crear un servidor de aplicaciones

Utilizando la funcionalidad de crear servidor que brinda el IDE Eclipse crear un Tomcat versión 9:

![alt text](https://github.com/mikedr/trimix/blob/master/manual/004.png)

En la siguiente ventana es necesario ingresar el path donde se encuentra bajado [Tomcat9-Win64](https://apache.zero.com.ar/tomcat/tomcat-9/v9.0.40/bin/apache-tomcat-9.0.40-windows-x64.zip)

![alt text](https://github.com/mikedr/trimix/blob/master/manual/005.png)

En la siguiente ventana pasar el proyecto al lado "Configurado". Luego "Finalizar".

![alt text](https://github.com/mikedr/trimix/blob/master/manual/006.png)

### Levantar la aplicación

En la sección de servidores de Eclipse ejecutar el botón que inicia el servidor que acabamos de crear y esperar que finalice el proceso de startup.

![alt text](https://github.com/mikedr/trimix/blob/master/manual/007.png)

El proceso finaliza al recibirse el siguiente mensaje:

![alt text](https://github.com/mikedr/trimix/blob/master/manual/008.png)

### Acceder a la apliación

Ingresar la URL http://localhost:8080/trimix/ al browser.

![alt text](https://github.com/mikedr/trimix/blob/master/manual/009.png)

Y así finaliza el proceso de setup.

Muchas gracias.


