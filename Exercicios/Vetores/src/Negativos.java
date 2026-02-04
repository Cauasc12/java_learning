import java.util.Scanner;

public class Negativos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números irá digitar? ");
        int num = sc.nextInt();

        int[] vetor = new int[num];


        for(int i = 0; i < num; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < num; i++){
            if(vetor[i] < 0){
                System.out.printf("%d\n", vetor[i]);
            }
        }

        sc.close();
    }
}
