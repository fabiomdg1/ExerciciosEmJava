//Criar um vetor A com 10 elementos inteiros.
// Implementar um programa que defina e escreva a quantidade de
// elementos armazenados neste vetor que são pares.
package VetoresMatrizes;

public class Exercicio_13 {
    public void elementosPares(){
        int vetor[] = {1,3,5,6,8,15,17,19,22,25};
        int vetorPares[] = new int[vetor.length];
        int qtdPares = 0;

        System.out.print("Vetor inicial = ");

        for(int i=0; i < vetor.length; i++){

            System.out.print(vetor[i] + " ");

            if(vetor[i]%2 == 0){
                vetorPares[qtdPares] = vetor[i];
                qtdPares++;
            }
        }
        System.out.print("\nQuantidade de numeros Pares = " + qtdPares);

        //Mostra um vetor com os números pares
        System.out.print("\nVetor numeros Pares = ");
        for(int i = 0; i < qtdPares; i++){
            System.out.print(vetorPares[i] + " ");
        }
    }
}
