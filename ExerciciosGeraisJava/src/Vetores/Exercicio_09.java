//Criar um vetor A com 10 elementos inteiros.
//Desenvolver um programa que defina o percentual de elementos pares e ímpares,
//respectivamente, armazenados neste vetor.

package Vetores;
public class Exercicio_09 {
    public void paresImpares(){
        int vetor[] = {1,2,3,4,5,6,12,14,16,20};
        double impares = 0;
        double pares = 0;
        double percentualPares = 0;
        double percentualImpares = 0;

        for(int i=0; i<vetor.length; i++){
            if(vetor[i] % 2 ==0){
                pares++;
            }else{
                impares++;
            }
        }

        percentualPares = (pares / vetor.length) * 100;
        percentualImpares = (impares / vetor.length) * 100;

        System.out.println("Tamanho do vetor = " + vetor.length);

        System.out.println("Valores Pares = " + pares);
        System.out.println("Valores Impares = " + impares);

        System.out.println("Percentual de valores Pares = " + percentualPares + "%");
        System.out.println("Percentual de valores Impares = " + percentualImpares + "%");

    }
}
