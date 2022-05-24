package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Company{

    private String name;
    private ArrayList <Vehicle> theVehicles;

    public Company(String name){
        this.setName(name);
        theVehicles = new ArrayList<Vehicle>();

        int[][] imagen = new int[4][4];
        Random random=new Random();
        int maxNum=99;
        for(int i=0;i<imagen.length;i++){
            for(int j=0;j<imagen[0].length;j++){
                imagen[i][j]=random.nextInt(maxNum);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String registerCarGasoline(double basePrice, String mark, int model, int cilinderCapacity, double kilometers,
            double ownerCardPriceN, int ownerCardYearN, int ownerCardImageN, String placa,int statusOption, double soatPriceN,
            int soatYearN, int soatImageN, double soatAccidentCoverageN, double tehnomechanicPriceN,
            int tehnomechanicYearN, int tehnomechanicImageN, int tehnomechanicGasLevels, int numDoor, boolean polarized,
            int typeCarOption, double gasolineCapacity, int gasolineOption) {

                String aux = "";

                OwnerCard ownerCard = new OwnerCard(ownerCardPriceN, ownerCardYearN, ownerCardImageN);

                SOAT soat = new SOAT( soatPriceN, soatYearN,  soatImageN,  soatAccidentCoverageN);

                Tehnomechanic tehnomechanic = new Tehnomechanic(tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevels);

                Gasoline gasolineCar = new Gasoline(basePrice, mark, model, cilinderCapacity, kilometers, ownerCard, placa, statusOption, soat, tehnomechanic,numDoor, polarized, typeCarOption, gasolineCapacity, gasolineOption);
                theVehicles.add(gasolineCar);

                aux = "The "+mark+" car of model "+model+" has been successfully registered.";

                return aux;
    }

    public String registerCarElectric(double basePrice, String mark, int model, int cilinderCapacity, double kilometers, double ownerCardPriceN, int ownerCardYearN, int ownerCardImageN, String placa, int statusOption, double soatPriceN, int soatYearN, int soatImageN, double soatAccidentCoverageN, double tehnomechanicPriceN, int tehnomechanicYearN, int tehnomechanicImageN, int tehnomechanicGasLevelsN, int numDoor, boolean polarized, int typeCarOption, int batteryDuration, int chargerOption){

        String aux = "";

                OwnerCard ownerCard = new OwnerCard(ownerCardPriceN, ownerCardYearN, ownerCardImageN);

                SOAT soat = new SOAT(soatPriceN, soatYearN,  soatImageN,  soatAccidentCoverageN);

                Tehnomechanic tehnomechanic = new Tehnomechanic(tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevelsN);

                Electric electricCar = new Electric(basePrice, mark, model, cilinderCapacity, kilometers, ownerCard, placa, statusOption, soat, tehnomechanic,numDoor, polarized, typeCarOption, batteryDuration, chargerOption);
                theVehicles.add(electricCar);

                aux = "The "+mark+" car of model "+model+" has been successfully registered..";

                return aux;
    }

    public String registerCarHybrid(double basePrice, String mark, int model, int cilinderCapacity, double kilometers, double ownerCardPriceN, int ownerCardYearN, int ownerCardImageN, String placa, int statusOption, double soatPriceN, int soatYearN, int soatImageN, double soatAccidentCoverageN, double tehnomechanicPriceN, int tehnomechanicYearN, int tehnomechanicImageN, int tehnomechanicGasLevelsN, int numDoor, boolean polarized, int typeCarOption, double gasolineCapacity, int gasolineOption, int batteryDuration, int chargerOption){
        String aux = "";

                OwnerCard ownerCard = new OwnerCard(ownerCardPriceN, ownerCardYearN, ownerCardImageN);

                SOAT soat = new SOAT(soatPriceN, soatYearN,  soatImageN,  soatAccidentCoverageN);

                Tehnomechanic tehnomechanic = new Tehnomechanic(tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevelsN);

                Hybrid hybridCar = new Hybrid(basePrice, mark, model, cilinderCapacity, kilometers, ownerCard, placa, statusOption, soat, tehnomechanic,numDoor, polarized, typeCarOption, gasolineCapacity, gasolineOption,batteryDuration, chargerOption, chargerOption);
                theVehicles.add(hybridCar);

                aux = "The "+mark+" car of model "+model+" has been successfully registered.";

                return aux;

    }

    public String registerMotorcycle(double basePrice, String mark, int model, int cilinderCapacity, double kilometers, double ownerCardPriceN, int ownerCardYearN, int ownerCardImageN, String placa, int statusOption, double soatPriceN, int soatYearN, int soatImageN, double soatAccidentCoverageN, double tehnomechanicPriceN, int tehnomechanicYearN, int tehnomechanicImageN, int tehnomechanicGasLevelsN, double gasolineCapacity, int typeMotoOption){
        String aux = "";

        OwnerCard ownerCard = new OwnerCard(ownerCardPriceN, ownerCardYearN, ownerCardImageN);

        SOAT soat = new SOAT(soatPriceN, soatYearN,  soatImageN,  soatAccidentCoverageN);

        Tehnomechanic tehnomechanic = new Tehnomechanic(tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevelsN);

        Motorcycle motomami = new Motorcycle(basePrice, mark, model, cilinderCapacity, kilometers, ownerCard, placa, statusOption, soat, tehnomechanic, gasolineCapacity, typeMotoOption);
        theVehicles.add(motomami);

        aux = "Motorcycle of the brand "+mark+" of model "+model+" has been successfully redistricted..";

        return aux;

    }

    public String calculateFinalPriceSold(String placa){

        String aux = "";
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        for(int i = 0; i <theVehicles.size(); i++){
            if(theVehicles.get(i).getPlaca().equalsIgnoreCase(placa)){
                double totBasePrice = theVehicles.get(i).getBasePrice();
                if(theVehicles.get(i).getSoatDate()<currentYear || theVehicles.get(i).getTehnomechanicDate()<currentYear){
                    totBasePrice += 500000;
                }
                if(theVehicles.get(i) instanceof Electric){
                    double aux1 = theVehicles.get(i).getBasePrice()*20/100;
                    totBasePrice += aux1;
                    if(theVehicles.get(i).getStatus() == Status.USED) {
                        double aux2 = totBasePrice*10/100;
                        totBasePrice -= aux2;
                    }

                }
                if(theVehicles.get(i) instanceof Hybrid){
                    double aux1 = theVehicles.get(i).getBasePrice()*15/100;
                    totBasePrice += aux1;
                    if(theVehicles.get(i).getStatus()==Status.USED){
                        double aux2 = totBasePrice*10/100;
                        totBasePrice -= aux2;
                    }
                }
                if(theVehicles.get(i) instanceof Gasoline){
                    if(theVehicles.get(i).getStatus()==Status.USED){
                        double aux1 = totBasePrice*10/100;
                        totBasePrice -= aux1;
                    }
                }
                if(theVehicles.get(i) instanceof Motorcycle){
                    double aux1 = theVehicles.get(i).getBasePrice()*4/100;
                    totBasePrice += aux1;
                    if(theVehicles.get(i).getStatus()==Status.USED){
                        double aux2 = totBasePrice*2/100;
                        totBasePrice -= aux2;
                    }
                }
                theVehicles.get(i).getSellPrice(totBasePrice);
                aux = "EThe price of the vehicle with license plate "+placa+" actualizado "+" \n The base price is: "+theVehicles.get(i).getBasePrice()+ "\n The selling price is: "+totBasePrice + "\n";
            }
            else{
                aux = "The vehicle with the registered license plate was not found..";
            }
        }
        return aux;
    }

    public String generateInformationn(int auxInform){
        String aux = "";
        switch(auxInform){
            case 1:{
                for(int i=0;i<theVehicles.size();i++){
                    if(theVehicles.get(i) instanceof Gasoline){
                        aux += "\nGasoline-powered car #" + (i+1) + "\n" +
                        theVehicles.get(i).toString();
                    }
                }
                for(int j=0;j<theVehicles.size();j++){
                    if(theVehicles.get(j) instanceof Electric){
                        aux += "\nElectric trolley #" + (j+1) + "\n" +
                        theVehicles.get(j).toString();
                    }
                }
                for(int k=0;k<theVehicles.size();k++){
                    if(theVehicles.get(k) instanceof Hybrid){
                        aux += "\nCarro hybrido #" + (k+1) + "\n" +
                        theVehicles.get(k).toString();
                    }
                }
            }
            case 2:{
                for(int i=0;i<theVehicles.size();i++){
                    if(theVehicles.get(i) instanceof Gasoline){
                        Gasoline auxGas = (Gasoline)theVehicles.get(i);
                        if(auxGas.getTypeGasoline()==GasolineType.EXTRA){
                            aux += "\nGasoline car Current:\n" + "Car #" + i + "\n" + 
                            auxGas.toString();
                        }
                    }
                }
                for(int j=0;j<theVehicles.size();j++){
                    if(theVehicles.get(j) instanceof Gasoline){
                        Gasoline auxGas = (Gasoline)theVehicles.get(j);
                        if(auxGas.getTypeGasoline()==GasolineType.CORRIENTE){
                            aux += "\nGasoline Gasoline Diesel:\n" + "Car #" + j + "\n" + 
                            auxGas.toString();
                        }
                    }
                }
                for(int k=0;k<theVehicles.size();k++){
                    if(theVehicles.get(k) instanceof Gasoline){
                        Gasoline auxGas = (Gasoline)theVehicles.get(k);
                        if(auxGas.getTypeGasoline()==GasolineType.DIESEL){
                            aux += "\nExtra Gasoline Gasoline:\n" + "Car #" + k + "\n" + 
                            auxGas.toString();
                        }
                    }
                }
                for(int z=0;z<theVehicles.size();z++){
                    if(theVehicles.get(z) instanceof Electric){
                        Electric auxElec = (Electric)theVehicles.get(z);
                        aux += "\nElectric Fuel:\n" + "Car #" + (z+1) + "\n" +
                        auxElec.toString();
                    }
                }
                for(int x=0;x<theVehicles.size();x++){
                    if(theVehicles.get(x) instanceof Hybrid){
                        Hybrid auxHyb = (Hybrid)theVehicles.get(x);
                        aux += "\nElectric Fuel:\n" + "Car #" + (x+1) + "\n" +
                        auxHyb.toString();
                    }
                }
            }
        return aux;
        }
         return aux;
    }

    public String toString(){
        String aux = "";
        for(int i=0;i<theVehicles.size();i++){
            aux += theVehicles.get(i).toString();
        }
        return aux;
    }
}
