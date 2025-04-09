# Sistema de Gestión de Vehículos

## Alumno
**Juan Pablo Samso**

## Descripción del Proyecto
Este proyecto consiste en desarrollar una aplicación en Java para gestionar vehículos de una empresa. La aplicación implementa conceptos de Programación Orientada a Objetos y aplica los principios SOLID (SRP, OCP, LSP). Se utiliza además un ArrayList para manejar dinámicamente las instancias de distintos tipos de vehículos, como Vehículo, Camión y Auto. La gestión del proyecto se realiza utilizando Git y GitHub.

## Requisitos Previos
- **JDK:** Java SE 8 o superior.
- **IDE:** Se recomienda usar IntelliJ IDEA, Eclipse o NetBeans.
- **Git:** Debe estar instalado y configurado.

## Instrucciones Detalladas para Ejecutar el Proyecto

### 1. Clonar el Repositorio
Abre la terminal o CMD y ejecuta:
```bash
git clone https://github.com/um-programacion-ii/programacion-2-trabajo-practico-1-JuanPabloSamso.git
```

### 2. Abrir el Proyecto en el IDE
- Inicia tu IDE (por ejemplo, IntelliJ IDEA).
- Selecciona **File > Open** y navega hasta la carpeta del proyecto que acabas de clonar.
- Asegúrate de configurar la JDK en tu proyecto: **File > Project Structure > Project** y selecciona la versión de Java instalada.

### 3. Compilar y Ejecutar el Proyecto

#### A. Desde el IDE:
- Navega a `src/vehiculos/Main.java`.
- Haz clic derecho sobre el archivo y selecciona **Run 'Main.main()'** para compilar y ejecutar la aplicación.

#### B. Desde la Línea de Comandos:
1. Compila el código:
   ```bash
   javac -d bin src/vehiculos/*.java
   ```
2. Ejecuta la aplicación:
   ```bash
   java -cp bin vehiculos.Main
   ```

## Ejemplos de Uso
Al ejecutar la aplicación, la consola mostrará la información impresa de cada vehículo. Por ejemplo, la salida será similar a:

```
Información del Vehículo 1:
Patente: XYZ321
Marca: Renault
Año: 2016
Capacidad de Carga (Kg): 800.0
-------------------------------
Información del Vehículo 2:
Patente: LMN789
Marca: Mercedes
Año: 2019
Capacidad de Carga (Kg): 900.0
-------------------------------
Información del Vehículo 3:
Patente: QRS456
Marca: BMW
Año: 2021
Capacidad de Carga (Kg): 700.0
-------------------------------
Información de un Camión:
Patente: CAM001
Marca: Volvo
Año: 2018
Capacidad de Carga (Kg): 1200.0
Tiene acoplado: Sí
-------------------------------
Información de un Auto:
Patente: AUTO001
Marca: Audi
Año: 2020
Capacidad de Carga (Kg): 600.0
Cantidad de pasajeros: 5
```
