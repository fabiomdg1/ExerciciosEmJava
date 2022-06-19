//Criar um vetor A com 8 elementos inteiros.
//Construir um vetor B de mesmo tipo e tamanho
//e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.
package VetoresMatrizes;

public class Exercicio_16 {
        public void multiplicarVetor(){
                int vetor_A[] = {1,2,3,4,5,6,7,8};
                int vetor_B[] = new int[vetor_A.length];

                System.out.print("Vetor A = ");
                for(int i=0; i<vetor_A.length; i++){
                        System.out.print(vetor_A[i] + " ");
                        vetor_B[i] = vetor_A[i]*2;
                }

                System.out.print("\nVetor B = ");
                for(int i=0; i<vetor_B.length;i++){
                        System.out.print(vetor_B[i] + " ");
                }
        }
}
