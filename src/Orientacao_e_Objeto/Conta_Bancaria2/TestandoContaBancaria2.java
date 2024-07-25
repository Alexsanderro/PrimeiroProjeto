package Orientacao_e_Objeto;

import java.util.Scanner;

public class TestandoContaBancaria2 {
    public static void main(String[] args) {
        int resposta = 0;
        int depositaSaldo;
        int sacarSaldo;
        Scanner scanner = new Scanner(System.in);
        ContaCorrente contaBancaria2 = new ContaCorrente();

        contaBancaria2.setNome("Alexsander");
        contaBancaria2.setTipodeConta("Conta Corrente");

        contaBancaria2.fichaTecnica();
        contaBancaria2.cobrarTarifaMensal();

        while (true){
            System.out.println("-------Menu-------");
            System.out.println("""
                1 - Depositar
                2 - Sacar
                3 - Consultar Saldo
                4 - Sair
                Escolha uma opcao:""");
            resposta = scanner.nextInt();

            if (resposta == 1){
                System.out.println("Quanto voce quer depositar? ");
                depositaSaldo = scanner.nextInt();
                contaBancaria2.depositar(depositaSaldo);
                System.out.println("Seu novo saldo e: "+contaBancaria2.getSaldo());
            }

            else if (resposta == 2) {
                System.out.println("Quanto voce quer sacar?");
                sacarSaldo = scanner.nextInt();
                if (sacarSaldo > contaBancaria2.getSaldo()){
                    System.out.println("Saldo insuficiente, tente novamente");
                }

                else {
                    contaBancaria2.sacar(sacarSaldo);
                    System.out.println("Saque realizado! Seu novo saldo e: " +contaBancaria2.getSaldo());
                }
            }

            else if (resposta == 3) {
                System.out.println("Seu saldo e de: "+contaBancaria2.getSaldo());
            }

            else if (resposta == 4) {
                System.out.println("Encerrando Programa...");
                break;
            }

            else {
                System.out.println("Esta opcao nao existe, tente novamente!");
            }
        }
    }
}
