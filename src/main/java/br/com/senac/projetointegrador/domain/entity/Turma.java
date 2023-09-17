package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turma {

    private String numero;

    private Disciplina disciplina;

    private Professor professor;

    public void inserirNumero(String numero) {
        this.numero = numero;
    }

    public void excluirNumero() {
        this.numero = null;
    }

    public void alterarNumero(String novoNumero) {
        this.numero = novoNumero;
    }

    public void alterarDisciplina(Disciplina novaDisciplina) {
        this.disciplina = novaDisciplina;
    }

    public void alterarProfessor(Professor novoProfessor) {
        this.professor = novoProfessor;
    }
}
