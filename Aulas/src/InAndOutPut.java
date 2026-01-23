import java.util.Locale;
import java.util.Scanner;

public class InAndOutPut {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome;
        nome = sc.next();
        System.out.printf("Seu nome é %s\n", nome);

        System.out.println("Informe sua idade:");
        int idade;
        idade = sc.nextInt();
        System.out.printf("A idade de %s é %d anos\n", nome, idade);

        System.out.println("Informe um número decimal");
        double x;
        x = sc.nextDouble();
        System.out.printf("O número digitado foi %.2f\n", x);

        System.out.println("Informe uma letra:");
        char y;
        y = sc.next().charAt(0);
        System.out.printf("A letra digitadda foi %s\n", y);


        String s1, s2, s3;
        sc.nextLine(); //Recebe a quebra de linha pendente
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }
}
