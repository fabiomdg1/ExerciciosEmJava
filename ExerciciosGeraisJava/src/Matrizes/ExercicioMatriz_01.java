/*
Faça um algoritmo para somar duas matrizes.
*/

package Matrizes;

import java.util.Random;

public class ExercicioMatriz_01 {
    int[][] matriz_a = new int[4][4];
    int[][] matriz_b = new int[4][4];
    int[][] matriz_c = new int[4][4];
    Random numerosAleatorios = new Random();
    public void somarMatriz(){
        // Populando Matriz A
        for (int i=0; i<matriz_a.length; i++){
                for(int j=0; j < matriz_a.length; j++){
                    matriz_a[i][j] = numerosAleatorios.nextInt(0,25);
                }
        }

        // Populando Matriz B
        for (int i=0; i<matriz_b.length; i++){
            for(int j=0; j < matriz_b.length; j++){
                matriz_b[i][j] = numerosAleatorios.nextInt(0,25);
            }
        }

        // Populando Matriz C
        for (int i=0; i<matriz_c.length; i++){
            for(int j=0; j < matriz_c.length; j++){
                matriz_c[i][j] = matriz_a[i][j] + matriz_b[i][j];
            }
        }

        //Motrando Matriz A
        System.out.println("Matriz A");
        for (int i=0; i<matriz_a.length; i++){
            for(int j=0; j < matriz_a.length; j++){
                System.out.print(matriz_a[i][j] + " ");
            }
            System.out.println("");
        }

        //Motrando Matriz B
        System.out.println("\nMatriz B");
        for (int i=0; i<matriz_b.length; i++){
            for(int j=0; j < matriz_b.length; j++){
                System.out.print(matriz_b[i][j] + " ");
            }
            System.out.println("");
        }

        //Motrando Matriz C
        System.out.println("\nMatriz C = Matriz A + Matriz B");
        for (int i=0; i<matriz_c.length; i++){
            for(int j=0; j < matriz_c.length; j++){
                System.out.print(matriz_c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
