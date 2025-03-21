package application.impacto_manager_web.repository;

import application.impacto_manager_web.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
    @Query("SELECT a FROM Turma a WHERE a.nome LIKE %:nome%")
    List<Turma> findByNome(@Param("nome") String nome);
}
