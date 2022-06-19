//Criar um vetor A com 10 elementos inteiros.
// Escrever um programa que calcule e escreva:
// a) a soma de elementos armazenados neste vetor que são inferiores a 15;
// b) a quantidade de elementos armazenados no vetor que são iguais a 15;
// c) a média dos elementos armazenados no vetor que são superiores a 15.

package VetoresMatrizes;

public class Exercicio_10 {

        public void contarVetores(){
                int vetor_A[] = {1,2,3,4,5,15,15,16,17,18};
                int parametro = 15;
                int somaMenorParemetro = 0;
                int qtdIgualParametro = 0;
                int qtdMaiorParametro = 0;
                int somaMaiorParametro = 0;

                System.out.print("Elementos do vetor = ");

                for(int i=0; i<vetor_A.length; i++){

                        System.out.print(vetor_A[i] + " ");

                        if(vetor_A[i] < parametro ){
                                somaMenorParemetro = somaMenorParemetro + vetor_A[i];
                        } else if(vetor_A[i] == parametro){
                                qtdIgualParametro++;
                        } else{
                                somaMaiorParametro = somaMaiorParametro + vetor_A[i];
                                qtdMaiorParametro++;
                        }
                }

                System.out.println("\nSomas dos elementos menores que " + parametro + " = " + somaMenorParemetro);
                System.out.println("Quantidade elementos igual a " + parametro + " = " + qtdIgualParametro);
                System.out.println("Media elementos maiores que " + parametro + " = " + somaMaiorParametro / qtdMaiorParametro);
        }

}
