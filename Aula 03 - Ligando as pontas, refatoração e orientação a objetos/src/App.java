import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
 
        // String url = "https://api.mocki.io/v2/549a5d8b";
        String url = "https://api.nasa.gov/planetary/apod?api_key=T0S23X4xHtMXen2tsDoHujjosZTH14scfOXhE7m7";

        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        for (Map<String, String> filme : listaDeFilmes.subList(0, listaDeFilmes.size())) {
            String texto = "Classificação: ";
            System.out.println("Título: " + filme.get("title"));
            System.out.println("Poster: " + filme.get("url"));
            
            if (filme.get("imDbRating") == null || filme.get("imDbRating").length() == 0) {
                System.out.print("\u2620");
            } else {
                var numberRating = (int) Math.round(Double.parseDouble(filme.get("imDbRating")));
                 for (int j = 0; j < numberRating; j++) {
                     texto += "\u2B50";
                }
       

                texto += "\u001b[97m \u001b[104m" + filme.get("imDbRating") + " \u001b[m";
                System.out.println(texto);
                
                String urlImage = filme.get("url");
                InputStream inputStream = new URL(urlImage).openStream();
                var generate = new GeradoraDeFigurinhas();
                generate.create(inputStream, filme.get("title"), "Classificação: " + filme.get("imDbRating"));

            }
            System.out.println("\n");

        }
    }
}
