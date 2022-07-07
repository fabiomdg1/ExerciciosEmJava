package Exceptions.Exercicio_01;

import java.util.Arrays;

public class Agenda {

    private Contato[] contatos;

    public Agenda(){
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean agendaCheia = true;
        for(int i=0; i<contatos.length; i++){
            if(contatos[i] == null){
                contatos[i] = c;
                agendaCheia = false;
                break;
            }
        }
        if(agendaCheia){
            throw new AgendaCheiaException();
        }
    }

    public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {
        for(int i=0; i< contatos.length; i++){
            if(contatos[i] != null){
                if(contatos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + Arrays.toString(contatos) +
                '}';
    }
}
