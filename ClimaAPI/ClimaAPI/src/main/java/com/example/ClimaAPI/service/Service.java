package com.example.ClimaAPI.service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {

    private static final String BASE_URL = "https://api.open-meteo.com/v1/forecast?latitude=-19.9208&longitude=-43.9378";

    private String consultarURL(String apiUrl){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }
    public String consultarClimaAtual() {
        return consultarURL(BASE_URL + "&current=temperature_2m,relative_humidity_2m,apparent_temperature,wind_speed_10m,wind_direction_10m,rain,precipitation&forecast_days=1");
    }
    public String consultarClimaDiario() {
        return consultarURL(BASE_URL + "&daily=temperature_2m_max,temperature_2m_min,wind_speed_10m_max,wind_direction_10m_dominant,rain_sum,precipitation_sum&forecast_days=1");
    }
    public String consultarClimaSemanal() {
        return consultarURL(BASE_URL + "&daily=temperature_2m_max,temperature_2m_min,wind_speed_10m_max,wind_direction_10m_dominant,rain_sum,precipitation_sum");
    }
}