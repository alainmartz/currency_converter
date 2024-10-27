package com.aluracursos.currencyConverter.main;

import com.aluracursos.currencyConverter.modulos.Consulta;
import com.aluracursos.currencyConverter.modulos.RealizarConversion;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String convertFrom = "USD"; //Por defecto
        String convertTo = "CLP"; // Por defecto
        double cantidad = 0; //Por defecto
        double cambio = 0;
        Consulta consulta = new Consulta();
        String menu = """
                ***********************************
                        CONVERSOR DE DIVISAS
                ***********************************\s
                \nBienvenido al conversor de divisas             
                1 - Dolar => Peso Chileno\s
                2 - Dolar => Real Brasileño
                3 - Dolar => Peso Argentino\s
                4 - Peso Chileno => Dolar\s 
                5 - Real Brasileño => Dolar\s
                6 - Peso Argentino => Dolar\s
                7 - Conversión personlizada
                8 - Salir
               \s
                \s
               \s""";

        int opcion = 0;

        while (opcion != 8) {
            System.out.println(menu);
            if (scan.hasNextInt()) {
                opcion = scan.nextInt();
                if (opcion >= 1 && opcion <= 7) {
                    System.out.println("Ingrese la cantidad a cambiar");
                } else if (opcion == 8) {
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                } else {
                    System.out.println("Opción no válida. Vuelva a intentar");
                    continue;
                }
                cantidad = scan.nextDouble();
                switch (opcion) {
                    case 1 -> RealizarConversion.realizarConversion("USD", "CLP", cantidad, consulta);
                    case 2 -> RealizarConversion.realizarConversion("USD", "BRL", cantidad, consulta);
                    case 3 -> RealizarConversion.realizarConversion("USD", "ARS", cantidad, consulta);
                    case 4 -> RealizarConversion.realizarConversion("CLP", "USD", cantidad, consulta);
                    case 5 -> RealizarConversion.realizarConversion("BRL", "USD", cantidad, consulta);
                    case 6 -> RealizarConversion.realizarConversion("ARS", "USD", cantidad, consulta);
                    case 7 -> {
                        System.out.println("Ha escogido la conversión personalizada." +
                                "\nDebe ingresar las divisas de origen y destino según código ISO");
                        scan.nextLine(); // Limpiar buffer
                        System.out.println("Ingrese de origen");
                        convertFrom = scan.nextLine().toUpperCase();
                        System.out.println("Ingrese de destino");
                        convertTo = scan.nextLine().toUpperCase();
                        RealizarConversion.realizarConversion(convertFrom, convertTo, cantidad, consulta);
                    }
                }
            }
        }
    }
}






