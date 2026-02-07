import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];
        int soma = 0, qntPares = 0;

        for(int i = 0; i< tamanho; i++){

            System.out.printf("Valor %d: ", i+1);
            numeros[i] = sc.nextInt();

            if(numeros[i] % 2 == 0){
                soma += numeros[i];
                qntPares ++;
            }
        }

        double media = (double) soma / (double) qntPares;

        if(media >= 0 ){
            System.out.printf("MÉDIA DOS PARES: %.1f", media);
        }
        else{
            System.out.print("NENHUM NÚMERO PAR!");
        }

        sc.close();
    }
}