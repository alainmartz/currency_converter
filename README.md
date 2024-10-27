# Conversor de Divisas

![licencia del repositorio](https://img.shields.io/badge/LICENCIA-MIT-blue)
![estado del proyecto](https://img.shields.io/badge/ESTADO-MEJORANDO-GREEN)
![Lenguaje](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)

Este proyecto es una aplicación de consola en Java que permite realizar 
conversiones de divisas en tiempo real utilizando la API de 
[ExchangeRate-API](https://www.exchangerate-api.com/). 
La aplicación proporciona una serie de conversiones predefinidas y la posibilidad 
de realizar conversiones personalizadas a partir de los códigos de divisas en 
formato ISO (como USD para el dólar estadounidense o EUR para el euro).

## Funcionalidades

* Conversión de divisas predefinidas (USD a CLP, USD a BRL, etc.).
* Conversión personalizada entre cualquier par de divisas utilizando códigos ISO.


## Requisitos

Para ejecutar este proyecto, asegúrate de tener lo siguiente:

* **Java 17 o superior** instalado.
* Acceso a internet para obtener las tasas de cambio desde la API.
* Libería GSON 2.11.0
* Clave de API de [ExchangeRate-API](https://www.exchangerate-api.com/) válida.

## Configuración del Proyecto

1. **Clona el repositorio**:
```
   git clone https://github.com/alainmartz/currency_converter.git
```

2. **Navega al directorio del proyecto:**
```
   cd currency_converter
```

3. **Descarga la biblioteca Gson:**
   * Ve a la página de Gson en Maven Central.
   * Busca la última versión (por ejemplo, ``2.11.0``) y descarga el archivo ``.jar``.
   
4. **Agrega Gson al proyecto:**
    * Mueve el archivo  `jar` descargado a una carpeta, que puedes llamar `libs`, para mantener el orden.
   
5. **Compila el proyecto**: Puedes usar un IDE como IntelliJ IDEA o un compilador de Java en línea de comandos. 
Si usas la terminal, compila con:
```
   javac -d out -sourcepath src -cp "libs/gson-2.11.0.jar" src/com/aluracursos/currencyConverter/main/Main.java

```

6. **Ejecuta el programa:**
```
   java -cp "out;libs/gson-2.8.9.jar" com.aluracursos.currencyConverter.main.Main
```

## Uso

Al ejecutar el programa, verás el siguiente menú en consola:

```
***********************************
        CONVERSOR DE DIVISAS
***********************************

Bienvenido al conversor de divisas             
1 - Dolar => Peso Chileno
2 - Dolar => Real Brasileño
3 - Dolar => Peso Argentino
4 - Peso Chileno => Dolar
5 - Real Brasileño => Dolar
6 - Peso Argentino => Dolar
7 - Conversión personalizada
8 - Salir

```

## Opciones de conversión

* **Opciones 1 a 6**: Selecciona una de estas opciones
para realizar una conversión predefinida entre USD, CLP, BRL y ARS.
* **Opción 7 - Conversión personalizada**: Te permite ingresar cualquier par de 
divisas mediante sus códigos ISO.
* **Opción 8 - Salir**: Termina el programa.


## Ejemplo de Ejecución


1. **Selecciona una opción de conversión**: Ingresa el número correspondiente
a la conversión que desees realizar.
2. **Introduce la cantidad**: Una vez seleccionada la opción, se pedirá que ingreses
el valor de la divisa a convertir.
3. **Verifica el resultado**: El programa mostrará la cantidad convertida en la
divisa deseada.

````
Ingrese la cantidad a cambiar: 100
100,00 USD son 94633,66 CLP
````

## Ejemplo de conversión personalizada

Si selecciona la opción 7, se le pedirá que ingrese los códigos ISO 
de las divisas de origen y destino. Por ejemplo:

```
Ha escogido la conversión personalizada.
Ingrese la divisa de origen: EUR
Ingrese la divisa de destino: JPY
Ingrese la cantidad a cambiar: 50
50.0 EUR son 6367.50 JPY
```
## Estructura del Proyecto

* **com.aluracursos.currencyConverter.main.Main**: Clase principal que contiene el menú 
de la aplicación y el bucle de interacción con el usuario.
* **com.aluracursos.currencyConverter.modulos.Consulta**: Clase que maneja las solicitudes 
HTTP a la API y almacena los resultados en un caché para optimizar el rendimiento.
* **com.aluracursos.currencyConverter.modulos.RealizarConversion**: Clase que contiene la 
lógica de conversión y muestra los resultados en la consola.
* **com.aluracursos.currencyConverter.modulos.ConversionRates**: Clase que mapea la respuesta 
JSON de la API a un objeto en Java para facilitar el acceso a las tasas de conversión.
