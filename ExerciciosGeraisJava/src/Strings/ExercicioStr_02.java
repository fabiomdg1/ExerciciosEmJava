//Escreva  um  algorítmo  que  leia  uma palavra  e  imprime
// o  número  de  vezes  que determinada letra esteja repetida
package Strings;

import java.util.Scanner;

public class ExercicioStr_02 {
    public void contarLetras(){
        String palavra = "";
        Scanner scanner = new Scanner(System.in);
        String[] vet = new String[palavra.length()];
        Character[] vetChar = new Character[palavra.length()];

        System.out.print("Escreva uma palavra: ");
        palavra = scanner.nextLine();


        for(char c : palavra.toCharArray()){
            System.out.print(c + " - ");
        }

//        for(char letra:vet){
//            System.out.println(letra);
//        }
    }

}
