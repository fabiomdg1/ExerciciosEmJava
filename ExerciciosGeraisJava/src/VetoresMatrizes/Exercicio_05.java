//Criar dois vetores A e B cada um com 10 elementos inteiros.
// Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja:
//C[i] = A[i] + B[i].
package VetoresMatrizes;
public class Exercicio_05 {
    public void somarVetores(){
        int tamanhoVetor = 10;
        int A[] = {1,2,4,2,5,7,3,6,8,9};
        int B[] = {2,5,5,2,5,5,4,5,7,9};
        int C[] = new int[tamanhoVetor];

        System.out.print("A   = ");
        for(int i=0; i<tamanhoVetor; i++){
            System.out.print(A[i]+" ");
        }

        System.out.print("\nB   = ");
        for(int i=0; i<tamanhoVetor; i++){
            System.out.print(B[i]+" ");
        }

        System.out.print("\nC   = ");
        for(int i=0; i<tamanhoVetor; i++){
            C[i] = (A[i] + B[i]);
            System.out.print(C[i]+" ");
        }
    }
}
