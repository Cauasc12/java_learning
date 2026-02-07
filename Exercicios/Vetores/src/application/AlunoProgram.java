package application;

import java.util.Scanner;

import entities.Aluno;

public class AlunoProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int qntAlunos = sc.nextInt();

        Aluno[] aprovados = new Aluno[qntAlunos];
        double notaCorte = 6.0;
        int qntAprovados = 0;

        for(int i = 0; i < qntAlunos; i++){
            System.out.printf("Digite as informaões do aluno %d", i+1);

            System.out.print("\nNome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();

            Aluno aluno = new Aluno(nome, nota1, nota2);

            if(aluno.media() >= notaCorte){
                aprovados[qntAprovados] = aluno;
                qntAprovados++;
            }
        }

        System.out.print("Alunos aprovados: ");
        for(int i = 0; i < qntAprovados; i++){
            System.out.printf("\n%s", aprovados[i].getNome());
        }

        sc.close();
    }
}
