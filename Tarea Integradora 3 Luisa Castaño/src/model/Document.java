package model;

public class Document {

    private double price;
    private int year; 
    private int image;
    
    public Document(double price, int year, int image) {
        this.price = price;
        this.year = year;
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    
    public String toString(){
        return 
        "\nEl precio es:"+price+
        "\nEl año es: "+year+
        "\nLa imagen es: "+image+ "\n";
    }
}