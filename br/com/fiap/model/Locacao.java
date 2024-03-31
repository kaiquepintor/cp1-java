package br.com.fiap.model;
import java.util.Scanner;

public class Locacao {

    // Atributos Encapsulados

    private Cliente cliente;
    private Veiculo veiculo;
    private String dataInicio;
    private String dataTermino;

    // Construtor com Todos os Atributos

    public Locacao(Cliente cliente, Veiculo veiculo, String dataInicio, String dataTermino) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    // Construtor Padrão

    public Locacao() {}

    // Getters e Setters

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataTermino() {
        return dataTermino;
    }
    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    // Métodos

    public void escolherVeiculo(Veiculo veiculo1, Veiculo veiculo2) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número correspondente ao veículo desejado: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 1) {
            veiculo = veiculo1;
        } else if (escolha == 2) {
            veiculo = veiculo2;
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public void alugar() {
        if (veiculo.isDisponivel()) {
            veiculo.setDisponivel(false);
            System.out.println("                   Veiculo alugado com sucesso!                    ");
            System.out.println("=========================================================================");
            System.out.println("Veiculo : " + veiculo.getModelo() + " | Data de Inicio: " + dataInicio + " | Data de Termino: " + dataTermino);
        } else {
            System.out.println("       Veiculo não disponivel para locação no momento.          ");
            System.out.println("=========================================================================");
        }
    }

}


