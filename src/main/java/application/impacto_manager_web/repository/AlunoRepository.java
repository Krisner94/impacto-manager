package application.impacto_manager_web.repository;

import application.impacto_manager_web.model.Aluno;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
@RequiredArgsConstructor
public class AlunoRepository {
   private final MongoTemplate mongoTemplate;
   private final String COLLECTION = "alunos";

   public Aluno save(Aluno aluno) {
      return mongoTemplate.save(aluno, COLLECTION);
   }

   public List<Aluno> findAll() {
      return mongoTemplate.findAll(Aluno.class, COLLECTION);
   }

   public Aluno findById(String id) {
      return mongoTemplate.findById(id, Aluno.class, COLLECTION);
   }

    public List<Aluno> findByNome(String nome) {
        return mongoTemplate.find(
            query(Criteria.where("nome").regex(nome, "i")),
            Aluno.class,
            COLLECTION
        );
    }

    public Aluno findByCpf(String cpf) {
        return mongoTemplate.findOne(
            query(Criteria.where("cpf").regex(cpf, "i")),
            Aluno.class,
            COLLECTION
        );
    }

    public void delete(Aluno aluno) {
        mongoTemplate.remove(aluno, COLLECTION);
    }
}