package model;

public class Motorcycle extends Vehicle implements GasolineConsume {

    private double gasolineCapacity;
    private double gasolineConsume;
    private MotorcycleType motorcycleType;

    public Motorcycle(double basePrice, double sellPrice, String mark, String model, int cilinderCapacity,
            double kilometers, String placa, OwnerCard ownerCard, int statusOption, Status status, SOAT soat,
            Tehnomechanic tehnomechanic, double gasolineCapacity, double gasolineConsume, int typeMotoOption,
            MotorcycleType motorcycleType) {
        super(basePrice, sellPrice, mark, model, cilinderCapacity, kilometers, placa, ownerCard, statusOption, status,
                soat, tehnomechanic);
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsume = calculateGasolineConsume();
        switch (typeMotoOption){
            case 1:{
                motorcycleType = MotorcycleType.STANDAR;
                break;
            }
            case 2:{
                motorcycleType = MotorcycleType.SPORT;
                break;
            }
            case 3:{
                motorcycleType = MotorcycleType.SCOOTER;
                break;
            }
            case 4:{
                motorcycleType = MotorcycleType.CROSS;
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

    public MotorcycleType getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(MotorcycleType motorcycleType) {
        this.motorcycleType = motorcycleType;
    }
    
    public String toString(){
        return super.toString() + "\n"+
        "El tipo de motocicleta es:"+motorcycleType+"\n"+
        "La capacidad de gasolina es: "+gasolineCapacity+"\n"+
        "El consumo de gasolina es: "+gasolineConsume;
    }

    public double calculateGasolineConsume(){
        double gasolineConsume = ((gasolineCapacity)*(super.getCilinderCapacity()/75));
        return gasolineConsume;
    }
}