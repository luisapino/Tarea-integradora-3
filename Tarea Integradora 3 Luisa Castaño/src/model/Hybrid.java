package model;

public class Hybrid extends Car implements BatteryConsume, GasolineConsume{

    private double gasolineCapacity;
    private double gasolineConsume;
    private GasolineType hybridTypeGasoline;
    private TypeCharger hybridTypeCharger;
    private double batterDuration;
    private double batteryConsume;
    
    public Hybrid(double basePrice, String mark, int model, int cilinderCapacity, double kilometers,
            OwnerCard ownerCard, String placa, int statusOption, SOAT soat, Tehnomechanic tehnomechanic, int numDoor,
            boolean polarized, int typeCarOption, double gasolineCapacity, int gasolineOption, double batterDuration,
            double batteryConsume, int chargerOption) {
        super(basePrice, mark, model, cilinderCapacity, kilometers, ownerCard, placa, statusOption, soat, tehnomechanic,
                numDoor, polarized, typeCarOption);
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsume = calculateGasolineConsume();
        this.batterDuration = batterDuration;
        this.batteryConsume = calculateBatteryConsume();
        switch(gasolineOption){
            case 1:{
                hybridTypeGasoline = GasolineType.EXTRA;
                break;
            }
            case 2:{
                hybridTypeGasoline = GasolineType.CORRIENTE;
                break;
            }
            case 3:{
                hybridTypeGasoline = GasolineType.DIESEL;
                break;
            }
        }
        switch(chargerOption){
            case 1:{
                hybridTypeCharger = TypeCharger.FAST;
                break;
            }
            case 2:{
                hybridTypeCharger = TypeCharger.NORMAL;
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

    public GasolineType getHybridTypeGasoline() {
        return hybridTypeGasoline;
    }

    public void setHybridTypeGasoline(GasolineType hybridTypeGasoline) {
        this.hybridTypeGasoline = hybridTypeGasoline;
    }

    public TypeCharger getHybridTypeCharger() {
        return hybridTypeCharger;
    }

    public void setHybridTypeCharger(TypeCharger hybridTypeCharger) {
        this.hybridTypeCharger = hybridTypeCharger;
    }

    public double getBatterDuration() {
        return batterDuration;
    }

    public void setBatterDuration(double batterDuration) {
        this.batterDuration = batterDuration;
    }

    public double getBatteryConsume() {
        return batteryConsume;
    }

    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }

    public double calculateGasolineConsume(){
        double auxConsume = gasolineCapacity*(super.getCilinderCapacity()/180);
        return auxConsume;
    }

    public double calculateBatteryConsume() {
        double auxConsume = 0.0;
        if(hybridTypeCharger == TypeCharger.FAST){
            auxConsume = ((batterDuration)*(super.getCilinderCapacity()/200));
        }else if(hybridTypeCharger == TypeCharger.NORMAL){
            auxConsume = ((batterDuration+7)*(super.getCilinderCapacity()/200));
        }
        return auxConsume;
    }

    public String toString(){
        return super.toString() +"\n"+
        "El tipo de gasolina es: "+hybridTypeGasoline+"\n"
        +"La capacidad de gasolina es: "+gasolineCapacity+"\n"
        +"El consumo de gasolina es: "+gasolineConsume+"\n"
        +"El tipo de carga es: "+hybridTypeCharger+"\n"
        +"La duraci??n de la bateria es: "+batterDuration+"\n"
        +"El consumo de bateria es: "+batteryConsume+"\n";
    }
}