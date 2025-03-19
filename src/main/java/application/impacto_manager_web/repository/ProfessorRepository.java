package application.impacto_manager_web.repository;

import application.impacto_manager_web.model.Professor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
@RequiredArgsConstructor
public class ProfessorRepository {
    private final MongoTemplate mongoTemplate;
    private final String COLLECTION = "professores";

    public Professor save(Professor professor) {
        return mongoTemplate.save(professor, COLLECTION);
    }

    public List<Professor> findAll() {
        return mongoTemplate.findAll(Professor.class, COLLECTION);
    }

    public Professor findById(String id) {
        return mongoTemplate.findById(id, Professor.class, COLLECTION);
    }

    public List<Professor> findByNome(String nome) {
        return mongoTemplate.find(
            query(Criteria.where("nome").regex(nome, "i")),
            Professor.class,
            COLLECTION
        );
    }

    public void delete(Professor professor) {
        mongoTemplate.remove(professor, COLLECTION);
    }
}
