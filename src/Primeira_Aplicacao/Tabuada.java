import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numeroDigitado;
        int resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numeroDigitado = scanner.nextInt();

        System.out.println("--------Tabuada------");
        for (int i = 1; i <= 10; i++) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " * " + i + " = " + resultado);
        }
    }
}
