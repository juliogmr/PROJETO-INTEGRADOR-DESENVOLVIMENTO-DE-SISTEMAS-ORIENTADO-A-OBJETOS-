package br.com.senac.projetointegrador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private String nome;

    private LocalDateTime dataNascimento;

    private String endereco;

    public String getNome() {
        return nome;
    }

    public void inserirNome(String nome) {
        this.nome = nome;
    }

    public void alterarNome(String novoNome){
        this.nome = novoNome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void inserirDataNascimento(LocalDateTime data) {
        this.dataNascimento = data;
    }

    public void alterarDataNascimento(LocalDateTime data) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void inserirEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void alterarEndereco(String endereco) {
        this.endereco = endereco;
    }
}
