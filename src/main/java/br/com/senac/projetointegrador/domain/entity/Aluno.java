package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Aluno extends PessoaFisica {

    private String matricula;

    private Turma turma;

    public void inserirMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void excluirMatricula() {
        this.matricula = null;
    }

    public void alterarMatricula(String novaMatricula) {
        this.matricula = novaMatricula;
    }

    public void alterarTurma(Turma novaTurma) {
        this.turma = novaTurma;
    }
}
