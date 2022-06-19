/*
Escreva um algoritmo que, para uma conta bancária,
leia o seu número, o saldo, o tipo de operação a ser realizada (depósito ou retirada) e o valor da operação.
Após, determine e mostre o novo saldo.
Se o novo saldo ficar negativo, deve ser mostrada, também, a mensagem “conta estourada”.
 */

package Algoritmos;

import java.util.Random;
import java.util.Scanner;

public class ExercicioAlgo_45 {
    Random numeroConta = new Random();
    Random digitoConta = new Random();
    Random saldoConta = new Random();

    public void saldoBancario() {
        int numero = numeroConta.nextInt(10000);
        int digito = digitoConta.nextInt(10);
        double saldo = saldoConta.nextDouble(1000);
        double deposito = 0;
        double retirada = 0;
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conta:" + numero + "-" + digito);
        System.out.printf("Saldo: R$%.2f ", saldo);

        System.out.println("\n\nSelecione a operacao desejada:");
        System.out.println("Opcao 1 para Deposito");
        System.out.println("Opcao 2 para Retirada");

        System.out.print(": ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o valor para Deposito: ");
                deposito = scanner.nextDouble();
                saldo = saldo + deposito;
                System.out.printf("Seu novo saldo e de R$%.2f", saldo);
                break;
            case 2:
                System.out.print("Informe o valor para Retirada: ");
                retirada = scanner.nextDouble();
                saldo = saldo - retirada;
                if(saldo < 0){
                    System.out.printf("Conta estourada, seu saldo e de R$%.2f", saldo);
                }else {
                    System.out.printf("Seu novo saldo e de R$%.2f", saldo);
                }

                break;
            default:
                System.out.println("Digite uma opcao entre 1 e 2");
        }
    }
}
