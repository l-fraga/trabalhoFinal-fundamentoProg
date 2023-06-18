package trabalho_final;

import java.util.Scanner;

import java.util.Arrays;

public class CadastroPacientes {

    private Paciente[] paciente;

    private int count;

    public CadastroPacientes() {
        paciente = new Paciente[10];
        count = 0;
    }

    public String inserirPaciente(Paciente p) {
         if (count < paciente.length) {
            paciente[count] = p;
            p.setNome();
            p.setCpf();
            p.setTelefone();
            p.setConvenio();
            p.setDiagnostico();
            p.setNumeroConsultasMes();
            count++;
            return "Paciente inserido com sucesso!";
        }
        return "Paciente não pode ser inserido!";
    }

    public void removerPaciente() {
        if (count == 0) {
            System.out.println("Não há pacientes cadastrados. Por favor, insira um paciente primeiro.");
            return;
        }
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do paciente a ser removido: ");
        String nome = scanner.nextLine();
    
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (paciente[i].getNome().equalsIgnoreCase(nome)) {
                index = i;
                break;
            }
        }
    
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                paciente[i] = paciente[i + 1];
            }
            paciente[count - 1] = null;
            count--;
            System.out.println("Paciente removido com sucesso!");
        } else {
            System.out.println("Paciente não existe e por isso não pode ser removido. Digite outro paciente.");
        }
    }
    
    

    public void imprimeVetor() {
        for (int i = 0; i < paciente.length; i++) {
            System.out.println(paciente[i]);
        }
        System.out.println();
    }

    public void odemAlfabetica() {
        Paciente[] sortedPacientes = Arrays.copyOf(paciente, count);
        Arrays.sort(sortedPacientes, (p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
        System.out.println("====Nomes em ordem alfabética====");
        int num = 0;
        for (Paciente p : sortedPacientes) {
            System.out.println(num + 1 + ". " + p.getNome());
            num++;
        }
        System.out.println();
    }

    public double mediaConsultas() {
        if (count == 0) {
            return 0;
        }

        double soma = 0;
        for (int i = 0; i < count; i++) {
            soma += paciente[i].getNumeroConsultasMes();
        }

        return soma / count;
    }

    public void calcularPorcentagemPacientes() {
        if (count == 0) {
            System.out.println("Não há pacientes cadastrados.");
            return;
        }

        int countCovid = 0;
        int countDengue = 0;
        int countInfluenza = 0;
        int countMeningite = 0;
        int countOutro = 0;

        for (int i = 0; i < count; i++) {
            String diagnostico = paciente[i].getConvenio();

            if (diagnostico.equalsIgnoreCase("Covid")) {
                countCovid++;
            } else if (diagnostico.equalsIgnoreCase("Dengue")) {
                countDengue++;
            } else if (diagnostico.equalsIgnoreCase("Influenza")) {
                countInfluenza++;
            } else if (diagnostico.equalsIgnoreCase("Meningite")) {
                countMeningite++;
            } else {
                countOutro++;
            }
        }

        int totalPacientes = count;
        double percentCovid = (countCovid / (double) totalPacientes) * 100;
        double percentDengue = (countDengue / (double) totalPacientes) * 100;
        double percentInfluenza = (countInfluenza / (double) totalPacientes) * 100;
        double percentMeningite = (countMeningite / (double) totalPacientes) * 100;
        double percentOutro = (countOutro / (double) totalPacientes) * 100;

        System.out.println("\n===== Porcentagem de Pacientes =====");
        System.out.println("Covid: " + percentCovid + "%");
        System.out.println("Dengue: " + percentDengue + "%");
        System.out.println("Influenza: " + percentInfluenza + "%");
        System.out.println("Meningite: " + percentMeningite + "%");
        System.out.println("Outro: " + percentOutro + "%");
    }

}
