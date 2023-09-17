package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor extends PessoaJuridica {

    private TipoFornecedor tipo;

    public void alterarTipo(TipoFornecedor novoTipo) {
        this.tipo = novoTipo;
    }
}
