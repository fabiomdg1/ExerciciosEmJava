//Gere e imprima uma matriz M 4X4 com valores aleatórios entre 0-100.
// Após isso determine o maior número da matriz e a sua posição (Linha, Coluna).
package Matrizes;

import java.util.Random;

public class ExercicioMatriz_45 {
    public void maiorNumeroMatriz(){
        int[][] numerosAleatorios = new int[4][4];

        Random random = new Random();

        for(int i=0; i < numerosAleatorios.length; i++){
            for(int j=0; j < numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = random.nextInt(100);
            }
        }

        int maiorNumero = 0;
        int linha = 0;
        int coluna =0;

        for(int i=0; i < numerosAleatorios.length; i++){
            for(int j=0; j < numerosAleatorios[i].length; j++){
                if(numerosAleatorios[i][j] > maiorNumero){
                    maiorNumero = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for(int i=0; i < numerosAleatorios.length; i++){
            for(int j=0; j < numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maiorNumero);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
