package com.aluracursos.currencyConverter.modulos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class Consulta {

    private final Map<String, ConversionRates> cache = new HashMap<>();
    private final String apikey = "ee20a6896d0407bcb0b61024";


    public ConversionRates conversor(String convertFrom) {
        if (cache.containsKey(convertFrom)){
            return cache.get(convertFrom);
        }

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apikey + "/latest/" + convertFrom);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            ConversionRates rates = new Gson().fromJson(response.body(), ConversionRates.class);
            cache.put(convertFrom,rates);
            return rates;
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al conectar con la API. Verifique su conexión o intente más tarde.");
            return null;
        }
    }
}
