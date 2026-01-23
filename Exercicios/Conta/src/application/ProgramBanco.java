package application;

import entities.Conta;

import java.util.Scanner;

public class ProgramBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String titular, numero;
        Conta c1;

        System.out.print("Informe o número da conta: ");
        numero = sc.nextLine();
        System.out.print("Informe o nome do titular: ");
        titular = sc.nextLine();
        System.out.print("Deseja depósito inical? (s/n): ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Informe o depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            c1 = new Conta(numero, titular, depositoInicial);
        } else {
            c1 = new Conta(numero, titular);
        }
        System.out.println();
        System.out.println(c1);

        //Depósito
        System.out.println();
        System.out.print("Infome o valor do depósito: ");
        double deposito = sc.nextDouble();
        c1.deposito(deposito);
        System.out.println(c1);

        //Saque
        System.out.println();
        System.out.print("Infome o valor do saque: ");
        double saque = sc.nextDouble();
        c1.saque(saque);
        System.out.println(c1);

        sc.close();
    }
}