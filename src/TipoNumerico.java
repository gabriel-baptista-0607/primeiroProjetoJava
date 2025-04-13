import java.util.Scanner;

public class TipoNumerico {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numeroDigitado = leitura.nextInt();
        if (numeroDigitado > 0) {
            System.out.println("O número " + numeroDigitado + " é positivo.");
        } else if (numeroDigitado < 0) {
            System.out.println("O número " + numeroDigitado + " é negativo.");
        } else {
            System.out.println("O número " + numeroDigitado + " é nulo.");
        }
    }
}
