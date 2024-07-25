package Orientacao_e_Objeto;

public class TestarContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(3);
        conta.setSaldo(3000);
        conta.titular = "Alexsander";

        System.out.println("Titular da conta e: "+conta.titular);
        System.out.println("Numero da conta e: "+conta.getNumeroConta());
        System.out.println("Saldo da conta e: "+conta.getSaldo());
    }
}
