# Conversor de Divisas

Este proyecto es un conversor de divisas simple que permite a los usuarios convertir entre diferentes monedas utilizando tasas de cambio en tiempo real.

## Funcionalidades

- Conversión entre varias divisas predeterminadas.
- Conversión personalizada ingresando las divisas de origen y destino.
- Interfaz de consola fácil de usar.

## Requisitos

Para ejecutar este proyecto, asegúrate de tener lo siguiente:

- **Java 11 o superior** instalado en tu máquina.
- Acceso a internet para obtener las tasas de cambio desde la API.

## Configuración del Proyecto

1. **Clona el repositorio**:
```bash
   git clone https://github.com/alainmartz/currency_converter.git
```
2. **Navega al directorio del proyecto:**
```bash
   cd currency_converter
```
3. **Compila el proyecto**: Puedes usar un IDE como IntelliJ IDEA o un compilador de Java en línea de comandos. 
Si usas la terminal, compila con:
```bash
   javac -d out -sourcepath src src/com/aluracursos/currencyConverter/main/Main.java
```
4. **Ejecuta el programa:**
```bash
   java -cp out com.aluracursos.currencyConverter.main.Main
```

## Uso

Al ejecutar el programa, verás un menú con las opciones disponibles 
para convertir divisas. Simplemente selecciona la opción deseada 
e ingresa la cantidad a cambiar. También puedes elegir la opción de 
conversión personalizada ingresando los códigos ISO de las monedas 
que deseas convertir.

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


```bash
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

Ingrese la opción deseada: 1
Ingrese la cantidad a cambiar: 100
100.00 USD son 80000.00 CLP
```
## Ejemplo de conversión personalizada

Si selecciona la opción 7, se le pedirá que ingrese los códigos ISO 
de las divisas de origen y destino. Por ejemplo:

```bash
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

## Notas

*  La API utilizada para obtener las tasas de cambio es https://v6.exchangerate-api.com/. 
Asegúrate de tener una clave de API válida y de reemplazarla en el código si es necesario.