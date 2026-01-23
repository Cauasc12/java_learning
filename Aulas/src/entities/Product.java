package entities;

public class Product {
    //Atributos
    private String name;
    private double price;
    private int quantity;

    //Construtores
    public Product(){
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    //Geters
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    //Seters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //Métodos
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "\nName:" + name
                + "\nPrice: " + String.format("%.2f", price)
                + "\nQuantity: " + quantity
                + "\nTotal in Stock: " + String.format("%.2f", totalValueInStock());
    }
}