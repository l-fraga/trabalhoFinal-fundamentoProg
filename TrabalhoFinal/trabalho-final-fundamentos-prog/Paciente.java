package trabalho_final;

import java.util.Scanner;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String convenio;
    private String diagnostico;
    private int numeroConsultasMes;

    public Paciente() {
        this.nome = null;
        this.cpf = null;
        this.telefone = null;
        this.convenio = null;
        this.diagnostico = null;
        this.numeroConsultasMes = 0;
    }

    public double valorConsultas(double valor) {
        return valor = valor * this.getNumeroConsultasMes();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome() {
        Scanner in = new Scanner(System.in);
        String nomepaciente;
        System.out.println("Digite o nome do paciente: ");
        nomepaciente = in.next();
        this.nome = nomepaciente;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o CPF do paciente: ");
        String cpfpaciente = in.nextLine();
        this.cpf = cpfpaciente;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o telefone do paciente: ");
        String telefonepaciente = in.nextLine();
        this.telefone = telefonepaciente;
    }

    public String getConvenio() {
        return this.convenio;
    }

    public void setConvenio() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o convênio do paciente: ");
        String conveniopaciente = in.nextLine();
        this.convenio = conveniopaciente;
    }

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico() {
        Scanner in = new Scanner(System.in);
        String diagnostico;
        System.out.println("Digite o diagnóstico do paciente: ");
        diagnostico = in.nextLine();
        if (diagnostico.equalsIgnoreCase("Covid") || diagnostico.equalsIgnoreCase("Dengue")
                || diagnostico.equalsIgnoreCase("Influenza") || diagnostico.equalsIgnoreCase("Meningite")
                || diagnostico.equalsIgnoreCase("Outro")) {
            this.diagnostico = diagnostico;
            System.out.println("Diagnóstico definico como " + this.diagnostico);
        } else {
            System.out.println("Diagnóstico inválido. Definindo como 'Outro'.");
            this.diagnostico = "Outro";
        }
    }

    public int getNumeroConsultasMes() {
        return this.numeroConsultasMes;
    }

    public void setNumeroConsultasMes() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de consultas por mês do paciente: ");
        int numeroConsultas = in.nextInt();
        this.numeroConsultasMes = numeroConsultas;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", cpf='" + getCpf() + "'" +
                ", telefone='" + getTelefone() + "'" +
                ", convenio='" + getConvenio() + "'" +
                ", diagnostico='" + getDiagnostico() + "'" +
                ", numeroConsultasMes='" + getNumeroConsultasMes() + "'" +
                "}";
    }

}
