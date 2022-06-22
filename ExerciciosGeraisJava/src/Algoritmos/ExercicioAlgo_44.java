/*
Uma sorveteria vende três tipos de picolés.
Sabendo-se que o valor do picolé é:
tipo 1 R$0.50,
tipo 2 R$0.60,
tipo 3 R$0.75,
faça um algoritmo que, para cada tipo de picolé, mostre a quantidade vendida e o total arrecadado.
*/
package Algoritmos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ExercicioAlgo_44 {

    String tipo1, tipo2, tipo3;
    int tipo = 0;
    int quantidade = 0;
    double valorTipo1 = 0.50;
    double valorTipo2 = 0.60;
    double valorTipo3 = 0.75;
    Scanner scanner = new Scanner(System.in);

    public void vendasPicole(){
        System.out.println("-------------------Menu--------------------");
        System.out.println("Picole tipo 1 - R$0,50");
        System.out.println("Picole tipo 2 - R$0,60");
        System.out.println("Picole tipo 3 - R$0,75");
        System.out.println("-------------------------------------------");

        System.out.print("Escolha o tipo do picole: ");
        tipo = scanner.nextInt();

        System.out.print("Escolha a quantidade: ");
        quantidade = scanner.nextInt();

        switch (tipo){
            case 1:
                System.out.println("-------------------Fechamento do pedido--------------------");
                System.out.printf("O tipo escolhido foi: Tipo 1");
                System.out.printf("\nQuantidade: %d",quantidade);
                System.out.printf("\nValor total: R%.2f: ",valorTipo1 * quantidade);
                System.out.println("\n-----------------------------------------------------------");
                break;

            case 2:
                System.out.println("-------------------Fechamento do pedido--------------------");
                System.out.printf("O tipo escolhido foi: Tipo 2");
                System.out.printf("\nQuantidade: %d",quantidade);
                System.out.printf("\nValor total: R%.2f: ",valorTipo2 * quantidade);
                System.out.println("\n-----------------------------------------------------------");
                break;

            case 3:
                System.out.println("-------------------Fechamento do pedido--------------------");
                System.out.printf("O tipo escolhido foi: Tipo 3");
                System.out.printf("\nQuantidade: %d",quantidade);
                System.out.printf("\nValor total: R%.2f: ",valorTipo3 * quantidade);
                System.out.println("\n-----------------------------------------------------------");
                break;

            default:
                break;
        }
    }
}
