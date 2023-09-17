package br.com.senac.projetointegrador.domain.entity;

public enum TipoPessoa {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    NAO_BINARIO("Não-binário");

    private final String descricao;

    TipoPessoa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

