package model;

import java.util.ArrayList;
import java.util.Calendar;

import javax.lang.model.type.ArrayType;

public class Company{

    private String name;
    private ArrayList <Vehicle> theVehicles;

    public Company(String name){
        this.setName(name);
        theVehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void registerCarGasoline(double basePrice, String mark, int model, int cilinderCapacity, double kilometers,
            double ownerCardPriceN, int ownerCardYearN, int ownerCardImageN, String placa,int statusOption, double soatPriceN,
            int soatYearN, int soatImageN, double soatAccidentCoverageN, double tehnomechanicPriceN,
            int tehnomechanicYearN, int tehnomechanicImageN, int tehnomechanicGasLevels, int numDoor, boolean polarized,
            int typeCarOption, double gasolineCapacity, int gasolineOption) {

                String aux = "";

                OwnerCard ownerCard = new OwnerCard(ownerCardPriceN, ownerCardYearN, ownerCardImageN);

                SOAT soat = new SOAT( soatPriceN, soatYearN,  soatImageN,  soatAccidentCoverageN);

                Tehnomechanic tehnomechanic = new Tehnomechanic(tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevels);

                Gasoline gasolineCar = new Gasoline(basePrice, mark, model, cilinderCapacity,kilometers, ownerCard, placa, statusOption, soat, tehnomechanic, numDoor, polarized, typeCarOption, gasolineCapacity, gasolineOption);
    }
    


}
