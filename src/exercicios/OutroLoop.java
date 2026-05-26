package exercicios;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int cont = 0;

        while (nota != -1) {
            System.out.println("Qual sua avalição do filme? (Digite -1 para encerrar)");
            nota = leitura.nextDouble();
            if (nota != -1){
                media += nota;
                cont++;
            }
        }

        System.out.println("Media de avaliação: " + media/cont);
    }
}
