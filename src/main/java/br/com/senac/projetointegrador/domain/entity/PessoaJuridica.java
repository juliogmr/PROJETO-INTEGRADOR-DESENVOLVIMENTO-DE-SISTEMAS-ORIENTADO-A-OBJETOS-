package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridica extends Pessoa {

    private String cnpj;

    private TipoPessoa tipo;

    public void inserirCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public void excluirCNPJ() {
        this.cnpj = null;
    }

    public void alterarCNPJ(String novoCNPJ) {
        this.cnpj = novoCNPJ;
    }

    public void alterarTipo(TipoPessoa novoTipo) {
        this.tipo = novoTipo;
    }
}
