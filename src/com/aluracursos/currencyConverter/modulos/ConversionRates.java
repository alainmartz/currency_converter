package com.aluracursos.currencyConverter.modulos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ConversionRates {
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public Map<String, Double> getConversionRates(){
        return conversionRates;
    }
}
