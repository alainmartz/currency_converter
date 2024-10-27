package com.aluracursos.currencyConverter.modulos;

public class RealizarConversion {

    public static void realizarConversion(String monedaOrigen, String monedaDestino, double cantidad, Consulta consulta) {
        ConversionRates conversionRates = consulta.conversor(monedaOrigen);
        if (conversionRates == null){
            System.out.println("No se pudo obtener la tasa de cambio. Intente más tarde.");
            return;
        }
        if (conversionRates.getConversionRates().containsKey(monedaDestino)) {
            double cambio = cantidad * conversionRates.getConversionRates().get(monedaDestino);
            System.out.printf("%.2f %s son %.2f %s\n\n", cantidad, monedaOrigen, cambio, monedaDestino);
        } else {
            System.out.println("No se encontró la tasa de cambio.");
        }
    }



}


