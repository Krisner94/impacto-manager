package application.impacto_manager_web.repository;

import application.impacto_manager_web.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
