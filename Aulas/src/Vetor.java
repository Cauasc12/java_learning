import java.util.Locale;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntPessoas;
        double soma = 0;
        System.out.print("Informe a quantidade de pessoas: ");
        qntPessoas = sc.nextInt();

        double[] alturas = new double [qntPessoas];

        for(int i = 0; i < qntPessoas; i++){
            double altura;
            System.out.printf("Altura da pessoa %d: ", i+1);
            altura = sc.nextDouble();

            alturas[i] = altura;
            soma += altura;
        }

        double media = soma / (double)qntPessoas;
        System.out.printf("Altura média: %.2f", media);

        sc.close();
    }
}
