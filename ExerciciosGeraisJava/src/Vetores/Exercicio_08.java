//Criar um vetor A com 10 elementos inteiros.
// Implementar um programa que defina e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.
package VetoresMatrizes;

public class Exercicio_08 {
    public void mediaNumerosImpares(){
        int soma = 0;
        int qtd = 0;
        double media = 0;
        int vetor_A[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Vetor A = ");
        for(int i=0; i<vetor_A.length; i++) {
            System.out.print(vetor_A[i] + " ");//Vetor_A competo
        }

        System.out.print("\nNumeros Impares = ");
        for(int i=0; i<vetor_A.length; i++){
            if(vetor_A[i] % 2 != 0){
                System.out.print(vetor_A[i] + " ");
                soma = soma + vetor_A[i];
                qtd++;
            }
        }

        System.out.print("\nQuantidade de numeros Impares = " + qtd);

        media = soma / qtd;
        System.out.print("\nMedia simples dos valores Impares = " + media);
    }
}

