import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho dos vetores: ");
        int tamanho = sc.nextInt();

        int[] A = new int[tamanho];
        int[] B = new int[tamanho];

        System.out.print("Informe os valores de A\n");
        for(int i = 0; i < tamanho; i++){
            System.out.printf("Informe o valor %d: ", i+1);
            A[i]= sc.nextInt();
        }

        System.out.print("Infome os valores de B\n");
        for(int i = 0; i < tamanho; i++){
            System.out.printf("Informe o valor %d: ", i+1);
            B[i]= sc.nextInt();
        }

        System.out.print("Vetor resultante");
        int[] C = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            C[i] = A[i] + B[i];
            System.out.printf("\nValor %d = %d", i+1, C[i]);
        }

        sc.close();
    }
}
