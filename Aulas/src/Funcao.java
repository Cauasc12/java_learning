import java.util.Locale;
import java.util.Scanner;

public class Funcao {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 3 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        System.out.printf("O maior dos valores é %d", maior);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int maior;

        if (x>y && x>z){
            maior = z;
        }
        else if (y>z){
            maior = y;
        }
        else {
            maior = z;
        }
        return maior;
    }
}
