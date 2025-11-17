package application;

import util.Calculator;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circunferencia(raio);

        double v = Calculator.volume(raio);

        System.out.printf("Circunferência: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", Calculator.PI);

        sc.close();
    }
}