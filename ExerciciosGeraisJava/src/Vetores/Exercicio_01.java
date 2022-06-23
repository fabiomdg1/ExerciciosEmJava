//Crie um vetor capaz de armazenar 50 números inteiros.
//Em seguida faça o seu preenchimento automático com os números de 101 a 150,
// ou seja, na posição número 0 coloque 101,0na posição 1 coloque 102 e assim sucessivamente.
//Em seguida exiba os valores deste vetor.

package VetoresMatrizes;
public class Exercicio_01 {
    public void criarVetor(){

        //Podemos criar vetores com os tipos int, double, float, char, String, entre outros ...
        //O vetor precisar ser instanciado pois ele é um objeto
        //O índice do vetor sempre começa com zero

        int numeros[] = new int [50];
        int valor = 101;

        for(int i=0; i <= numeros.length; i++){
            System.out.println("Posicao " + i + " , valor " + valor);
            valor ++;
        }
    }
}
