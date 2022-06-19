//Criar um vetor A com 10 elementos inteiros.
// Implementar um programa que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.
package VetoresMatrizes;

public class Exercicio_07 {
        public void multiplosDeCinco(){
                int vetor[] = {1,2,5,7,15,20,25,32,35,36};
                int soma = 0;

                System.out.print("Vetor = ");
                for(int i=0; i<vetor.length; i++){
                        System.out.print(vetor[i]+ " ");
                        if(vetor[i] % 5 == 0){
                             soma = soma + vetor[i];
                        }
                }
                System.out.print("\nSoma dos valores divisiveis por 5 = " + soma);
        }
}
