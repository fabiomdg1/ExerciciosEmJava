package Algoritmos;

public class ExercicioAlgo_126 {
    private int i = 0;
    private int total = 1;

    public int fatorialRecursivo(int num){
        if(num == 0)
            return 1;

        return num * fatorialRecursivo(num -1);
    }

    public int fatorialNaoRecursivo(int num){
        for(int i=num; i>0; i--){
            this.total *= i;
        }
        return total;
    }

    public void exibirResultado(int num){
        System.out.println(fatorialRecursivo(num));
        System.out.println(fatorialNaoRecursivo(num));
    }
}
