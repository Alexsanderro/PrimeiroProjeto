import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int opcao = 0;
        double transferir;
        double receber;
        double saldo = 2500;
        System.out.println("""
                -------------DADOS DO CLIENTE-------------
                Nome:           Alexsander Rodrigues
                Tipo conta:     Corrente"
                Saldo Inicial:  R$ 2500,00
                
                """);
        while (opcao != 4) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("""
                Operacoes:
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opcao desejada:""");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo e de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja receber:");
                receber = scanner.nextDouble();
                saldo += receber;
                System.out.println("Valor recebido com sucesso! Seu novo saldo e de " + saldo);
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                transferir = scanner.nextDouble();
                saldo -= transferir;
                if (transferir > saldo){
                    System.out.println("O valor solicitado e maior que o saldo, Tente novamente!");
                } else {
                    System.out.println("Valor transferido com sucesso! Seu novo saldo e de " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Sistema Fechado!");
            } else {
                System.out.println("Opcao invalida, tente novamente!");
            }
        }
    }
}
