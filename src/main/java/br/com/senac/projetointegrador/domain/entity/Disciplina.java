package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {

    private String nome;

    private Integer cargaHoraria;

    public void inserirNome(String nome) {
        this.nome = nome;
    }

    public void excluirNome() {
        this.nome = null;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void inserirCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void excluirCargaHoraria() {
        this.cargaHoraria = 0;
    }

    public void alterarCargaHoraria(int novaCargaHoraria) {
        this.cargaHoraria = novaCargaHoraria;
    }
}
