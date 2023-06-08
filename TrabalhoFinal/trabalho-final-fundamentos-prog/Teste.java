package trabalho_final;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPacientes cadastro = new CadastroPacientes();

        int opcao;
        do {
            System.out.println();
            System.out.println("===== Menu de Opções =====");
            System.out.println("1. Inserir Paciente");
            System.out.println("2. Remover Paciente");
            System.out.println("3. Imprimir Nomes em Ordem Alfabética");
            System.out.println("4. Calcular Média de Consultas");
            System.out.println("5. Calcular Porcentagem de Pacientes com: Covid; Dengue; Influenza; Meningite; Outro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Paciente novoPaciente = new Paciente();
                    cadastro.inserirPaciente(novoPaciente);
                    break;
                case 2:
                    cadastro.removerPaciente();
                    break;
                case 3:
                    cadastro.odemAlfabetica();
                    break;
                case 4:
                    double mediaConsultas = cadastro.mediaConsultas();
                    System.out.println("Média de consultas: " + mediaConsultas);
                    break;
                case 5:
                    cadastro.calcularPorcentagemPacientes();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
