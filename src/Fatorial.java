import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Digite um número inteiro para que seja calculado seu fatorial: ");
        int numero = leitura.nextInt();
        if (numero == 0) {
            System.out.println("O fatorial de 0 é 1.");
        } else {
            int fat = 1;
            for (int i = numero; i > 0; i--) {
                fat *= i;
            }
            System.out.println("O fatorial de " + numero + " é igual a " + fat);
        }
    }
}
