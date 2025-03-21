package application.impacto_manager_web.repository;

import application.impacto_manager_web.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Query("SELECT a FROM Professor a WHERE a.nome LIKE %:nome%")
    List<Professor> findByNome(@Param("nome") String nome);
}
