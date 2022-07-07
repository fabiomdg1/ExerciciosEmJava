/*
Escreva uma classe Contato que contenha nome, telefone e um indentificador.
Esse identificador deve ser gerado automaticamente pela classe através de um contador.
Cada vez que um Contato é criado, o contador é incrementado e atribuído ao identificador.
Crie uma classe Agenda que irá funcionar para gerenciar os Contatos.
Essa classe precisa ter um método para adicionar um Contato e também para consultar.
Crie uma classe Teste que informa em menu ao usuário:
1 - Para consultar um contato da agenda.
2 - Para adicionar um contato na agenda.

Se o contato não existir, o programa deve lançar uma exceção
de ContatoNaoExisteException.
Caso a agenda esteja cheia quando o usuário quiser adicionar um novo contato,
o programa deve lançar uma exceção de AgendaCheiaException.
Trate também as exceções de tipo de dados, caso o usuário entre com
um tipo de dados inválido.
*/

package Exceptions.Exercicio_01;

import java.util.Scanner;

public class ExercicioException_01 {

    public static void main(String[] args) throws AgendaCheiaException {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 1;

        while(opcao != 3){
            opcao = obterOpcaoMenu(scanner);

            if(opcao == 1){
                consultarContato(scanner, agenda);
            }else if(opcao == 2){
                adicionarContato(scanner, agenda);
            }else if(opcao == 3){
                System.exit(0);
            }
        }
    }

    public static void adicionarContato(Scanner scanner, Agenda agenda) throws AgendaCheiaException {
        try {
            System.out.println("Criando um contato, entre com as informações: ");
            String nome = lerInformacaoString(scanner, "Digite o nome do contato: ");
            String telefone = lerInformacaoString(scanner, "Digite o telefone do contato: ");
            String email = lerInformacaoString(scanner, "Digite o email do contato: ");
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da Agenda");
            System.out.println(agenda);
        }
    }
    public static void consultarContato(Scanner scanner, Agenda agenda){
        String nomeContato = lerInformacaoString(scanner, "Entre com o nome do contato a ser pesquisado: ");
        try {
            if(agenda.consultaContatoPorNome(nomeContato) > 0){
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacaoString(Scanner scanner, String msg){
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scanner){

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida){
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1: Consultar contato ");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try{
                String entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada incorreta, digite novamente.");
                }
            }catch (Exception e){
                System.out.println("Entrada incorreta, digite novamente.");
            }

        }
        return opcao;
    }
}
