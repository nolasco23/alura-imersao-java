package br.com.alura.linguagensapi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.alura.linguagensapi.Model.Linguagem;

 
 
public interface LinguagemRepository extends MongoRepository<Linguagem, String> {

}
