package application;

import entities.Retangulo;
import java.util.Scanner;
import java.util.Locale;


public class ProgramRetangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        Retangulo r1 = new Retangulo(largura, altura);

        System.out.printf("\nAREA: %.2f", r1.area());
        System.out.printf("\nPERIMETER: %.2f", r1.perimetro());
        System.out.printf("\nDIAGONAL: %.2f", r1.diagonal());

        sc.close();
    }
}

