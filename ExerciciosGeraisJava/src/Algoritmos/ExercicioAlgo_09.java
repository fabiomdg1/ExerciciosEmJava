//Faça um algoritmo que:
//a) Leia o nome;
//b) Leia o sobrenome;
//c) Concatene o nome com o sobrenome;
//d) Apresente o nome completo.
package Algoritmos;

import java.util.Scanner;

public class ExercicioAlgo_09 {
    String nome;
    String sobreNome;
    Scanner scanner = new Scanner(System.in);

    public void concatenar(){
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobreNome = scanner.nextLine();

        System.out.print("Seu nome completo é: " + nome + sobreNome);

    }
}
