package entities;

public class Conta {
    //Atributos
    String numero;
    String titular;
    double saldo;

    //Construtores
    public Conta(String numero, String titular, double depositoInicial){
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public Conta(String numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    //Getters
    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setter
    public void setTitular(String titular){
        this.titular = titular;
    }

    //Métodos
    public double saque(double valor){
        return saldo -= valor+5;
    }

    public double deposito(double valor){
        return saldo += valor;
    }

    public String toString(){
        return "Conta: " + numero
                + "\nTitular: " + titular
                + "\nSaldo: " + String.format("%.2f", saldo);
    }

}