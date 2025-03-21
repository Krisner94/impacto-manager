package application.impacto_manager_web.repository;

import application.impacto_manager_web.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    @Query("SELECT a FROM Aluno a WHERE a.cpf LIKE %:cpf%")
    List<Aluno> findByCpf(@Param("cpf") String cpf);

    @Query("SELECT a FROM Aluno a WHERE a.nome LIKE %:nome%")
    List<Aluno> findByNome(@Param("nome") String nome);
}
