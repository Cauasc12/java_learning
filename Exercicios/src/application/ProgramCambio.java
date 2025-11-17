package application;

import util.Cambio;

import java.util.Scanner;

public class ProgramCambio {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço do dolar: ");
        double dolar = sc.nextDouble();
        System.out.print("Informe quantos dolares deseja converter: ");
        double valor = sc.nextDouble();

        double reais = Cambio.ConversaoDolarReal(dolar,valor);
        System.out.printf("Valor em reais: R$%.2f", reais);

        sc.close();
    }
}