//Faça um algoritmo que some o conteúdo de dois vetores
// e armazene o resultado em um terceiro vetor.

package VetoresMatrizes;
public class Exercicio_03 {
    public void somarVetores(){

        int tamanhoVetor = 5;
        int vetor1[] = {1,2,4,2,5};
        int vetor2[] = {2,5,5,2,5};
        int vetorSoma[] = new int[tamanhoVetor];

        System.out.print("Vetor 1   = ");
        for(int i=0; i<tamanhoVetor; i++){
            System.out.print(vetor1[i]+" ");
        }

        System.out.print("\nVetor 2   = ");
        for(int i=0; i<tamanhoVetor; i++){
            System.out.print(vetor2[i]+" ");
        }

        System.out.print("\nVetorSoma = ");
        for(int i=0; i<tamanhoVetor; i++){
            vetorSoma[i] = (vetor1[i] + vetor2[i]);
            System.out.print(vetorSoma[i]+" ");
        }
    }
}
