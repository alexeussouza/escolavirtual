package br.com.escolaVirtual.Respositorio;

import br.com.escolaVirtual.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno, Integer> {
}
