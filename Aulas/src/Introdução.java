import java.util.Locale;

public class Introdução {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 10.35784;
        int y = 32;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f\n", x);
        System.out.println("Bom dia!!");

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$%.2f reais\n", nome, idade, renda);

    }
}
