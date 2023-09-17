package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica extends Pessoa {

    private String cpf;

    private TipoPessoa tipo;

    public void inserirCPF(String cpf) {
        this.cpf = cpf;
    }

    public void excluirCPF() {
        this.cpf = null;
    }

    public void alterarCPF(String novoCPF) {
        this.cpf = novoCPF;
    }

    public void alterarTipo(TipoPessoa novoTipo) {
        this.tipo = novoTipo;
    }
}
