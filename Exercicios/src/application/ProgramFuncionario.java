package application;

import entities.Funcionario;

import java.util.Scanner;

public class ProgramFuncionario {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do fucionario:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário bruto: " );
        double salarioBruto = sc.nextDouble();
        System.out.print("Imposto: " );
        double imposto = sc.nextDouble();

        Funcionario f1 = new Funcionario(nome, salarioBruto, imposto);

        System.out.println(f1);

        System.out.print("\nInforme a porcentagem do aumento: ");
        double aumento = sc.nextDouble();
        f1.getAumento(aumento);

        System.out.println("Atualização no salário:\n" + f1);

        sc.close();
    }
}
