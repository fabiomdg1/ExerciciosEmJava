//Criar um vetor A com 5 elementos inteiros.
// Construir um vetor B de mesmo tipo e
//tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
package Vetores;

public class Exercicio_14 {
    public void duplicarVetor(){
        int vetor_A[] = {1,2,3,4,5};
        int vetor_B[] = new int[vetor_A.length];

        System.out.print("Vetor A = ");
        for(int i = 0; i < vetor_A.length; i++){
            System.out.print(vetor_A[i] + " ");

            vetor_B[i] = vetor_A[i];
        }
        System.out.print("\nVetor B = ");
        for(int i = 0; i < vetor_B.length; i++){
            System.out.print(vetor_B[i] + " ");
        }
    }
}
