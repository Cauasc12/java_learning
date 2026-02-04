import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");;
        int tamanho = sc.nextInt();

        double soma = 0.0;
        double[] vetor = new double[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.printf("Digite o elemento %d: ", i+1);
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / (double)tamanho;

        System.out.printf("Média do vetor = %.3f", media);

        System.out.print("\nElementos abaixo da média");
        for(int i = 0; i < tamanho; i++){
            if(vetor[i] < media){
                System.out.printf("\n%.1f", vetor[i]);
            }
        }

        sc.close();
    }
}
