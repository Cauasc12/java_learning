    package application;

    import entities.Genero;

    import java.util.Scanner;

    public class GeneroProgram {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.print("Qantas pessoas serão digitadas? ");
            int qntPessoas = sc.nextInt();

            Genero[] vetor = new Genero[qntPessoas];

            double maiorAltura = 0, menoraAltura = 99;
            double somaAlturaMulheres = 0;
            int qntHomens = 0, qntMulheres = 0;


            for(int i = 0; i < qntPessoas; i++){
                System.out.printf("Informações da pessoa %d", i+1);

                System.out.print("\nGênero: ");
                sc.nextLine();
                String genero = sc.next();
                System.out.print("Altura: ");
                double altura  = sc.nextDouble();

                vetor[i] = new Genero(genero, altura);
            }


            for(int i = 0; i < qntPessoas; i++){
                double altura = vetor[i].getAltura();
                String genero = vetor[i].getGenero();

                if(altura > maiorAltura){
                    maiorAltura = altura;
                }
                if(altura < menoraAltura){
                    menoraAltura = altura;
                }

                if(genero.equalsIgnoreCase("H") ){
                    qntHomens++;
                }

                if(genero.equalsIgnoreCase("M")){
                    somaAlturaMulheres += altura;
                    qntMulheres++;
                }
            }

            double mediaAlturaMulheres;

            if(qntMulheres > 0){
                mediaAlturaMulheres = somaAlturaMulheres / (double)qntMulheres;

            }
            else{
                mediaAlturaMulheres = 0.0;
            }

            System.out.printf("\nMenor Altura: %.2f", menoraAltura);
            System.out.printf("\nMaior Altura: %.2f", maiorAltura);
            System.out.printf("\nMedia da altura das mulheres: %.2f", mediaAlturaMulheres);
            System.out.printf("\nNumero de homens: %d", qntHomens);

            sc.close();
        }
    }
