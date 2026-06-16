import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CepSearch {
    public Adress adressSearch(String cep) { //Lê-se: "métod público chamado adressSearch, que vai retornar um objeto do tipo Adress"
        //URI (Uniform Resource Identifier) -> voltado para identificar endereços/recursos, e isso inclui URLs da web.
        URI address = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        //HttpClient client = HttpClient.newHttpClient(); //Cria o cliente HTTP — é como o "telefone" que vai fazer a ligação para o servidor.
                    //request -> solicitar
        HttpRequest request = HttpRequest.newBuilder() //
                .uri(address) //vou fazer a requisição nesse endereço da API
                .build(); //fecha a ficha e entrega o HttpRequest pronto

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                            //request -> solicitar
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Adress.class);
        } catch (Exception e) { //Não é o ideal lançar sempre como Exception, porém como não conheço os possíveis problemas, deixa assim
            System.out.println("Erro: " + e.getMessage());
            throw new RuntimeException("Não foi possível obter o endereço a partir desse CEP.");
        }
    }
}
