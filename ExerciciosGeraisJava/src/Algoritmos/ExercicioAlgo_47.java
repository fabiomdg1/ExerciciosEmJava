//Construir um algoritmo que tome como entradas três valores distintos
//e os apresente (imprima) em ordem crescente (menor para o maior).
package Algoritmos;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioAlgo_47 {
    public void ordenarNumOrdemCrescente(){
        int a,b,c;
        int vetor[] = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite o primeiro numero: ");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite o primeiro numero: ");
        vetor[2] = scanner.nextInt();

        //Ordenando vetor
        Arrays.sort(vetor);

        System.out.print("Dados exibidos em ordem crescente = ");
        for(int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
