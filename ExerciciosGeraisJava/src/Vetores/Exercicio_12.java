//Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
// Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
package Vetores;

public class Exercicio_12 {

    public void idadePessoas(){
        int idadePessoas[] = {25,27,57,12,14,36,38,125,42,56};
        int menorIdade = idadePessoas[0];
        int maiorIdade = idadePessoas[0];

        System.out.print("Idades = ");
        //Pegar menor idade
        for(int i=0; i < idadePessoas.length; i++){
            System.out.print(idadePessoas[i] + " ");
            if(idadePessoas[i] < menorIdade){
                menorIdade = idadePessoas[i];
            }
        }
        System.out.println("\nMenor idade = " + menorIdade);

        //Pegar maior idade
        for(int i=0; i < idadePessoas.length; i++){
            if(idadePessoas[i] > maiorIdade){
                maiorIdade = idadePessoas[i];
            }
        }
        System.out.println("Maior idade = " + maiorIdade);
    }
}
