package br.com.fiap.view;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Veiculo;
import br.com.fiap.model.Locacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando Cliente

        Cliente cliente = new Cliente();

        // Criando Veiculos

        Veiculo veiculo1 = new Veiculo("IKK3L11", "Porsche Taycan", 2023);
        veiculo1.setDisponivel(false);
        Veiculo veiculo2 = new Veiculo("SCC9G12", "Polo", 2024);

        // Realizando uma Locação

        Locacao locacao = new Locacao(cliente, veiculo2, "01/03/2024", "05/03/2024");

        System.out.println("=========================================================================");
        System.out.println("                         Bem vindo a Locadora Car                        ");
        System.out.println("=========================================================================");

        Scanner scanner = new Scanner(System.in);

        // Área de Cadastro

        System.out.println("Insira o nome do cliente: ");
        String nomeAdicionar = scanner.nextLine();
        cliente.setNome(nomeAdicionar);

        System.out.println("Insira o cpf do cliente: ");
        String cpfAdicionar = scanner.nextLine();
        cliente.setNome(cpfAdicionar);

        System.out.println("Insira o número/email do cliente: ");
        String contatoAdicionar = scanner.nextLine();
        cliente.setContato(contatoAdicionar);

        cliente.registrar();
        System.out.println("=========================================================================");

        // Área de Escolha dos Veiculos

        System.out.println("Escolha um veículo:");
        System.out.println("1 - " + veiculo1.getModelo() + " " + veiculo1.getAno());
        System.out.println("2 - " + veiculo2.getModelo() + " " + veiculo2.getAno());

        locacao.escolherVeiculo(veiculo1, veiculo2);
        locacao.alugar();



    }
}
