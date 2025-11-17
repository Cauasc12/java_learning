package entities;

public class Funcionario {

    private String nome;
    private double salario;
    private double imposto;

    public Funcionario(String nome, double salario, double imposto){
        this.nome = nome;
        this.salario = salario;
        this.imposto = imposto;
    }

    public double getSalarioLiquido(){
        return salario - imposto;
    }

    public double getAumento(double aumento){
        return salario = salario * (1 + aumento/100);
    }

    public String toString() {
        return "Empregado:" + nome + "\nSalário líquido R$:" + String.format("%.2f", getSalarioLiquido());
    }
}

