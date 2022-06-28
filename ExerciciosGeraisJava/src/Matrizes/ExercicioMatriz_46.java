//Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-100.
//Após isso, indique qual é o maior e o menor valor da linha 5.
//E qual é o maior e o menor valor da coluna 7.

package Matrizes;

import java.util.Random;

public class ExercicioMatriz_46 {

    public void menorMaiorValorMatriz(){

        int[][] numerosAleatorios = new int[10][10];
        int maiorLInha = 0;
        int menorLinha = Integer.MAX_VALUE;
        int maiorColuna = 0;
        int menorColuna = Integer.MAX_VALUE;

        Random random = new Random();

        //Popular
        for(int i=0; i<numerosAleatorios.length; i++){
            for(int j=0; j<numerosAleatorios.length; j++){
                numerosAleatorios[i][j] = random.nextInt(100);
            }
        }

        //Mostrar
        for(int i=0; i<numerosAleatorios.length; i++){
            for(int j=0; j<numerosAleatorios.length; j++){
                System.out.print(numerosAleatorios[i][j]  + " ");
            }
            System.out.println();
        }

        //Mostrar maior e menor linha
        for(int i=0; i<numerosAleatorios.length; i++){
            for(int j=0; j<numerosAleatorios.length; j++){
                if(numerosAleatorios[5][j] > maiorLInha){
                    maiorLInha = numerosAleatorios[5][j];
                }
                if(numerosAleatorios[5][j] < menorLinha){
                    menorLinha = numerosAleatorios[5][j];
                }
            }
        }

        //Mostrar maior e menor coluna
        for(int i=0; i<numerosAleatorios.length; i++){
            for(int j=0; j<numerosAleatorios.length; j++){
                if(numerosAleatorios[i][7] > maiorColuna){
                    maiorColuna = numerosAleatorios[i][7];
                }
                if(numerosAleatorios[i][7] < menorColuna){
                    menorColuna = numerosAleatorios[i][7];
                }
            }
        }

        System.out.println();
        System.out.println("Maior numero linha 5: " + maiorLInha);
        System.out.println("Menor numero linha 5: " + menorLinha);
        System.out.println("Maior numero coluna 7: " + maiorColuna);
        System.out.println("Menor numero coluna 7: " + menorColuna);
    }
}
