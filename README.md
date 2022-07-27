# alura-imersao-java 👨🏾
- Projeto desenvolvido durante a semana de Imersão Java da Alura durante os dias 18 a 22 de julho de 2022.
- Autor: 
 
## Aula 01 - Consumindo uma API de filmes com Java 👨🏾‍💻⭐

- Consumindo uma API de filmes com Java

### Desafios desta aula ✨

- Construir uma aplicação do zero para consumir a API do IMDb e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação, sem utilizar bibliotecas externas.

- Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.

- Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais! 

## Aula 02 - Gerando figurinhas para WhatsApp 👨🏾‍💻⭐⭐

- Gerando figurinhas para WhatsApp

### Desafios desta aula ✨⭐⭐

- Criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para enviar por Whatsapp os poster dos filmes preferidos!

1. Centralizar o texto na figurinha.
2. Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!
3. Criar diretório de saída das imagens, se ainda não existir.
4. Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
5. Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!
6. Colocar contorno (outline) no texto da imagem.
7. Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
8. Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
9. Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la.
10. Alterar texto de "Topzera" para a "Classicação do filme"

### Resultado
![Screenshot from 2022-07-27 17-04-15](https://user-images.githubusercontent.com/32937333/181362086-ab2e9d2c-c606-4d65-9cc3-8d1401b35fa1.png)
![Screenshot from 2022-07-27 17-04-04](https://user-images.githubusercontent.com/32937333/181362095-7f4d0925-186c-48e1-983f-4c048e9c64ea.png)


## Aula 03 - Ligando as pontas, refatoração e orientação a objetos 👨🏾‍💻⭐⭐⭐

- Ligando as pontas, refatoração e orientação a objetos

### Desafios desta aula ✨

1. Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16

2. Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP

3. Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra

4. Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado

5. Desafio supremo: consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente.
   Repositório com APIs públicas: https://github.com/public-apis/public-apis3

## Aula 04 - Criando nossa própria API com Spring 👨🏾‍💻⭐⭐⭐⭐
### Desafios desta aula ✨

-  CRIANDO NOSSA PRÓPRIA API COM SPRING

### Desafios desta aula ✨⭐⭐
 1. Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
2. Devolver a listagem ordenada pelo ranking;
3. Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
4. Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
5. Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.
 
 ### Resultado
 ![C#](https://user-images.githubusercontent.com/32937333/181361707-2106f6c3-0689-41e4-b5fa-5ef3d3cc6f84.png)
![GO](https://user-images.githubusercontent.com/32937333/181361712-3a098d6a-ba5f-4541-a067-458eebb282e8.png)
![JAVA](https://user-images.githubusercontent.com/32937333/181361713-e0fff075-33e0-4457-a26a-cbd44b0a9e31.png)

## Aula 05 - Publicando nossa API no Cloud 👨🏾‍💻⭐⭐⭐⭐⭐
### Desafios desta aula ✨
