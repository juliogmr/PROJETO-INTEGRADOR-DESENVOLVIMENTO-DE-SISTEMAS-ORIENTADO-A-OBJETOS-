package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Professor extends PessoaFisica {

    private String matricula;

    private List<Disciplina> listaDisciplinas;

    public void inserirMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void excluirMatricula() {
        this.matricula = null;
    }

    public void alterarMatricula(String novaMatricula) {
        this.matricula = novaMatricula;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.listaDisciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
        this.listaDisciplinas.remove(disciplina);
    }
}
