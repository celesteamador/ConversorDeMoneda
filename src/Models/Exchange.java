package Models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchange {

    public Currency locateCurrency(String CurrencyOption, double CurrencyAmount) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1a45912a55b4425d06fd6a9d/pair/" + CurrencyOption + CurrencyAmount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (Exception e) {
            throw new RuntimeException("No se puede convertir");
        }
    }
}
