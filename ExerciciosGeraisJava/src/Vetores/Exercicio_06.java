//Criar um vetor A com 10 elementos inteiros.
// Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor.
package Vetores;
public class Exercicio_06 {
    public void somarIemsVetor(){
        int vetor[] = {1,1,1,1,1,1,1,1,1,10};
        int soma = 0;
        System.out.print("Vetor = ");
        for(int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\nSoma = ");
        for(int i=0; i<vetor.length; i++){
            soma = soma + vetor[i];
        }
        System.out.print(soma);
    }
}
