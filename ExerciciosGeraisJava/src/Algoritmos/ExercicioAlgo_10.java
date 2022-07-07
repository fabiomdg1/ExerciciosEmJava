//Faça um algoritmo que:
//a) Leia um número inteiro;
//b) Leia um segundo número inteiro;
//c) Efetue a adição dos dois valores;
//d) Apresente o valor calculado.
package Algoritmos;

import java.util.Scanner;

public class ExercicioAlgo_10 {
    Integer n1, n2, soma;
    Scanner scanner = new Scanner(System.in);
    public void soma(){

        System.out.print("Digite o primeiro numero: ");
        n1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = scanner.nextInt();

        System.out.println("A soma dos numero e: " + (n1 + n2));

    }
}
