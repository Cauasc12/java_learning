import java.util.Scanner;
import java.util.Locale;


public class For {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja somar: ");
        int n = sc.nextInt();
        int soma = 0;

        System.out.printf("Digite %d números\n", n);
        for(int i=1; i<=n; i++ ) {
            System.out.printf("Número %d: ", i);
            int num = sc.nextInt();
            soma += num;
        }

        System.out.printf("A soma dos números é: %d", soma);

        sc.close();
    }

}
