//Mostre a data atual no formato dd/mm/yyyy hh:mm:ss, em seguida.
//Escreva um código em que o usuário possa somar ou subtrair
// dias, meses, anos, horas e minutos.
package Datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class ExercicioData_01 {
    Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    String opcao;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void calculoDeDatas() {
        System.out.println("A data e hora atual e: " + dataAtual());
        System.out.println("Digite uma opcao");
        System.out.println("1 - Alterar dias    2 - Alterar mes         3 - Alterar anos");
        System.out.println("4 - Alterar horas   5 - Alterar minutos     6 - Sair");
        opcao = scanner.next();

        switch (opcao){
            case "1":
                System.out.println("Escolha uma opcao: ");
                System.out.println("1 - Adicionar dias     2 - Subtrair dias");
                String opcaoDia = scanner.next();

                if(opcaoDia.equals("1")) {
                    System.out.print("Informe a quantidade de dias que deseja adicionar: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(somarDia(qtdDias));

                } else if(opcaoDia.equals("2")){
                    System.out.print("Informe a quantidade de dias que deseja subtrair: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(subtrairDia(qtdDias));
                }
                break;

            case "2":
                System.out.println("Escolha uma opcao: ");
                System.out.println("1 - Adicionar mes     2 - Subtrair mes");
                String opcaoMes = scanner.next();

                if(opcaoMes.equals("1")) {
                    System.out.print("Informe a quantidade de meses que deseja adicionar: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(somarMes(qtdDias));

                } else if(opcaoMes.equals("2")){
                    System.out.print("Informe a quantidade de meses que deseja subtrair: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(subtrairMes(qtdDias));
                }
                break;

            case "3":
                System.out.println("Escolha uma opcao: ");
                System.out.println("1 - Adicionar anos     2 - Subtrair anos");
                String opcaoAnos = scanner.next();

                if(opcaoAnos.equals("1")) {
                    System.out.print("Informe a quantidade de anos que deseja adicionar: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(somarAno(qtdDias));

                } else if(opcaoAnos.equals("2")){
                    System.out.print("Informe a quantidade de anos que deseja subtrair: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(subtrairAno(qtdDias));
                }
                break;

            case "4":
                System.out.println("Escolha uma opcao: ");
                System.out.println("1 - Adicionar horas     2 - Subtrair horas");
                String opcaoHoras = scanner.next();

                if(opcaoHoras.equals("1")) {
                    System.out.print("Informe a quantidade de horas que deseja adicionar: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(somarHora(qtdDias));

                } else if(opcaoHoras.equals("2")){
                    System.out.print("Informe a quantidade de horas que deseja subtrair: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(subtrairHora(qtdDias));
                }
                break;

            case "5":
                System.out.println("Escolha uma opcao: ");
                System.out.println("1 - Adicionar minutos     2 - Subtrair minutos");
                String opcaoMinutos = scanner.next();

                if(opcaoMinutos.equals("1")) {
                    System.out.print("Informe a quantidade de minutos que deseja adicionar: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(somarMinuto(qtdDias));

                } else if(opcaoMinutos.equals("2")){
                    System.out.print("Informe a quantidade de minutos que deseja subtrair: ");
                    int qtdDias = scanner.nextInt();
                    System.out.println(subtrairMinuto(qtdDias));
                }
                break;

            case "6":
                System.out.println("Fim");
                break;
        }
    }

    private String dataAtual(){
        return sdf.format(calendar.getTime());
    }

    private String somarDia(int quantidade){
        calendar.add(Calendar.DAY_OF_MONTH, quantidade);
        return sdf.format(calendar.getTime());
    }

    private String subtrairDia(int quantidade){
        calendar.add(Calendar.DAY_OF_MONTH, - quantidade);
        return sdf.format(calendar.getTime());
    }


    private String somarMes(int quantidade){
        calendar.add(Calendar.MONTH, quantidade);
        return sdf.format(calendar.getTime());
    }

    private String subtrairMes(int quantidade){
        calendar.add(Calendar.MONTH, - quantidade);
        return sdf.format(calendar.getTime());
    }

    private String somarAno(int quantidade){
        calendar.add(Calendar.YEAR, quantidade);
        return sdf.format(calendar.getTime());
    }

    private String subtrairAno(int quantidade){
        calendar.add(Calendar.YEAR, - quantidade);
        return sdf.format(calendar.getTime());
    }

    private String somarHora(int quantidade){
        calendar.add(Calendar.HOUR_OF_DAY, quantidade);
        return sdf.format(calendar.getTime());
    }

    private String subtrairHora(int quantidade){
        calendar.add(Calendar.HOUR_OF_DAY, - quantidade);
        return sdf.format(calendar.getTime());
    }

    private String somarMinuto(int quantidade){
        calendar.add(Calendar.MINUTE, quantidade);
        return sdf.format(calendar.getTime());
    }

    private String subtrairMinuto(int quantidade){
        calendar.add(Calendar.MINUTE, - quantidade);
        return sdf.format(calendar.getTime());
    }

}
