package application;

import entities.Pessoa;

import java.util.Scanner;
import java.util.Locale;

public class PessoaProgram {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int num = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[num];

        for(int i = 0; i < num; i++){
            System.out.printf("Dados da pessoa %d", i+1);

            System.out.print("\nNome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaAltura = 0;
        for(int i = 0; i < num; i++){
            somaAltura += pessoas[i].getAltura();
        }
        double mediaAltura = somaAltura / num;
        System.out.printf("\nAltura média %.2f", mediaAltura);

        Pessoa[] menoresDe16 = new Pessoa[num];
        int cont = 0;
        for(int i = 0; i < num; i++){
            if(pessoas[i].getIdade() < 16){
                menoresDe16[cont] = pessoas[i];
                cont++;
            }
        }

        double porcentagemMenor16 = ((double)(cont) / (double)num) * 100;
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", porcentagemMenor16);

        for(int i = 0; i < cont; i++){
            System.out.printf("%s\n", menoresDe16[i].getNome());
        }

        sc.close();
    }
}