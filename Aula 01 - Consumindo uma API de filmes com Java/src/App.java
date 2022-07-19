import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // Top250Data
        // String url = "https://imdb-api.com/en/API/Top250Movies/k_kdi6x9hg";

        // MostPopularData
        // String url = "https://imdb-api.com/en/API/MostPopularMovies/k_kdi6x9hg";
        String url = "https://api.mocki.io/v2/549a5d8b";

        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
  
        for (Map<String, String> filme : listaDeFilmes) {
            System.out.println("Título: " + filme.get("title"));
            System.out.println("Poster: " + filme.get("image")); 

            if (filme.get("imDbRating") == null || filme.get("imDbRating").length() == 0) {
                System.out.print("\u2620");
            } else {
                var numberRating = (int) Math.round(Double.parseDouble(filme.get("imDbRating")));
                System.out.print("Classificação: ");
                for (int j = 0; j < numberRating; j++) {
                    System.out.print("\u2B50");
                }
                System.out.print("\u001b[97m \u001b[104m" + filme.get("imDbRating") + " \u001b[m");

            }
            System.out.println("\n");

        }
    }
}
