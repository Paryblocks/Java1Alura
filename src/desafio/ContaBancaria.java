package desafio;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome, tipoConta;
        double saldo, valor;
        Scanner ler = new Scanner(System.in);
        int op;

        System.out.println("Digite o nome do cliente: ");
        nome = ler.nextLine();

        System.out.println("Digite o tipo de conta do cliente: ");
        tipoConta = ler.nextLine();

        do {
            System.out.println("Digite o saldo inicial do cliente: ");
            saldo = ler.nextDouble();
            if (saldo < 0){
                System.out.println("Digite um valor positivo!");
            }
        }while (saldo < 0);


        System.out.println("""
                            Nome: %s
                            Tipo conta: %s
                            Saldo inicial: R$ %.2f
                            """.formatted(nome, tipoConta, saldo));

        do {
            System.out.println("""
                               Operações
                               
                               1 - Consultar saldos
                               2 - Receber valor
                               3 - Transferir valor
                               4 - Sair
                               """);
            op = ler.nextInt();
            switch (op){
                case 1:
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    valor = ler.nextDouble();
                    if (valor <= 0){
                        System.out.println("Digite um valor válido!");
                    } else {
                        saldo += valor;
                        System.out.println("O saldo atualizado é R$ " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    valor = ler.nextDouble();
                    if (valor > saldo){
                        System.out.println("Saldo insuficiente!");
                    } else {
                        if (valor <= 0){
                            System.out.println("Digite um valor válido!");
                        } else {
                            saldo -= valor;
                            System.out.println("O saldo atualizado é R$ " + saldo);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Fechando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (op != 4);
    }
}
