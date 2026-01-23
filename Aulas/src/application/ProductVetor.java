package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class ProductVetor {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de produtos: ");
        int qntProdutos = sc.nextInt();

        Product[] produtos = new Product[qntProdutos];

        double soma = 0, media;

        for(int i = 0; i < produtos.length; i++){
            sc.nextLine();
            System.out.printf("Digite as informações do produto %d\n", i+1);

            System.out.print("Informe o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Informe o valor do produto: ");
            double valor = sc.nextDouble();

            produtos[i] = new Product(nome, valor);
            soma += valor;
        }

        media = soma / produtos.length;
        System.out.printf("Preço médio dos produtos: R$%.2f", media);


        sc.close();
    }
}
