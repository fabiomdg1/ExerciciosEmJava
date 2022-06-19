//Faça um algoritmo que leia 3 números inteiros distintos
//e escreva o menor deles.
package Algoritmos;

import java.util.Scanner;
public class ExercicioAlgo_48 {
    public void menorNumero(){
        int a, b, c;
        int menor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita o primeiro numero: ");
        a = scanner.nextInt();

        System.out.print("Digita o segundo numero: ");
        b = scanner.nextInt();

        System.out.print("Digita o terceiro numero: ");
        c = scanner.nextInt();

        for(int i = 0; i < 3; i++){
            if(a < b) {
                menor = a;
            }else if(b < c) {
                menor = b;
            }else if(c < a) {
                menor = c;
            }
        }
        System.out.print("\nMenor numero = " + menor);
    }
}
