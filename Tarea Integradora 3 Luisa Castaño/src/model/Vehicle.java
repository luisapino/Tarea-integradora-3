package model;

public class Vehicle {

    private double basePrice; 
    private double sellPrice;
    private String mark;
    private String model;
    private int cilinderCapacity;
    private double kilometers;
    private String placa;
    private OwnerCard ownerCard;
    private Status status;
    private SOAT soat;
    private Tehnomechanic tehnomechanic;
    
    public Vehicle(double basePrice, String mark, String model, int cilinderCapacity,
            double kilometers, OwnerCard ownerCard,String placa, int statusOption, SOAT soat,
            Tehnomechanic tehnomechanic) {
        this.basePrice = basePrice;
        this.sellPrice = 0;
        this.mark = mark;
        this.model = model;
        this.cilinderCapacity = cilinderCapacity;
        this.kilometers = kilometers;
        this.placa = placa;
        this.ownerCard = ownerCard;
        status = null;
        if(statusOption == 1){
            status = Status.NEW;
        }else if(statusOption == 2){
            status = Status.USED;
        }
        this.soat = soat;
        this.tehnomechanic = tehnomechanic;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCilinderCapacity() {
        return cilinderCapacity;
    }

    public void setCilinderCapacity(int cilinderCapacity) {
        this.cilinderCapacity = cilinderCapacity;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public OwnerCard getOwnerCard() {
        return ownerCard;
    }

    public void setOwnerCard(OwnerCard ownerCard) {
        this.ownerCard = ownerCard;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public SOAT getSoat() {
        return soat;
    }

    public void setSoat(SOAT soat) {
        this.soat = soat;
    }

    public Tehnomechanic getTehnomechanic() {
        return tehnomechanic;
    }

    public void setTehnomechanic(Tehnomechanic tehnomechanic) {
        this.tehnomechanic = tehnomechanic;
    }
    public int getSoatDate(){
        return soat.getYear();
    }

    public int getTehnomechanicDate(){
        return tehnomechanic.getYear();
    }
    public String toString(){
        String auxSoat = "";
        String auxTehnomechanic = "";
        String auxOwnerCard = "";
        String auxPrice = "";
        if(ownerCard != null){
           auxSoat = ownerCard.toString();
        }else{
            auxSoat = "No es válido";
        }
        if(tehnomechanic != null){
            auxTehnomechanic = tehnomechanic.toString();
        } else{
            auxTehnomechanic = "No es válido";
        }
        if(ownerCard != null){
            auxOwnerCard = ownerCard.toString();
        }else{
            auxOwnerCard = "No es válido";
        }
        if(sellPrice == 0){
            auxPrice = "No se ha calculado este valor.";
        }
        return "\nEl recio base es: " + basePrice + "\n" +
        "El precio de venta es: " + sellPrice + auxPrice + "\n" +
        "La marca es: " + mark + "\n" +
        "Año del modelo: " + model + "\n" +
        "cilindraje: " + cilinderCapacity + "\n" +
        "kilometraje: " + kilometers + "\n" +
        "Placa: " + placa + "\n" +
        "Estado: " + status + "\n" +
        "Tarjeta de propiedad:\n" + auxOwnerCard + "\n" + 
        "SOAT:\n" + soat + "\n" +
        "Tecnomecanica:\n" + tehnomechanic + "\n";
    }
      
}