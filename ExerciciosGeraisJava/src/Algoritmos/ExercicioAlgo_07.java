//Faça um algoritmo para calcular a área de uma circunferência,
// considerando a fórmula ÁREA = π * RAIO2.
// Utilize as variáveis AREA e RAIO, a constante π (pi = 3,14159)
// e os operadores aritméticos de multiplicação.

package Algoritmos;

import java.util.Scanner;

public class ExercicioAlgo_07 {

    private Double pi = 3.14159;
    private Double raio = 0.0;
    private Double area = 0.0;

    Scanner scanner = new Scanner(System.in);

    public void mostrarArea(){

        System.out.print("Informe o Raio da Circunferencia: ");
        raio = scanner.nextDouble();

        System.out.println("A Area da Circufencia e : " + areaCalc());
    }

    public double areaCalc(){
        return area = (pi * (raio * raio));
    }
}
