import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int num = sc.nextInt();
        int[] numeros = new int[num];

        int qntPares = 0;

        for(int i = 0; i < num; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                System.out.printf("%d ", numeros[i]);
                qntPares++;
            }
        }

        System.out.printf("\nQUANTIDADE DE PARES: %d", qntPares);

        sc.close();
    }
}
