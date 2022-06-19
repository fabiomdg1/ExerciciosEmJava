//Suponha que o conceito de um aluno seja determinado em função da sua nota.
//Suponha também, que esta nota seja um valor inteiro na faixa de 0 a 100, conforme a seguinte faixa:
//Nota             Conceito
//0 a 49           Insuficiente
//50 a 64          Regular
//65 a 84          Bom
//85 a 100         Ótimo
//Crie um algoritmo que apresente o conceito e a nota do aluno.
package Algoritmos;

import java.util.Scanner;
public class ExercicioAlgo_50 {
    public void notaConceito() {
        int notaAluno = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        notaAluno = scanner.nextInt();

        if (notaAluno >= 0 && notaAluno < 50)
            System.out.println("Insuficiente");

        if (notaAluno >= 50 && notaAluno < 65)
            System.out.println("Regular");

        if (notaAluno >= 65 && notaAluno < 85)
            System.out.println("Bom");

        if (notaAluno >= 85 && notaAluno <= 100)
            System.out.println("Otimo");

        if(notaAluno < 0 || notaAluno > 100)
            System.out.print("Digite uma nota entre 0 e 100");
    }
}

