import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        int numeroDigitado;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numeroDigitado = leitura.nextInt();
        if (numeroDigitado < 0){
            System.out.println("Este numero e negativo");
        } else {
            System.out.println("Este numero e positivo");
        }
    }
}
