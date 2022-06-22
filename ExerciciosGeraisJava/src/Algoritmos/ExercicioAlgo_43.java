/*
Uma empresa irá dar um aumento de salário aos seus funcionários de acordo com a categoria
de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários das categorias A, C, F, e H ganharão 10% de aumento sobre o salário;
• Funcionários das categorias B, D, E, I, J e T ganharão 15% de aumento sobre o salário;
• Funcionários das categorias K e R ganharão 25% de aumento sobre o salário;
• Funcionários das categorias L, M, N, O, P, Q e S ganharão 35% de aumento sobre o salário;
• Funcionários das categorias U, V, X, Y, W e Z ganharão 50% de aumento sobre o salário.
Faça um algoritmo que escreva nome, categoria e salário reajustado de cada empregado.
*/
package Algoritmos;

import java.util.Scanner;

public class ExercicioAlgo_43 {
    String categoria = "";
    String nomeFuncionario = "";
    Double salario = 0.0;
    Double salarioComAumento = 0.0;
    Integer aumento = 0;
    Scanner scanner = new Scanner(System.in);

    public void aumentoSalario() {
        System.out.print("Informe o nome do Funcionario: ");
        nomeFuncionario = scanner.next();

        System.out.print("Informe a Categoria do Funcionario: ");
        categoria = scanner.next();

        System.out.print("Informe Salario do Funcionario: ");
        salario = scanner.nextDouble();

        System.out.println("Categoria" + categoria);

        if (categoria_1()) {
            aumento = 10;
            salarioComAumento = (salario + ((salario * aumento)) / 100);
            dadosFuncionario();
        }

        if (categoria_2()) {
            aumento = 15;
            salarioComAumento = (salario + ((salario * aumento)) / 100);
            dadosFuncionario();
        }

        if (categoria_3()) {
            aumento = 25;
            salarioComAumento = (salario + ((salario * aumento)) / 100);
            dadosFuncionario();
        }

        if (categoria_4()) {
            aumento = 35;
            salarioComAumento = (salario + ((salario * aumento)) / 100);
            dadosFuncionario();
        }

        if (categoria_5()) {
            aumento = 50;
            salarioComAumento = (salario + ((salario * aumento)) / 100);
            dadosFuncionario();
        }
    }

    public void dadosFuncionario() {
        System.out.println("-------------------Dados do Funcionario-------------------");
        System.out.println("Nome do Funcionario: " + nomeFuncionario);
        System.out.println("Categoria do Funcionario: " + categoria);
        System.out.printf("Salario: R$%.2f", salario);
        System.out.println("\nAumento : " + aumento + "%");
        System.out.printf("Salario reajustado: R$%.2f", salarioComAumento);
        System.out.println("\n----------------------------------------------------------");
    }

    public Boolean categoria_1() {
        if (categoria.equals("A") || categoria.equals("C") ||
                categoria.equals("F") || categoria.equals("H"))
            return true;
        else
            return false;
    }

    public Boolean categoria_2() {
        if (categoria.equals("B") || categoria.equals("D") ||
                categoria.equals("I") || categoria.equals("J") || categoria.equals("T"))
            return true;
        else
            return false;
    }

    public Boolean categoria_3() {
        if (categoria.equals("K") || categoria.equals("R"))
            return true;
        else
            return false;
    }

    public Boolean categoria_4() {
        if (categoria.equals("L") || categoria.equals("M") || categoria.equals("N") || categoria.equals("O") ||
                categoria.equals("P") || categoria.equals("Q") || categoria.equals("S"))
            return true;
        else
            return false;
    }

    public Boolean categoria_5(){
        if(categoria.equals("U") || categoria.equals("V") || categoria.equals("X") ||
                categoria.equals("Y") || categoria.equals("W") || categoria.equals("Z"))
            return true;
        else
            return false;
    }


}
