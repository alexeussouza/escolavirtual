package br.com.escolaVirtual.controller;

import br.com.escolaVirtual.Respositorio.AlunoRepositorio;
import br.com.escolaVirtual.modelo.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoRepositorio alunoRepositorio;

    @GetMapping()
    public List<Aluno> listarAluno() {

        return alunoRepositorio.findAll();
    }
    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno aluno) {

        return alunoRepositorio.save(aluno);
    }
    @PutMapping("/{id}")
    public Aluno alterarAluno(@RequestBody Aluno aluno){
        return alunoRepositorio.save(aluno);
    }
    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Integer id){
        alunoRepositorio.deleteById(id);
    }
}