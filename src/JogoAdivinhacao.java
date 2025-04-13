import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int aleatorio = new Random().nextInt(100);
        int numeroLido;
        System.out.println("Bem-vindo(a) ao jogo do número secreto!");
        System.out.println("Tente adivinhar, em 5 tentativas, um número sorteado entre 0 e 100!");
        System.out.println("Posso lhe ajudar dando dicas! Boa sorte!!");
        Scanner leitura = new Scanner(System.in);

        for (int i = 5; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println("Você perdeu! =(");
                break;
            }
            System.out.println("Tentaivas restantes: " + i);
            System.out.println("Digite um número entre 1 e 100: ");
            numeroLido = leitura.nextInt();
            if (numeroLido == aleatorio) {
                System.out.println("Parabéns! Você acertou o número secreto!!!");
                break;
            } else {
                System.out.println("Você errou!");
                if (aleatorio > numeroLido) {
                    System.out.println("O número sorteado é maior que " + numeroLido);
                } else {
                    System.out.println("O número secreto é menor que " + numeroLido);
                }
            }
        }

        System.out.println("O número secreto é " + aleatorio);
    }
}