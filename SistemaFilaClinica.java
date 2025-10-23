import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemaFilaClinica {
    private Queue<String> filaDeEspera;
    public SistemaFilaClinica() {
        filaDeEspera = new LinkedList<>();
    }

    public void adicionarPaciente(String nomePaciente) {
        filaDeEspera.add(nomePaciente);
        System.out.println(nomePaciente + " foi adicionado à fila de espera.");
    }
    
    public void atenderProximoPaciente() {
        if (filaDeEspera.isEmpty()) {
            System.out.println("Não há pacientes na fila de espera.");
        } else {
            String pacienteAtendido = filaDeEspera.poll();
            System.out.println(pacienteAtendido + " foi atendido(a).");
        }
    }
    
    public void exibirFilaDeEspera() {
        if (filaDeEspera.isEmpty()) {
            System.out.println("A fila de espera está vazia.");
        } else {
            System.out.println("\nOrdem de Atendimento:");
            int posicao = 1;
            for (String paciente : filaDeEspera) {
                System.out.println(posicao + "º - " + paciente);
                posicao++;
            }
        }
    }
    
    public static void main(String[] args) {
        SistemaFilaClinica sistema = new SistemaFilaClinica();
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Sistema de Fila de Espera - Clínica Médica");
        System.out.println("------------------------------------------");
      
        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Adicionar paciente à fila");
            System.out.println("2 - Atender próximo paciente");
            System.out.println("3 - Exibir fila de espera");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            switch (opcao) {
                case 1:
                System.out.print("Digite o nome do paciente: ");
                String nomePaciente = scanner.nextLine();
                sistema.adicionarPaciente(nomePaciente);
                break;
                
                case 2:
                sistema.atenderProximoPaciente();
                break;
                
                case 3:
                sistema.exibirFilaDeEspera();
                break;

                case 4:
                System.out.println("Encerrando o sistema...");
                scanner.close();
                System.exit(0);
                
                default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
