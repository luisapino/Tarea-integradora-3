package model;

public class Gasoline extends Car implements GasolineConsume{
    private double gasolineCapacity;
    private double gasolineConsume;
    private GasolineType typeGasoline;
    
    public Gasoline(double basePrice, String mark, int model, int cilinderCapacity, double kilometers,
            OwnerCard ownerCard, String placa, int statusOption, SOAT soat, Tehnomechanic tehnomechanic, int numDoor,
            boolean polarized, int typeCarOption, double gasolineCapacity, int gasolineOption) {
        super(basePrice, mark, model, cilinderCapacity, kilometers, ownerCard, placa, statusOption, soat, tehnomechanic,
                numDoor, polarized, typeCarOption);
        gasolineCapacity = basePrice;
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsume = calculateGasolineConsume();
        typeGasoline = null;
        switch(gasolineOption){
            case 1:{
                typeGasoline = GasolineType.EXTRA;
                break;
            }
            case 2:{
                typeGasoline = GasolineType.CORRIENTE;
                break;
            }
            case 3:{
                typeGasoline = GasolineType.DIESEL;
                break;
            }
        }
    }

    public double getGasolineCapacity() {
        return gasolineCapacity;
    }

    public void setGasolineCapacity(double gasolineCapacity) {
        this.gasolineCapacity = gasolineCapacity;
    }

    public double getGasolineConsume() {
        return gasolineConsume;
    }

    public void setGasolineConsume(double gasolineConsume) {
        this.gasolineConsume = gasolineConsume;
    }

    public GasolineType getTypeGasoline() {
        return typeGasoline;
    }

    public void setTypeGasoline(GasolineType typeGasoline) {
        this.typeGasoline = typeGasoline;
    }
    
    public double calculateGasolineConsume(){
        double auxConsume = ((gasolineCapacity)*(super.getCilinderCapacity()/150));
        return auxConsume;
    }

    public String toString(){
        return super.toString()+"\n"+
        "El tipo de gasoline es: "+typeGasoline+"\n"+
        "La capacidad de gasolina es: "+gasolineCapacity+"\n"+
        "El soncumo de gasolina es: "+gasolineConsume+"\n";
    }
}