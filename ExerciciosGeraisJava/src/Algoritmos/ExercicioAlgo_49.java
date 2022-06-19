/*
Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de um triângulo,
e se forem, verificar se é um triângulo equilátero, isóscele ou escaleno.
Se eles não formarem um triângulo, escrever uma mensagem.
Antes da elaboração do algoritmo, torna-se necessário a revisão de algumas propriedades e definições.

Propriedade – o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.

Definição 1 - chama-se de triângulo equilátero o que tem os comprimentos dos três lados iguais;
Definição 2 - chama-se de triângulo isóscele o triângulo que tem os comprimentos de dois lados iguais;
Definição 3 - chama-se triângulo escaleno o triângulo que tem os comprimentos dos três lados diferentes.
*/
package Algoritmos;

import java.util.Scanner;

public class ExercicioAlgo_49 {

    public void validarTriangulo(){
        int lado_A = 0;
        int lado_B = 0;
        int lado_C = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comrimento do lado A do triangulo: ");
        lado_A = scanner.nextInt();

        System.out.print("Digite o comrimento do lado B do triangulo: ");
        lado_B = scanner.nextInt();

        System.out.print("Digite o comrimento do lado C do triangulo: ");
        lado_C = scanner.nextInt();

        if ((lado_A >= (lado_B + lado_C)) || (lado_B >= (lado_A + lado_C)) || (lado_C >= (lado_A + lado_B))){
            System.out.println("Nao e possivel construir um triango com estas medidas");
        }else if((lado_A == lado_B) && (lado_B == lado_C)) {
            System.out.println("Triangulo Equilatero");
        } else if((((lado_A == lado_B) && lado_A != lado_C) || ((lado_A == lado_C) && lado_A != lado_B) || ((lado_B == lado_C) && lado_B != lado_A))) {
            System.out.println("Triangulo Isosceles");
        } else if((lado_A != lado_B) && (lado_A != lado_C) && (lado_B != lado_C)) {
            System.out.println("Triangulo Escaleno");
        }
    }
}
