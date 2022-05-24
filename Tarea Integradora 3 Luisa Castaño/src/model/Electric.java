package model;

public class Electric extends Car implements BatteryConsume{

    private TypeCharger typeCharger;
    private double batteryDuration;
    private double batteryConsume;
    
    public Electric(double basePrice, String mark, int model, int cilinderCapacity, double kilometers,
            OwnerCard ownerCard, String placa, int statusOption, SOAT soat, Tehnomechanic tehnomechanic, int numDoor,
            boolean polarized, int typeCarOption, double batteryDuration, int chargerOption) {
        super(basePrice, mark, model, cilinderCapacity, kilometers, ownerCard, placa, statusOption, soat, tehnomechanic,
                numDoor, polarized, typeCarOption);
                switch(chargerOption){
                    case 1:{
                        typeCharger = TypeCharger.FAST;
                        break;
                    }
                    case 2:{
                        typeCharger = TypeCharger.NORMAL;
                        break;
                    }
                }

        this.batteryDuration = batteryDuration;
        this.batteryConsume = calculateBatteryConsume();
    }

    public TypeCharger getTypeCharger() {
        return typeCharger;
    }
    public void setTypeCharger(TypeCharger typeCharger) {
        this.typeCharger = typeCharger;
    }
    public double getBatteryDuration() {
        return batteryDuration;
    }
    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }
    public double getBatteryConsume() {
        return batteryConsume;
    }
    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }
    
    public double calculateBatteryConsume(){
        double auxConsume = 0.0;
        if(typeCharger == TypeCharger.FAST){
            auxConsume = ((batteryDuration+13)*(super.getCilinderCapacity()/100));
        }else if (typeCharger == TypeCharger.NORMAL) {
            auxConsume = ((batteryDuration+18)*(super.getCilinderCapacity()/100));
        }
        return auxConsume;
    }

    public String toString(){
        return super.toString() + "\n"+
        "El tipo de carga es: " +typeCharger+"\n"+
        "La duración de la bateria es de: "+batteryDuration+"\n"
        +"El consumo de bateria es de: "+batteryConsume+"\n";
    }
}