package br.com.senac.projetointegrador.domain.entity;

public enum TipoFornecedor {

    MATERIAL_ESCOLAR("Material Escolar"),
    EQUIPAMENTO_TECNOLOGICO("Equipamento Tecnológico"),
    MOBILIARIO("Mobiliário"),
    ALIMENTACAO("Alimentação"),
    LIVROS("Livros"),
    UNIFORME("Uniforme"),
    SERVICOS_DE_LIMPEZA("Serviços de Limpeza"),
    TRANSPORTE("Transporte Escolar");

    private final String descricao;

    TipoFornecedor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
