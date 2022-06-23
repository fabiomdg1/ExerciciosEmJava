//Faça um algoritmo que copie o conteúdo de um vetor para um segundo vetor.

package Vetores;
public class Exercicio_02 {
    public void copiarConteudoVetor(){
        String vetor1[] = {"a ","b ","c ","d ","e "};
        String vetor2[] = {"", "", "", "", ""};

        System.out.println("-------------- Valor Inicial -------------------- ");

        System.out.print("O valor do vetor 1 e: ");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(vetor1[i]);
        }

        System.out.print("\nO valor do vetor 2 e: ");
        for(int i=0; i<vetor2.length; i++){
            System.out.print(vetor2[i]);
        }

        System.out.println("\n\n----------- Copiado valor do vetor 1 para vetor 2 ------------- ");

        System.out.print("O valor do vetor 1 e: ");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(vetor1[i]);
        }

        System.out.print("\nO valor do vetor 2 e: ");
        for(int i=0; i<vetor1.length; i++){
            vetor2[i] = vetor1[i];
            System.out.print(vetor2[i]);
        }
    }
}
