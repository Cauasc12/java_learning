import java.util.Scanner;
import java.util.Locale;

public class SomaVetor {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qunantos números vai digitar? ");
        int num = sc.nextInt();

        double[] vetor = new double[num];
        double soma = 0.0;

        for(int i = 0; i < num; i++){
        System.out.printf("Digite o %d numero: ", i+1);
        vetor[i] = sc.nextDouble();
        soma += vetor[i];
        }

        double media = soma / (double) num;

        System.out.print("VALORES: ");
        for(int i = 0; i < num; i++){
            System.out.printf("%.1f - ", vetor[i]);
        }

        System.out.printf("\nSOMA: %.2f", soma);
        System.out.printf("\nMÉDIA: %.2f", media);

        sc.close();
    }



}
