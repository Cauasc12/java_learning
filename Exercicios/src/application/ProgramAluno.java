package application;

import entities.Aluno;
import java.util.Scanner;

public class ProgramAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informações do aluno:");
        String nome = sc.nextLine();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        Aluno a1 = new Aluno(nome, nota1, nota2, nota3);

        System.out.printf("Final grade: %.2f\n", a1.notaFinal());

        if (a1.notaFinal() < 60.00) {
            System.out.println("Failed!");
            System.out.printf("\nMissing %.2f points", a1.notaFalta());
        }
        else {
            System.out.println("Pass!");
        }
        sc.close();
    }
}
