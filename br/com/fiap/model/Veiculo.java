package br.com.fiap.model;

public class Veiculo {

    // Atributos Encapsulados

    private String placa;
    private String modelo;
    private boolean disponivel;
    private int ano;

    // Construtor com Todos os Atributos

    public Veiculo(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.disponivel = true;
        this.ano = ano;
    }

    // Construtor padrão

    public Veiculo() {}

    // Getters e Setters

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}
