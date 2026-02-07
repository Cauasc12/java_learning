package entities;

public class Genero {

    private String genero;
    private double altura;

    public Genero(String genero, double altura){
        this.genero = genero;
        this.altura = altura;
    }

    public String getGenero(){
        return genero;
    }
    public double getAltura(){
        return altura;
    }

}