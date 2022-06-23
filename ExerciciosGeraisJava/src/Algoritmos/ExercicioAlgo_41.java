/*
A revendedora SeuCarro Ltda. paga aos seus funcionários vendedores dois salários fixos,
mais uma comissão fixa de R$ 50,00 por carro vendido e mais 5% do valor das vendas.
Faça um algoritmo que determine o salário total de um vendedor.
*/

package Algoritmos;

import java.util.Scanner;

public class ExercicioAlgo_41 {

    private Double salarioFixo_a = 0.0;
    private Double salarioFixo_b = 0.0;
    private Double salarioTotal = 0.0;
    private Double valorCarroVendido = 0.0;
    private Double valorComissao = 0.0;
    private Integer qtdCarrosVendidos = 0;

    Scanner scanner = new Scanner(System.in);

    public void salarioTotalFuncionario(){
        System.out.print("Informe o valor do primeiro salario: ");
        setSalarioFixo_a(scanner.nextDouble());

        System.out.print("Informe o valor do primeiro salario: ");
        setSalarioFixo_b(scanner.nextDouble());

        System.out.print("Informe o valor do carro vendido: ");
        setValorCarroVendido(scanner.nextDouble());

        System.out.print("Informe a quantidade de carros vendidos: ");
        setQtdCarrosVendidos(scanner.nextInt());
        valorTotal(getQtdCarrosVendidos());

        System.out.printf("O valor total recebido pelo funcionario e de : R$%.2f",getSalarioTotal());

    }

    public Double valorTotal(int qtdCarrosVendidos){
        setSalarioTotal(comissao(qtdCarrosVendidos) + getSalarioFixo_a() + getSalarioFixo_b());
        return getSalarioTotal();
    }

    public Double comissao(int qtd){
        setValorComissao(((getValorCarroVendido() * 5)/100));
        return (qtd * 50) + getValorComissao();
    }

    public Double getSalarioFixo_a() {
        return salarioFixo_a;
    }

    public void setSalarioFixo_a(Double salarioFixo_a) {
        this.salarioFixo_a = salarioFixo_a;
    }

    public Double getSalarioFixo_b() {
        return salarioFixo_b;
    }

    public void setSalarioFixo_b(Double salarioFixo_b) {
        this.salarioFixo_b = salarioFixo_b;
    }

    public Integer getQtdCarrosVendidos() {
        return qtdCarrosVendidos;
    }

    public void setQtdCarrosVendidos(Integer qtdCarrosVendidos) {
        this.qtdCarrosVendidos = qtdCarrosVendidos;
    }

    public Double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(Double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public Double getValorCarroVendido() {
        return valorCarroVendido;
    }

    public void setValorCarroVendido(Double valorCarroVendido) {
        this.valorCarroVendido = valorCarroVendido;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }
}
