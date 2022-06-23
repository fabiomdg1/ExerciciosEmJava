//Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
// Escreva um programa que determine e escreva a quantidade de pessoas que
//possuem idade superior a 35 anos.
package Vetores;

public class Exercicio_11 {
    public void pessoasPorIdade(){
        int vetorPessoas[] = {9,12,13,18,25,26,36,39,40,50};
        int idadeParametro = 35;
        int qtdPessoasIdadeMaiorParametro = 0;

        System.out.print("Idade das pessoas = ");
        for(int i=0; i<vetorPessoas.length;i++){
            System.out.print(vetorPessoas[i] + " ");
            if(vetorPessoas[i] > idadeParametro){
                qtdPessoasIdadeMaiorParametro++;
            }
        }

        System.out.print("\nQuantidade total de pessoas = " + vetorPessoas.length);
        System.out.println("\nQuantidade de pessoas maiores que " + idadeParametro + " anos = " + qtdPessoasIdadeMaiorParametro);
    }

}
