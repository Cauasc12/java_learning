import java.util.Locale;
import java.util.Scanner;


public class MaiorPosicao {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai digitar? ");
        int num = sc.nextInt();

        double[] vetor = new double[num];
        double maior = 0;
        int posicao = 0;

        for(int i = 0; i < num; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] > maior){
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("Maior valor: %.1f", maior);
        System.out.printf("\nPosicao do maior valor: %d", posicao);

        sc.close();
    }
}
