package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Nota {

    private Double nota;
    private Aluno aluno;
    private Disciplina disciplina;

    public void inserirValor(Double valor) {
        this.nota = valor;
    }

    public void excluirValor() {
        this.nota = 0.0;
    }

    public void alterarValor(Double novoValor) {
        this.nota = novoValor;
    }

    public void alterarAluno(Aluno novoAluno) {
        this.aluno = novoAluno;
    }

    public void alterarDisciplina(Disciplina novaDisciplina) {
        this.disciplina = novaDisciplina;
    }
}

