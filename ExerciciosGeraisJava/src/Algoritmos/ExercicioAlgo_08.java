//Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula
// area = (base * altura) / 2
package Algoritmos;

import java.util.Scanner;

public class ExercicioAlgo_08 {
    Double area;
    Double base;
    Double altura;
    Scanner scanner = new Scanner(System.in);

    public void areaTriangulo(){
        System.out.print("Digite a base do triangulo: ");
        base = scanner.nextDouble();

        System.out.print("Digite a altura do triangulo: ");
        altura = scanner.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A area do triangulo e : " + area);
    }

}
