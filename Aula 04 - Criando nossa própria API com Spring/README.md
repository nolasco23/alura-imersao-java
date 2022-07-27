# Alura Stickers - Imersão Java - Alura

> Projeto desenvolvido durante a semana de Imersão Java da Alura durante os dias 18 a 22 de julho de 2022.
> Link vídeo: https://www.youtube.com/watch?v=srVV_6gA_Xg

## Aula 4 👨🏾‍💻⭐⭐

-  CRIANDO NOSSA PRÓPRIA API COM SPRING

### Desafios desta aula ✨⭐⭐
 1. Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
2. Devolver a listagem ordenada pelo ranking;
3. Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
4. Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
5. Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.

### Para executar o projeto
1. Inicialize o spring dentro do projeto linguagens-api e acesse http://localhost:8080/linguagens para visualizar o print do JSON de retorno abaixo.
2. Para gerar figurinhas por meio da API execute o main dentro do projeto alura-stickers

### Métodos de acesso (PRINT do POSTMAN)
![Screenshot from 2022-07-27 15-49-21](https://user-images.githubusercontent.com/32937333/181360077-8029471e-5189-49ad-8da4-2d2888cb64c2.png)

### Dados armazenados no MongoDB 
Para replicar altere o arquivo application.properties com a informações do seu BD de exemplo 
![Screenshot from 2022-07-27 10-18-07](https://user-images.githubusercontent.com/32937333/181360135-de6792e9-d65c-467b-989a-9fc340359bc5.png)
