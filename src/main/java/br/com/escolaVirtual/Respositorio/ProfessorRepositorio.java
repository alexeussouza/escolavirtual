package br.com.escolaVirtual.Respositorio;


import br.com.escolaVirtual.modelo.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepositorio extends JpaRepository<Professor, Integer> {
}
