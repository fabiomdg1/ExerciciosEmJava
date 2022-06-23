//Faça um algoritmo que faça a união de dois vetores de mesmo tamanho e mesmo tipo
//em um terceiro vetor com dobro do tamanho.

package VetoresMatrizes;
public class Exercicio_04 {
    public void uniaoVetores() {
        String vetor1[] = {"a ", "b ", "c ", "d ", "e "};
        String vetor2[] = {"f ", "g ", "h ", "i ", "j "};
        String vetor3[] = new String[10];
        int v2 = 0;

        System.out.print("Vetor 1 = ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor3[i] = vetor1[i] + " ");
        }

        System.out.print("\nVetor 2 = ");
        for (int j = 5; j < 10; j++) {
            System.out.print(vetor3[j] = vetor2[v2] + " ");
            v2++;
        }

        System.out.print("\nVetor 3 = ");
        for (int cont = 0; cont < 10; cont++) {
            System.out.print(vetor3[cont] + " ");
        }
    }
}
