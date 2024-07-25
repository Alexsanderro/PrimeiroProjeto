import java.util.Scanner;

public class QuadradoCirculo {
    public static void main(String[] args) {
        int opcaoUsuario;
        Scanner letura = new Scanner(System.in);
        System.out.println("""
                Menu:
                1 - Calcular a area de um quadrado
                2 - Calcular a area de um triangulo
                Escolha uma opcao:""");

        opcaoUsuario = letura.nextInt();

        if (opcaoUsuario == 1) {
            int base;
            int altura;
            int areaquadrado;
            Scanner leitura = new Scanner(System.in);
            System.out.println("Qual a base do quadrado: ");
            base = leitura.nextInt();
            System.out.println("Qual a altura do quadrado: ");
            altura = leitura.nextInt();
            areaquadrado = base * altura;
            System.out.println("A area do quadrado e: "+ areaquadrado);
        } else {
            int raio;
            double areacirculo;
            double pi = 3.14;
            double elevado;
            Scanner leitura = new Scanner(System.in);
            System.out.println("Qual o raio do circulo: ");
            raio = leitura.nextInt();
            elevado = Math.pow(raio, 2);
            areacirculo = pi * elevado;
            System.out.println("O raio de um circulo e: " + areacirculo);
        }
    }
}
