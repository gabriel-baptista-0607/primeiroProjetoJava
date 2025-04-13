import java.util.Scanner;

public class Geometria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double lado, raio, area;
        System.out.println("""
                Digite uma das opções de cálculos geométricos: 
                1 - Calcular área do quadrado
                2 - Calcular área do Círculo
                """);
        int opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do lado do quadrado");
                lado = leitura.nextDouble();
                area = lado * lado;
                System.out.println("A área do quadrado é igual a " + area + "m².");
                break;
            case 2:
                System.out.println("Digite o valor do raio do círculo");
                raio = leitura.nextDouble();
                area = 3.14159265359*(raio*raio);
                System.out.println("A área do círculo é igual a " + area + "m².");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
