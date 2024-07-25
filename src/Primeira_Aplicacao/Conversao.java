public class Conversao {

    public static void main(String[] args) {
        int temperatura = 50;
        double conversao = (temperatura * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit e: " + conversao);
        int conversaoInteira = (int) (conversao);
        System.out.println(conversaoInteira);
    }
}
