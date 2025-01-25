package br.com.escolaVirtual.modelo;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Professor extends Pessoa{

    private String especialidade;
    private double salario;

    public Professor(int id, Long cpf, String nome, String email, String telefone, String especialidade, double salario) {
        super(id, cpf, nome, email, telefone);
        this.especialidade= especialidade;
        this.salario = salario;
    }
}
