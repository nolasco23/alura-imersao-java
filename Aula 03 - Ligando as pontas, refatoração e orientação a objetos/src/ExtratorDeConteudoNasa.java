import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoNasa implements ExtratorDeConteudo{
    public List<Conteudo> extraiConteudos(String json)  {
        var parse = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parse.parse(json);

        List<Conteudo> listaConteudos = new ArrayList<>();

        for (Map<String, String> atributos : listaDeAtributos) {
            String titulo = atributos.get("title");
            String urlImagem = atributos.get("url");
            var conteudo = new Conteudo(titulo, urlImagem);

            listaConteudos.add(conteudo);
        }

        return listaConteudos;
    }
}
