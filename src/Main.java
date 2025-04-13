public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota do Filme: " + notaDoFilme);
        //Média calculada pelas 3 notas dos instrutores do curso
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);

//        if (media > 7) {
//            System.out.println("Filme muito bom!!!");
//        }
//
//        String senha = "12345";
//
//        if (senha.equals("12345")) {
//            System.out.println("Acesso permitido");
//        } else {
//            System.out.println("Acesso negado");
//        }
//
//        String nome = "Stephany";
//        int idade = 18;
//        double valor = 199.99;
//        int numeroAulas = 4;
//        System.out.println(String.format("Meu nome é %s, tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
//
//        System.out.println(String.format("""
//                Olá, %s.
//                Bem-vindo(a) ao curso de Java!
//                Teremos %d aulas para te formar um(a) desenvolvedor(a) completo(a)!
//                """, nome, numeroAulas));


    }
}