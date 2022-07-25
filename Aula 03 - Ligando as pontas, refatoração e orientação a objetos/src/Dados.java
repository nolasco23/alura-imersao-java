public enum Dados {

    IMDB("https://api.mocki.io/v2/549a5d8b",
            new ExtratorDeConteudoImdb()),
    IMDB2("https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060",
            new ExtratorDeConteudoImdb()),

    NASA("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-22&end_date=2022-06-25",
            new ExtratorDeConteudoNasa()),
    NASA2("https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json",
            new ExtratorDeConteudoNasa());

    private String url;
    private ExtratorDeConteudo extrator;

    Dados(String url, ExtratorDeConteudo extrator) {
        this.url = url;
        this.extrator = extrator;
    }

    public String url() {
        return url;
    }

    public ExtratorDeConteudo extrator() {
        return extrator;
    }

}