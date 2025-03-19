package application.impacto_manager_web.repository;

import application.impacto_manager_web.model.Turma;
import com.mongodb.client.MongoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TurmaRepository{
    private final MongoTemplate mongoTemplate;
    private final String COLLECTION = "turma";
    private final MongoClient mongo;

    public Turma save(Turma turma){
        return mongoTemplate.save(turma, COLLECTION);
    }

    public List<Turma> findAll(){
        return mongoTemplate.findAll(Turma.class, COLLECTION);
    }

    public Turma findById(String id){
        return mongoTemplate.findById(id, Turma.class, COLLECTION);
    }

    public void delete(Turma turma){
        mongoTemplate.remove(turma, COLLECTION);
    }

}
