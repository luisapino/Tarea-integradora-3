package model;

public class Tehnomechanic extends Document{

    private int gasLevels;

    public Tehnomechanic(double price, int year, int image, int gasLevels) {
        super(price, year, image);
        this.setGasLevels(gasLevels);
    }

    public int getGasLevels() {
        return gasLevels;
    }

    public void setGasLevels(int gasLevels) {
        this.gasLevels = gasLevels;
    }

    public String toString() {
        return super.toString()+"Los niveles de gas arrojados por el vehiculo es de: "+gasLevels;
    } 
}
