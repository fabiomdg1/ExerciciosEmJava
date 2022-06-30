//Escreva um algorímto que leia um nome e imprima-o de trás para frente.
package Strings;

import java.util.Scanner;

public class ExercicioStr_1 {
    public void inverterString(){
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        nome = scanner.nextLine();

        nome = String.valueOf(new StringBuilder(nome).reverse());

        System.out.println("O nome digitado foi: " + nome);
    }
}
