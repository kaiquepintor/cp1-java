package br.com.fiap.model;

public class Cliente {

    // Atributos Encapsulados

    private String nome;
    private String cpf;
    private String contato;

    // Construtor com Todos os Atributos

    public Cliente(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    // Construtor Padrão

    public Cliente() {}

    // Getters e Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }

    // Métodos

    public void registrar() {
        System.out.println("                   Cliente cadastrado com sucesso!                    ");
    }
}

