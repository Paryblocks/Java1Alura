public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        String filme = "Indiana Jones e a Última Cruzada";

        int ano = 1989;
        //System.out.println("Ano de lançamento: " + ano);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        // Exemplo de casting explicito
        int estrelas = (int) (media/2);
        //System.out.println(String.format("%.1f", media));

        String sinopse;
        sinopse = """
                  %s
                  Filme de aventura dos anos 80
                  Classificação: %d estrelas
                  Ano de lançamento: %d
                  """.formatted(filme, estrelas, ano);

        System.out.println(sinopse);


    }
}