import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int count = 0;
        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar:  ");
            nota = leitura.nextDouble();
            if (nota == -1) {
                break;
            }
            mediaAvaliacao += nota;
            count++;
        }
        if (count == 0) {
            System.out.println("Não foram digitadas notas no programa.");
        } else {
            System.out.println("Média de avaliações = " + mediaAvaliacao/count);
        }
    }
}
