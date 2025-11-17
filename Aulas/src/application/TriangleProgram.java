package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class TriangleProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c  = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle y area: %.4f\n", areaY);

        String maior;
        if (areaX > areaY) {
            maior = "X";
        }
        else {
            maior = "Y";
        }
        System.out.printf("Large area: %s", maior);

        sc.close();
    }
}