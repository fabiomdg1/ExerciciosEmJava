package Algoritmos;

public class ExercicioAlgo_42_Artigo {

    private String nome;
    private Double preco = 0.0;
    private Integer percentDesconto = 0;
    private Double precoComDesconto = preco + (preco * percentDesconto);

    public ExercicioAlgo_42_Artigo(String nome, Double preco, Integer percentDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.percentDesconto = percentDesconto;
    }

    public void descricao() {
        setPrecoComDesconto(getPreco() - ((getPreco() * getPercentDesconto()) / 100));
        System.out.printf("%s -- Valor R$%.2f -- Desconto: %d%% -- Valor com Desconto R$%.2f\n", getNome(), getPreco(), getPercentDesconto(), getPrecoComDesconto());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getPercentDesconto() {
        return percentDesconto;
    }

    public void setPercentDesconto(Integer percentDesconto) {
        this.percentDesconto = percentDesconto;
    }

    public Double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(Double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }
}
