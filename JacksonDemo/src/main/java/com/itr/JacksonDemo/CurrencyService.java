package com.itr.JacksonDemo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CurrencyService {

    public CurrencyResponse convertCurrency(String from, String to, double amount) {

        String url = "https://open.er-api.com/v6/latest/" + from;

        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> response = restTemplate.getForObject(url, Map.class);

        Map<String, Double> rates = (Map<String, Double>) response.get("rates");

        double rate = rates.get(to);

        double convertedAmount = amount * rate;

        return new CurrencyResponse(from, to, amount, convertedAmount);
    }
}