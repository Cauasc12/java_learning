package util;

public class Cambio {

    public static double ConversaoDolarReal(double cotacao, double valor){
        return (valor*1.06) * cotacao;
    }
}