import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoLancamento = leitura.nextInt();
        System.out.println("Diga a sua valiação de 0 a 10 para o filme: ");
        double avaliacao = leitura.nextDouble();
        System.out.println("Filme: " + filme);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Nota de avaliação atribuída: " + avaliacao);
    }
}
