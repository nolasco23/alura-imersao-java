package br.com.alura.linguagensapi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.linguagensapi.Model.Linguagem;
import br.com.alura.linguagensapi.Repository.LinguagemRepository;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repository;

    @GetMapping("/linguagens")
    @ResponseStatus
    public ResponseEntity<List<Linguagem>> getLanguages() {
        return ResponseEntity.ok(repository.findAll(Sort.by(Order.by("ranking"))));
    }

    @PostMapping("/linguagens")
    @ResponseStatus(HttpStatus.CREATED)
    public Linguagem createLanguage(@RequestBody Linguagem language) {
        return repository.save(language);
    }

    @GetMapping("/linguagens/{id}")
    public ResponseEntity<Linguagem> getByIdLanguage(@PathVariable String id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/linguagens/{id}")
    public ResponseEntity<Linguagem> updateLanguage(@RequestBody Linguagem linguagem, @PathVariable String id) {

        Optional<Linguagem> linguagemOptional = repository.findById(id);
        if (linguagemOptional.isPresent()) {
            Linguagem existLanguage = linguagemOptional.get();
            existLanguage.setTitle(linguagem.getTitle());
            existLanguage.setImage(linguagem.getImage());
            existLanguage.setRanking(linguagem.getRanking());
            Linguagem savedLanguage = repository.save(existLanguage);
            return ResponseEntity.ok(savedLanguage);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/linguagens/{id}")
    public ResponseEntity<?> deleteLanguage(@PathVariable String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
