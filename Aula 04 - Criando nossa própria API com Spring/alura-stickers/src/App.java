import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

   
        Dados dados = Dados.LOCAL;
 
        var http = new ClienteHttp();
        String json = http.buscaDados(dados.url());

        List<Conteudo> conteudos = dados.extrator().extraiConteudos(json);

        var generate = new GeradoraDeFigurinhas();
        for (Conteudo conteudo : conteudos) {
            System.out.println("Título: " + conteudo.getTitulo());
            System.out.println("URL: " + conteudo.getUrlImagem()); 

            String urlImage = conteudo.getUrlImagem();
            InputStream inputStream = new URL(urlImage).openStream();

            generate.create(inputStream, conteudo.getTitulo(), conteudo.getTitulo());

            System.out.println();
        }
    }
}
