package application;

import entities.Pessoa;

import java.util.Scanner;
import java.util.Locale;

public class VelhoProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vai digitar? ");
        int qntPessoas = sc.nextInt();

        Pessoa[] vetor = new Pessoa[qntPessoas];

        for (int i = 0; i < qntPessoas; i++) {
            System.out.printf("Dados da %d pessoa", i + 1);

            System.out.print("\nNome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            vetor[i] = new Pessoa(nome, idade);
        }

        int maiorIdade = vetor[0].getIdade();
        int posicaoMaisVelho = 0;

        for(int i = 1; i < qntPessoas; i++){
            int idade = vetor[i].getIdade();

            if(idade > maiorIdade){
                maiorIdade = idade;
                posicaoMaisVelho = i;
            }
        }


        System.out.printf("Pessoa mais velha: %s", vetor[posicaoMaisVelho].getNome());

        sc.close();
    }
}


