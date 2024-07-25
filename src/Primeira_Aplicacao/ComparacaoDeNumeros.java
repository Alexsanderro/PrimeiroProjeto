import java.util.Scanner;

public class ComparacaoDeNumeros {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        numero1 = leitura.nextInt();
        System.out.println("Digite o Segundo numero: ");
        numero2 = leitura.nextInt();

        if (numero1 != numero2){
            System.out.println("Os numeros sao diferentes");
            if (numero1 < numero2){
                System.out.println("O primeiro numero e menor que o segundo numero");
            } else {
                System.out.println("O primeiro numero e maior que o segundo numero");
            }
        } else {
            System.out.println("Os numeros sao iguais");
        }
    }
}
