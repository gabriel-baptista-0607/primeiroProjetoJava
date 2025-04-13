import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Digite dois números inteiros para que o programa os compare: ");
        int n1 = leitura.nextInt();
        int n2 = leitura.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número " + n1 + " é maior que o segundo número " + n2);
        } else if (n1 < n2) {
            System.out.println("O segundo número " + n2 + " é maior que o primeiro número " + n1);
        } else {
            System.out.println("Os números digitados " + n1 + " e " + n2 + " são iguais.");
        }
    }
}
