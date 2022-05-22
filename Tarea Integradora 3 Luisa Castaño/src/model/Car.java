package model;

public class Car extends Vehicle {

    private int numDoor;
    private boolean polarized;
    private CarType theCarType;
    
    public Car(double basePrice, String mark, String model, int cilinderCapacity, double kilometers,
             OwnerCard ownerCard,String placa, int statusOption, SOAT soat, Tehnomechanic tehnomechanic,
            int numDoor, boolean polarized, int typeCarOption) {
        super(basePrice, mark, model, cilinderCapacity, kilometers, placa, ownerCard, statusOption,
                soat, tehnomechanic);
        this.numDoor = numDoor;
        this.polarized = polarized;
        theCarType = null;
        switch(typeCarOption){
            case 1:{
                theCarType = CarType.SEDAN;
                break;
            }
            case 2:{
                theCarType = CarType.PICKUPTRUCK;
                break;
            }
        }
    }

    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public boolean isPolarized() {
        return polarized;
    }

    public void setPolarized(boolean polarized) {
        this.polarized = polarized;
    }

    public CarType getTheCarType() {
        return theCarType;
    }

    public void settheCarType(CarType theCarType) {
        this.theCarType = theCarType;
    }

    public String toString(){
        return super.toString() + "\n"+ 
        "El númeor de puertas es: " +numDoor+ "\n"+
        "El carro tiene polarización de ventanas: " +polarized+ "\n"+
        "El tipo de carro es: "+theCarType+"\n";
    }
    
}