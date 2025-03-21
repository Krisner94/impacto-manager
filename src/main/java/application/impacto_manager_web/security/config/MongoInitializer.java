package application.impacto_manager_web.security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@RequiredArgsConstructor
public class MongoInitializer {

    // Adicione o modificador final para garantir a injeção via construtor
    private final MongoTemplate mongoTemplate;

    @Bean
    public CommandLineRunner ensureCollections() {
        return args -> {
            // Lista de coleções que devem existir
            String[] collections = {"customer", "authority", "alunos", "professores", "turma"};

            for (String collection : collections) {
                if (!mongoTemplate.collectionExists(collection)) {
                    mongoTemplate.createCollection(collection);
                    System.out.println("Coleção criada: " + collection);
                } else {
                    System.out.println("Coleção já existe: " + collection);
                }
            }
        };
    }
}