package Api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class Call {

    private static String apiKey = "e4780be8-044b-4851-824e-6ccafee19a41";
    private static String uri = "https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/listings/latest"; // Corrigido: uri aqui
    private static HttpResponse<String> response;
    private static HttpRequest request;

    private static void Conexao() {
        request = HttpRequest.newBuilder()
                    .uri(URI.create(uri)) // Corrigido: usando uri aqui
                    .header("X-CMC_PRO_API_KEY", apiKey) // Adicionando cabeçalho da chave da API
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
    }

    public static String Get() {
        try {
            Conexao(); 
            response =  HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            if (response != null) {
                System.out.println("Resposta da requisição GET:");
                System.out.println(response.body()); // Corrigido: Imprimir o corpo da resposta, não da requisição
                return response.body();
            } else {
                System.out.println("Não houve resposta da requisição.");
                return null;
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao fazer a requisição: " + e.getMessage());
            return null;
        }
    }
}