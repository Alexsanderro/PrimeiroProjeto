import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

    public static void main(String[] args) {
        int tentativas = 0;
        int numeroDigitado;
        Scanner leitura = new Scanner(System.in);
        Random rand = new Random();
        int geradorDeNumeros = rand.nextInt(100);
        System.out.println(geradorDeNumeros);
        while (tentativas < 5 ) {
            System.out.println("Advinhe o numero que o gerador gerou, voce tem 5 tentativas: ");
            numeroDigitado = leitura.nextInt();
            tentativas ++;
            if (numeroDigitado < geradorDeNumeros){
                System.out.println("Numero digitado e menor que o numero gerado");
            } else if (numeroDigitado > geradorDeNumeros){
                System.out.println("Numero digitado e maior que o numero gerado");
            } else{
                System.out.println("Voce acertou!");
                break;
            }
        if (tentativas == 5) {
            System.out.println("Voce atingiu o numero de tentativas, o numero gerado foi " +geradorDeNumeros);
        }
        }
    }
}
