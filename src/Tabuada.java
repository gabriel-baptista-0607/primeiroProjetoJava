import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro para saber sua tabuada dele: ");
        int numero = leitura.nextInt();
        System.out.println("A tabuada de " + numero + " é: ");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "X" + i + "=" + numero*i);
        }
    }
}
