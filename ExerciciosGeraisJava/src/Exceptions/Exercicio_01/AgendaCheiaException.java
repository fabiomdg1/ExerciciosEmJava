package Exceptions.Exercicio_01;

public class AgendaCheiaException extends Exception{
    @Override
    public String getMessage(){
        return "Agenda está cheia";
    }
}
