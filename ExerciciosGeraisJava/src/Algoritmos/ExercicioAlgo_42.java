/*
Uma pessoa comprou quatro artigos em uma loja.
Para cada artigo, tem-se nome, preço e percentual de desconto.
Faça um algoritmo que imprima nome, preço e preço com desconto
de cada artigo e o total a pagar.
*/
package Algoritmos;

public class ExercicioAlgo_42 {
    ExercicioAlgo_42_Artigo artigo1 = new ExercicioAlgo_42_Artigo("Bolsa", 45.50,10);
    ExercicioAlgo_42_Artigo artigo2 = new ExercicioAlgo_42_Artigo("Cinto", 10.00,5);
    ExercicioAlgo_42_Artigo artigo3 = new ExercicioAlgo_42_Artigo("Oculos", 75.00,10);
    ExercicioAlgo_42_Artigo artigo4 = new ExercicioAlgo_42_Artigo("Chinelo", 35.00,5);

    public void Descricao(){
        artigo1.descricao();
        artigo2.descricao();
        artigo3.descricao();
        artigo4.descricao();
        valorTotal();
    }

    public void valorTotal(){
        double total;
        total = artigo1.getPrecoComDesconto() +
                artigo2.getPrecoComDesconto() +
                artigo3.getPrecoComDesconto() +
                artigo4.getPrecoComDesconto();
        System.out.printf("Valor total da compra R$%.2f",total);
    }
}
