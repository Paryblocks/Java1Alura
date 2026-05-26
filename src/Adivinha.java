import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int num = new Random().nextInt(100);
        int chute, tentativas = 5;
        Scanner scan = new Scanner(System.in);

        while (tentativas > 0){
            System.out.println("Qual o número secreto? ");
            chute = scan.nextInt();

            if (chute == num){
                System.out.println("Parabens! Você acertou!");
                break;
            } else if (chute > num) {
                System.out.println("Errou! É um número menor!");
            } else {
                System.out.println("Errou! É um número maior!");
            }
            tentativas--;
            if (tentativas > 0){
                System.out.println(tentativas + " tentativas restantes!");
            }else {
                System.out.println("Uma pena! O número secreto era " + num + "!");
            }
        }
    }
}
