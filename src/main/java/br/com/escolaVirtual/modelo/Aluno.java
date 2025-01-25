package br.com.escolaVirtual.modelo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    @Entity
    public class Aluno extends Pessoa{
        private Long matricula;
        private int serie;

        public Aluno(int id, Long cpf, String nome, String email, String telefone, Long matricula, int serie) {
            super(id, cpf, nome, email, telefone);
            this.matricula=matricula;
            this.serie=serie;

        }

}
