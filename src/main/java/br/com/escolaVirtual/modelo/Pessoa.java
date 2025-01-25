package br.com.escolaVirtual.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Pessoa {

   @Id
    private int id;
    private Long cpf;
    private String nome;
    private String email;
    private String telefone;

}
