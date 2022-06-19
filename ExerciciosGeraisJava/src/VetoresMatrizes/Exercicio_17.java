//Criar um vetor A com 15 elementos inteiros.
//Construir um vetor B de mesmo tipo e tamanho,
//sendo que cada elemento do vetor B deverá ser o quadrado do respectivo
//elemento de A, ou seja: B[i] = A[i] * A[I].
package VetoresMatrizes;
public class Exercicio_17 {

    public void vetorAoQuadrado(){
        int vetorInicial[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorQuadrado[] = new int[vetorInicial.length];

        System.out.print("Vetor inicial = ");
        for(int i=0; i<vetorInicial.length; i++){
            System.out.print(vetorInicial[i] + " ");

            vetorQuadrado[i] = vetorInicial[i] * vetorInicial[i];
        }

        System.out.print("\nVetor ao Quadrado = ");
        for(int i=0; i<vetorQuadrado.length; i++){
            System.out.print(vetorQuadrado[i] + " ");
        }
    }
}
