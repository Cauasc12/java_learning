package application;

import entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class ProductProgram {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Entrada dos dados do produto
        System.out.println("Entre product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(name, price, quantity);

        //Exibição do produto
        System.out.println();
        System.out.println("Product data:" + p1);

        //Adicionar quantidade
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        p1.addProducts(quantity);
        System.out.println("Product data:" + p1);

        //Remover quantidade
        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        p1.removeProducts(quantity);
        System.out.println("Product data:" + p1);

        sc.close();
    }

}
