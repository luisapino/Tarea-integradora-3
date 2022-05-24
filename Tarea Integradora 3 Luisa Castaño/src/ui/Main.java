package ui;
import java.util.Scanner;
import model.Company;

public class Main{
    public static Company company;
    public static Scanner lector;
    /**
 * Author : Luisa Castaño
 * in this method, you will be able to enter an option according to 
 * a menu that will be presented to you, with which you will be 
 * presented with a series of information.
 * <b>pre. </b> That the person enters valid values, otherwise a 
 * successful registration is not possible, And choose a valid 
 * number from the menu of options.<br>
 * <b>post: </b> Information related to the option chosen by the user.
 * @param option option is the integer type variable that will store 
 * the number entered by the user as an option. poption != null && poption !="".
*/

    public static void main(String [] args){
        company = new Company("ICESI");
        lector = new Scanner(System.in);

        int option = options();
        while(option != 4){
            switch (option){
                case 1:{
                    registerVehicle();
                    break;
                }
                case 2:{
                    calculateFinalPriceSold();

                    break;
                }
                case 3:{
                    generateInformation();

                    break;
                }
                
            }
            option = options();
            
        }  
    }
    /**
     * Name : options
     * user options menu
     * <b>pre: </b> the person enters a whole number. <br>
     * <b>post: </b> the action is performed according to the option chosen by the user.
     * @return return of the option chosen in the menu.
     */
    public static int options(){

        System.out.println("Menu: you have the following options");
        System.out.println("Type the number 1 if you want register vehicles (new or used) for sale.");
        System.out.println("Type the number 2 if you want calculating the total selling price of a vehicle");
        System.out.println("Type the number 3 if you want generate reports with all vehicle data.");
        System.out.println("Type the number 4 to finish the process.");
        int menu = lector.nextInt();
        lector.nextLine();
        return menu;
    }
    /**
     * Name: registerVehicle
     * this method will take care of registering all available vehicles, 
     * such as cars of different types or motorcycles.
     * <b>pre: </b> the person enters a whole number. <br>
     * <b>post: </b> the action is performed according to the option chosen by the user.
     * @param typeVehicleOption option to determine whether to register a car or a motorcycle.
     */
    public static void registerVehicle(){
        System.out.println("Vehicle registration will begin.");
        System.out.println("Enter the type of vehicle");
        System.out.println("Enter 1 if it is a car.");
        System.out.println("Enter 2 if it is a motorcycle.");
        int typeVehicleOption = lector.nextInt();
        if(typeVehicleOption != 1 && typeVehicleOption != 2){
            System.out.println("The option entered is incorrect, please enter a valid option.");
            typeVehicleOption = lector.nextInt();
        }
        lector.nextLine();
        switch(typeVehicleOption){
            case 1:{
                System.out.println("What type of car do you have?");
                System.out.println("Type 1 if it is gasoline.");
                System.out.println("Type 2 if it is electric.");
                System.out.println("Type 3 if it is hybrid.");
                    int typeCarOption = lector.nextInt();
                    if(typeCarOption != 1 && typeCarOption != 2 && typeCarOption != 3){
                        System.out.println("Invalid option, please enter a correct option.");
                        typeCarOption = lector.nextInt();
                    }
                    lector.nextLine();
                    switch(typeCarOption){
                        case 1:{
                            registerCarGasoline();
                            break;
                        }
                        case 2:{
                            registerElectricCar();
                            break;
                        }
                        case 3:{
                            registerHybridCar();
                            break;	
                        }

                    }
                    lector.nextLine();
                    break;
            }
            case 2:{
                registerMotorcycle();
                break;
            } 
        }
    }
    /**
     * Name: registerCarGasoline
     * this method registers gasoline-powered cars.
     * <b>pre: </b> the person enters a whole number. <br>
     * <b>post: </b> the action is performed according to the option chosen by the user.
     * @param typeCarOption option to determine whether to register a car or a motorcycle.
     * @param basePrice this is the base price of the vehicle
     * @param mark this is the make of the vehicle
     * @param model this is the model of the vehicle
     * @param cilinderCapacity this is the vehicle's displacement capacity
     * @param kilometers this is the mileage of the vehicle
     * @param numDoor this is the parameter that records the number of doors of the vehicle
     * @param polarizaionOption this is the parameter that records whether the windows are tinted or not
     * @param gasolineOption this is the parameter that registers the gasoline options
     */
    public static void registerCarGasoline(){
        System.out.println("Enter the type of car you have.");
        System.out.println("Type 1 if it is SEDAN.");
        System.out.println("Enter 2 if it is a PICKUP TRUCK");
        int typeCarOption = lector.nextInt();
        if(typeCarOption != 1 && typeCarOption != 2){
            System.out.println("Incorrect option, please enter a valid option.r");
            typeCarOption = lector.nextInt();
        }
        System.out.println("Enter the base price of the car: ");
        double basePrice = lector.nextDouble();
        lector.nextLine();
        System.out.println("Enter the vehicle make: ");
        String mark = lector.nextLine();
        System.out.println("Enter the model year of the car: ");
        int model = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the vehicle displacement: ");
        int cilinderCapacity = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the vehicle mileage: ");
        double kilometers = lector.nextDouble();
        lector.nextLine();
        System.out.println("Enter the number of doors: ");
        int numDoor = lector.nextInt();
        lector.nextLine();
        System.out.println("Are the windows of your vehicle tinted? If yes, type: yes ");
        System.out.println("If they are not polarized, enter: no");
        String polarizaionOption = lector.nextLine();
        boolean polarized = false;
        if(polarizaionOption.equalsIgnoreCase( "yes")){
            polarized = true;
        }
        else if(polarizaionOption.equalsIgnoreCase( "no")){
            polarized = false;
        }
        System.out.println("What type of gasoline does the car use?");
        System.out.println("Type 1 for extra type gasoline.");
        System.out.println("Type 2 for regular type gasoline.");
        System.out.println("Enter 3 for diesel type gasoline.");
        int gasolineOption = lector.nextInt();
        lector.nextLine(); 
        System.out.println("Enter what is the capacity of the gas tank in gallons");
        double gasolineCapacity = lector.nextDouble();
        lector.nextLine();
        System.out.println("Is the vehicle you are registering new or used?");
        System.out.println("Enter 1 if new");
        System.out.println("Enter 2 if used");
        int statusOption = lector.nextInt();
        if(statusOption != 1 && statusOption != 2){
            System.out.println("Incorrect option, please enter a valid option");
            statusOption = lector.nextInt();
        }
        lector.nextLine();
        String placa = "";
        if (statusOption ==2){
            System.out.println("Please enter the license plate number of the vehicle: ");
            placa = lector.nextLine();
        } else{
            placa = "The car is new, so it does not have a license plate yet.";
        }

        System.out.println("Information from the car documentation will now be recorded: ");
        switch(statusOption){
            case 1:{
                //Datos de el SOAT, tecnomecánica y la tarjeta de propiedad del carro nuevo
            double soatPriceN = 0.0;
                int soatYearN = 0;
                int soatImageN = 0;
                double soatAccidentCoverageN = 0.0;

            double ownerCardPriceN = 0.0;
                int ownerCardYearN = 0;
                int ownerCardImageN = 0;

            double tehnomechanicPriceN = 0.0;
                int tehnomechanicYearN = 0;
                int tehnomechanicImageN = 0;

                System.out.println("What is the value of technomechanics?");
                tehnomechanicPriceN = lector.nextDouble();
                System.out.println("What is the year of technomechanics?");
                tehnomechanicYearN = lector.nextInt();
                lector.nextLine();
                System.out.println("Enter the image of the technomechanics");
                tehnomechanicImageN = lector.nextInt();
                lector.nextLine();
                System.out.println("Enter the level of gas emitted by the vehicle.");
                int tehnomechanicGasLevelsN = lector.nextInt();
                lector.nextLine();
                company.registerCarGasoline( basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceN, ownerCardYearN, ownerCardImageN, placa,statusOption, soatPriceN,soatYearN,soatImageN, soatAccidentCoverageN,tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevelsN, numDoor, polarized, typeCarOption, gasolineCapacity, gasolineOption);
                break;
            }
            case 2:{
                //Datos de el SOAT, tecnomecánica y la tarjeta de propiedad del carro usado
            double soatPriceU;
                int soatYearU;
                int soatImageU;
                double soatAccidentCoverageU;
            double ownerCardPriceU;
                int ownerCardYearU;
                int ownerCardImageU;
            double tehnomechanicPriceU;
                int tehnomechanicYearU;
                int tehnomechanicImageU;
                int tehnomechanicGasLevelsU;

                System.out.println("Does the vehicle have a SOAT? if yes, type yes, otherwise type no.");
                String auxSoat = lector.nextLine();
                if(auxSoat.equalsIgnoreCase("si")){
                    System.out.println("Since you have SOAT, what is the value of the SOAT?");
                    soatPriceU = lector.nextDouble();
                    System.out.println("What year is the SOAT?");
                    soatYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the image of the SOAT?");
                    soatImageU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the coverage of the SOAT to cover accidents as far as third parties are concerned?");
                    soatAccidentCoverageU = lector.nextDouble();
                    lector.nextLine();
                } else{
                soatPriceU = 0.0;
                soatYearU = 0;
                soatImageU = 0;
                soatAccidentCoverageU = 0.0;
                }
                System.out.println("Is the car technomechanical? if so, type yes, otherwise type no.");
                String auxTecnoU = lector.nextLine();
                if(auxTecnoU.equalsIgnoreCase( "yes")){
                    System.out.println("Since you have Tecnomecanica, what is the value of Tecnomecanica?");
                    tehnomechanicPriceU = lector.nextDouble();
                    System.out.println("What is the price of the technomechanics?");
                    tehnomechanicYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the image of the technomechanics?");
                    tehnomechanicImageU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the level of gases emitted by this car?");
                    tehnomechanicGasLevelsU = lector.nextInt();
                    lector.nextLine();
                }else{
                tehnomechanicPriceU = 0.0;
                tehnomechanicYearU = 0;
                tehnomechanicImageU = 0;
                tehnomechanicGasLevelsU = 0;
                }
                System.out.println("Does the car have an ownership card? if yes, type yes, otherwise type no.");
                String auxOwnerCard = lector.nextLine();
                if(auxOwnerCard.equalsIgnoreCase( "yes")){
                    System.out.println("If you have a property card, enter the value of the property card.");
                    ownerCardPriceU = lector.nextDouble();
                    System.out.println("Enter the year of the ownership card");
                    ownerCardYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Type the image of the property card");
                    ownerCardImageU = lector.nextInt();
                    lector.nextLine();
                }else{
                    ownerCardPriceU = 0.0;
                    ownerCardYearU = 0;
                    ownerCardImageU = 0;
                }
                company.registerCarGasoline(basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceU, ownerCardYearU, ownerCardImageU, placa,statusOption, soatPriceU,soatYearU,soatImageU, soatAccidentCoverageU, tehnomechanicPriceU, tehnomechanicYearU, tehnomechanicImageU, tehnomechanicGasLevelsU, numDoor, polarized, typeCarOption, gasolineCapacity, gasolineOption);
                break;
            }
        }
    }
    /**
     * Name: registerElectricCar
     * this method registers gasoline-powered cars.
     * <b>pre: </b> the person enters a whole number. <br>
     * <b>post: </b> the action is performed according to the option chosen by the user.
     * @param typeCarOption option to determine whether to register a car or a motorcycle.
     * @param basePrice this is the base price of the vehicle
     * @param mark this is the make of the vehicle
     * @param model this is the model of the vehicle
     * @param cilinderCapacity this is the vehicle's displacement capacity
     * @param kilometers this is the mileage of the vehicle
     * @param numDoor this is the parameter that records the number of doors of the vehicle
     * @param polarizaionOption this is the parameter that records whether the windows are tinted or not
     * @param gasolineOption this is the parameter that registers the gasoline options
     */

    public static void registerElectricCar(){
        System.out.println("Enter the type of car you have.");
        System.out.println("Type 1 if it is SEDAN.");
        System.out.println("Enter 2 if it is a PICKUP TRUCK");
        int typeCarOption = lector.nextInt();
        if(typeCarOption != 1 && typeCarOption != 2){
            System.out.println("Incorrect option, please enter a valid option.r");
            typeCarOption = lector.nextInt();
        }
        System.out.println("Enter the base price of the car: ");
        double basePrice = lector.nextDouble();
        lector.nextLine();
        System.out.println("Enter the vehicle make: ");
        String mark = lector.nextLine();
        System.out.println("Enter the model year of the car: ");
        int model = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the vehicle displacement: ");
        int cilinderCapacity = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the vehicle mileage: ");
        double kilometers = lector.nextDouble();
        lector.nextLine();
        System.out.println("Enter the number of doors: ");
        int numDoor = lector.nextInt();
        lector.nextLine();
        System.out.println("Are the windows of your vehicle tinted? If yes, type: yes ");
        System.out.println("If they are not polarized, enter: no");
        String polarizaionOption = lector.nextLine();
        boolean polarized = false;
        if(polarizaionOption.equalsIgnoreCase( "yes")){
            polarized = true;
        }
        else if(polarizaionOption.equalsIgnoreCase( "no")){
            polarized = false;
        }
        System.out.println("What is the type of charge the vehicle has?");
        System.out.println("Enter 1 if it is a fast charge.");
        System.out.println("Type 2 if it is a normal charge.");
        int chargerOption = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the battery life");
        int batteryDuration = lector.nextInt();
        lector.nextLine();
        System.out.println("Is the vehicle you are registering new or used?");
        System.out.println("Enter 1 if new");
        System.out.println("Enter 2 if used");
        int statusOption = lector.nextInt();
        if(statusOption != 1 && statusOption != 2){
            System.out.println("Incorrect option, please enter a valid option");
            statusOption = lector.nextInt();
        }
        lector.nextLine();
        String placa = "";
        if (statusOption ==2){
            System.out.println("Please enter the license plate number of the vehicle: ");
            placa = lector.nextLine();
        } else{
            placa = "The car is new, so it does not have a license plate yet.";
        }

        System.out.println("Information from the car documentation will now be recorded: ");
            switch(statusOption){
                case 1:{
                    //Datos de el SOAT, tecnomecánica y la tarjeta de propiedad del carro nuevo
                double soatPriceN = 0.0;
                    int soatYearN = 0;
                    int soatImageN = 0;
                    double soatAccidentCoverageN = 0.0;
                double ownerCardPriceN = 0.0;
                    int ownerCardYearN = 0;
                    int ownerCardImageN = 0;
                double tehnomechanicPriceN = 0.0;
                    int tehnomechanicYearN = 0;
                    int tehnomechanicImageN = 0;
    
                System.out.println("What is the value of technomechanics?");
                tehnomechanicPriceN = lector.nextDouble();
                System.out.println("What is the year of technomechanics?");
                tehnomechanicYearN = lector.nextInt();
                lector.nextLine();
                System.out.println("Enter the image of the technomechanics");
                tehnomechanicImageN = lector.nextInt();
                lector.nextLine();
                System.out.println("Enter the level of gas emitted by the vehicle.");
                int tehnomechanicGasLevelsN = lector.nextInt();
                lector.nextLine();
                    company.registerCarElectric(basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceN, ownerCardYearN, ownerCardImageN, placa,statusOption, soatPriceN,soatYearN,soatImageN, soatAccidentCoverageN,tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevelsN, numDoor, polarized, typeCarOption, batteryDuration, chargerOption);
                    break;
                }
                case 2:{
                    //Datos de el SOAT, tecnomecánica y la tarjeta de propiedad del carro usado
                double soatPriceU;
                    int soatYearU;
                    int soatImageU;
                    double soatAccidentCoverageU;
                double ownerCardPriceU;
                    int ownerCardYearU;
                    int ownerCardImageU;
                double tehnomechanicPriceU;
                    int tehnomechanicYearU;
                    int tehnomechanicImageU;
                    int tehnomechanicGasLevelsU;
    
                    System.out.println("Does the vehicle have a SOAT? if yes, type yes, otherwise type no.");
                String auxSoat = lector.nextLine();
                if(auxSoat.equalsIgnoreCase("si")){
                    System.out.println("Since you have SOAT, what is the value of the SOAT?");
                    soatPriceU = lector.nextDouble();
                    System.out.println("What year is the SOAT?");
                    soatYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the image of the SOAT?");
                    soatImageU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the coverage of the SOAT to cover accidents as far as third parties are concerned?");
                    soatAccidentCoverageU = lector.nextDouble();
                    lector.nextLine();
                } else{
                soatPriceU = 0.0;
                soatYearU = 0;
                soatImageU = 0;
                soatAccidentCoverageU = 0.0;
                }
                System.out.println("Is the car technomechanical? if so, type yes, otherwise type no.");
                String auxTecnoU = lector.nextLine();
                if(auxTecnoU.equalsIgnoreCase( "yes")){
                    System.out.println("Since you have Tecnomecanica, what is the value of Tecnomecanica?");
                    tehnomechanicPriceU = lector.nextDouble();
                    System.out.println("What is the price of the technomechanics?");
                    tehnomechanicYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the image of the technomechanics?");
                    tehnomechanicImageU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the level of gases emitted by this car?");
                    tehnomechanicGasLevelsU = lector.nextInt();
                    lector.nextLine();
                }else{
                tehnomechanicPriceU = 0.0;
                tehnomechanicYearU = 0;
                tehnomechanicImageU = 0;
                tehnomechanicGasLevelsU = 0;
                }
                System.out.println("Does the car have an ownership card? if yes, type yes, otherwise type no.");
                String auxOwnerCard = lector.nextLine();
                if(auxOwnerCard.equalsIgnoreCase( "yes")){
                    System.out.println("If you have a property card, enter the value of the property card.");
                    ownerCardPriceU = lector.nextDouble();
                    System.out.println("Enter the year of the ownership card");
                    ownerCardYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Type the image of the property card");
                    ownerCardImageU = lector.nextInt();
                    lector.nextLine();
                }else{
                    ownerCardPriceU = 0.0;
                    ownerCardYearU = 0;
                    ownerCardImageU = 0;
                }
                    company.registerCarElectric(basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceU, ownerCardYearU, ownerCardImageU, placa,statusOption, soatPriceU,soatYearU,soatImageU, soatAccidentCoverageU,tehnomechanicPriceU, tehnomechanicYearU, tehnomechanicImageU, tehnomechanicGasLevelsU, numDoor, polarized, typeCarOption, batteryDuration, chargerOption);
                    break;
                }
            }
        }
        /**
     * Name: registerHybridCar
     * this method registers gasoline-powered cars.
     * <b>pre: </b> the person enters a whole number. <br>
     * <b>post: </b> the action is performed according to the option chosen by the user.
     * @param typeCarOption option to determine whether to register a car or a motorcycle.
     * @param basePrice this is the base price of the vehicle
     * @param mark this is the make of the vehicle
     * @param model this is the model of the vehicle
     * @param cilinderCapacity this is the vehicle's displacement capacity
     * @param kilometers this is the mileage of the vehicle
     * @param numDoor this is the parameter that records the number of doors of the vehicle
     * @param polarizaionOption this is the parameter that records whether the windows are tinted or not
     * @param gasolineOption this is the parameter that registers the gasoline options
     */
    
    public static void registerHybridCar(){
        System.out.println("Enter the type of car you have.");
        System.out.println("Type 1 if it is SEDAN.");
        System.out.println("Enter 2 if it is a PICKUP TRUCK");
        int typeCarOption = lector.nextInt();
        if(typeCarOption != 1 && typeCarOption != 2){
            System.out.println("Incorrect option, please enter a valid option.r");
            typeCarOption = lector.nextInt();
        }
        System.out.println("Enter the base price of the car: ");
        double basePrice = lector.nextDouble();
        lector.nextLine();
        System.out.println("Enter the vehicle make: ");
        String mark = lector.nextLine();
        System.out.println("Enter the model year of the car: ");
        int model = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the vehicle displacement: ");
        int cilinderCapacity = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the vehicle mileage: ");
        double kilometers = lector.nextDouble();
        lector.nextLine();
        System.out.println("Enter the number of doors: ");
        int numDoor = lector.nextInt();
        lector.nextLine();
        System.out.println("Are the windows of your vehicle tinted? If yes, type: yes ");
        System.out.println("If they are not polarized, enter: no");
        String polarizaionOption = lector.nextLine();
        boolean polarized = false;
        if(polarizaionOption.equalsIgnoreCase( "yes")){
            polarized = true;
        }
        else if(polarizaionOption.equalsIgnoreCase( "no")){
            polarized = false;
        }
        System.out.println("What type of gasoline does the car use?");
        System.out.println("Type 1 for extra type gasoline.");
        System.out.println("Type 2 for regular type gasoline.");
        System.out.println("Enter 3 for diesel type gasoline.");
        int gasolineOption = lector.nextInt();
        lector.nextLine(); 
        System.out.println("Enter what is the capacity of the gas tank in gallons");
        double gasolineCapacity = lector.nextDouble();
        lector.nextLine();
        System.out.println("What is the type of charge the vehicle has?");
            System.out.println("Enter 1 if it is a fast charge.");
            System.out.println("Type 2 if it is a normal charge");
            int chargerOption = lector.nextInt();
            lector.nextLine();
            System.out.println("Enter the battery life");
            int batteryDuration = lector.nextInt();
            lector.nextLine();
            System.out.println("Is the vehicle you are registering new or used?");
        System.out.println("Enter 1 if new");
        System.out.println("Enter 2 if used");
        int statusOption = lector.nextInt();
        if(statusOption != 1 && statusOption != 2){
            System.out.println("Incorrect option, please enter a valid option");
            statusOption = lector.nextInt();
        }
        lector.nextLine();
        String placa = "";
        if (statusOption ==2){
            System.out.println("Please enter the license plate number of the vehicle: ");
            placa = lector.nextLine();
        } else{
            placa = "The car is new, so it does not have a license plate yet.";
        }
            
            System.out.println("Information from the car documentation will now be recorded: ");

        switch(statusOption){
            case 1:{
                //Datos de el SOAT, tecnomecánica y la tarjeta de propiedad del carro nuevo
            double soatPriceN = 0.0;
                int soatYearN = 0;
                int soatImageN = 0;
                double soatAccidentCoverageN = 0.0;

            double ownerCardPriceN = 0.0;
                int ownerCardYearN = 0;
                int ownerCardImageN = 0;

            double tehnomechanicPriceN = 0.0;
                int tehnomechanicYearN = 0;
                int tehnomechanicImageN = 0;

                System.out.println("What is the value of technomechanics?");
                tehnomechanicPriceN = lector.nextDouble();
                System.out.println("What is the year of technomechanics?");
                tehnomechanicYearN = lector.nextInt();
                lector.nextLine();
                System.out.println("Enter the image of the technomechanics");
                tehnomechanicImageN = lector.nextInt();
                lector.nextLine();
                System.out.println("Enter the level of gas emitted by the vehicle.");
                int tehnomechanicGasLevelsN = lector.nextInt();
                lector.nextLine();
                company.registerCarHybrid( basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceN, ownerCardYearN, ownerCardImageN, placa,statusOption, soatPriceN,soatYearN,soatImageN, soatAccidentCoverageN,tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevelsN, numDoor, polarized, typeCarOption, gasolineCapacity, gasolineOption, batteryDuration, chargerOption);
                break;
            }
            case 2:{
                //Datos de el SOAT, tecnomecánica y la tarjeta de propiedad del carro usado
            double soatPriceU;
                int soatYearU;
                int soatImageU;
                double soatAccidentCoverageU;

            double ownerCardPriceU;
                int ownerCardYearU;
                int ownerCardImageU;

            double tehnomechanicPriceU;
                int tehnomechanicYearU;
                int tehnomechanicImageU;
                int tehnomechanicGasLevelsU;

                System.out.println("Does the vehicle have a SOAT? if yes, type yes, otherwise type no.");
                String auxSoat = lector.nextLine();
                if(auxSoat.equalsIgnoreCase("si")){
                    System.out.println("Since you have SOAT, what is the value of the SOAT?");
                    soatPriceU = lector.nextDouble();
                    System.out.println("What year is the SOAT?");
                    soatYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the image of the SOAT?");
                    soatImageU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the coverage of the SOAT to cover accidents as far as third parties are concerned?");
                    soatAccidentCoverageU = lector.nextDouble();
                    lector.nextLine();
                } else{
                soatPriceU = 0.0;
                soatYearU = 0;
                soatImageU = 0;
                soatAccidentCoverageU = 0.0;
                }
                System.out.println("Is the car technomechanical? if so, type yes, otherwise type no.");
                String auxTecnoU = lector.nextLine();
                if(auxTecnoU.equalsIgnoreCase( "yes")){
                    System.out.println("Since you have Tecnomecanica, what is the value of Tecnomecanica?");
                    tehnomechanicPriceU = lector.nextDouble();
                    System.out.println("What is the price of the technomechanics?");
                    tehnomechanicYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the image of the technomechanics?");
                    tehnomechanicImageU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the level of gases emitted by this car?");
                    tehnomechanicGasLevelsU = lector.nextInt();
                    lector.nextLine();
                }else{
                tehnomechanicPriceU = 0.0;
                tehnomechanicYearU = 0;
                tehnomechanicImageU = 0;
                tehnomechanicGasLevelsU = 0;
                }
                System.out.println("Does the car have an ownership card? if yes, type yes, otherwise type no.");
                String auxOwnerCard = lector.nextLine();
                if(auxOwnerCard.equalsIgnoreCase( "yes")){
                    System.out.println("If you have a property card, enter the value of the property card.");
                    ownerCardPriceU = lector.nextDouble();
                    System.out.println("Enter the year of the ownership card");
                    ownerCardYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Type the image of the property card");
                    ownerCardImageU = lector.nextInt();
                    lector.nextLine();
                }else{
                    ownerCardPriceU = 0.0;
                    ownerCardYearU = 0;
                    ownerCardImageU = 0;
                }
                company.registerCarHybrid( basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceU, ownerCardYearU, ownerCardImageU, placa,statusOption, soatPriceU,soatYearU,soatImageU, soatAccidentCoverageU,tehnomechanicPriceU, tehnomechanicYearU, tehnomechanicImageU, tehnomechanicGasLevelsU, numDoor, polarized, typeCarOption, gasolineCapacity, gasolineOption, batteryDuration, chargerOption);
                break;
            }
        }
    }
    /**
     * Name: registerMotorcycle
     * this method registers gasoline-powered cars.
     * <b>pre: </b> the person enters a whole number. <br>
     * <b>post: </b> the action is performed according to the option chosen by the user.
     * @param typeCarOption option to determine whether to register a car or a motorcycle.
     * @param basePrice this is the base price of the vehicle
     * @param mark this is the make of the vehicle
     * @param model this is the model of the vehicle
     * @param cilinderCapacity this is the vehicle's displacement capacity
     * @param kilometers this is the mileage of the vehicle
     * @param numDoor this is the parameter that records the number of doors of the vehicle
     * @param polarizaionOption this is the parameter that records whether the windows are tinted or not
     * @param gasolineOption this is the parameter that registers the gasoline options
     */

    public static void registerMotorcycle(){
        System.out.println("Now the registration of the motorcycle will be done:");
        System.out.println("What type of motorcycle do you have?");
        System.out.println("Type 1 if it is standard.");
        System.out.println("Type 2 if it is a sport bike.");
        System.out.println("Type 3 if it is a scooter");
        System.out.println("Type 4 if it is a croos.");

        int typeMotoOption = lector.nextInt();
        if(typeMotoOption != 1 && typeMotoOption != 2 && typeMotoOption != 3 && typeMotoOption != 4){
            System.out.println("The option entered is incorrect, please enter a correct option.");
            typeMotoOption = lector.nextInt();
        }
        System.out.println("Enter the base price of the bike: ");
        double basePrice = lector.nextDouble();
        lector.nextLine();
        System.out.println("Enter the make of the vehicle: ");
        String mark = lector.nextLine();
        System.out.println("Enter the model year of the car: ");
        int model = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the car's cylinder capacity: ");
        int cilinderCapacity = lector.nextInt();
        lector.nextLine();
        System.out.println("Enter the vehicle's mileage: ");
        double kilometers = lector.nextDouble();
        lector.nextLine();
        System.out.println("Enter what is the capacity of the gasoline tank in gallons");
        double gasolineCapacity = lector.nextDouble();
        lector.nextLine();
        System.out.println("Is the vehicle you are registering new or used?");
        System.out.println("Enter 1 if new");
        System.out.println("Enter 2 if used");
        int statusOption = lector.nextInt();
        if(statusOption != 1 && statusOption != 2){
            System.out.println("Incorrect option, please enter a valid option");
            statusOption = lector.nextInt();
        }
        lector.nextLine();
        String placa = "";
        if (statusOption ==2){
            System.out.println("Please enter the license plate number of the vehicle: ");
            placa = lector.nextLine();
        } else{
            placa = "The bike is new, so it has no plate yet";
        }
        System.out.println("Information from the car documentation will now be recorded: ");
        switch(statusOption){
            case 1:{
                //Datos de el SOAT, tecnomecánica y la tarjeta de propiedad de la moto nueva
            double soatPriceN = 0.0;
                int soatYearN = 0;
                int soatImageN = 0;
                double soatAccidentCoverageN = 0.0;

            double ownerCardPriceN = 0.0;
                int ownerCardYearN = 0;
                int ownerCardImageN = 0;

            double tehnomechanicPriceN = 0.0;
                int tehnomechanicYearN = 0;
                int tehnomechanicImageN = 0;

                System.out.println("What is the value of tehnomechanic");
                tehnomechanicPriceN = lector.nextDouble();
                System.out.println("What is the year of the technomechanic");
                tehnomechanicYearN = lector.nextInt();
                lector.nextLine();
                System.out.println("Enter the image of the technomechanic");
                tehnomechanicImageN = lector.nextInt();
                lector.nextLine();
                System.out.println("Enter the gas level of the vehicle");
                int tehnomechanicGasLevelsN = lector.nextInt();
                lector.nextLine();
                company.registerMotorcycle(basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceN, ownerCardYearN, ownerCardImageN, placa,statusOption, soatPriceN,soatYearN,soatImageN, soatAccidentCoverageN,tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevelsN, gasolineCapacity, typeMotoOption);
                break;
            }
            case 2:{
                //Datos de el SOAT, tecnomecánica y la tarjeta de propiedad de la moto usada
            double soatPriceU;
                int soatYearU;
                int soatImageU;
                double soatAccidentCoverageU;
            double ownerCardPriceU;
                int ownerCardYearU;
                int ownerCardImageU;
            double tehnomechanicPriceU;
                int tehnomechanicYearU;
                int tehnomechanicImageU;
                int tehnomechanicGasLevelsU;

                System.out.println("Does the vehicle have SOAT? if yes, type yes, otherwise type no");
                String auxSoat = lector.nextLine();
                if(auxSoat.equalsIgnoreCase("yes")){
                    System.out.println("Since you have SOAT, what is the SOAT value?");
                    soatPriceU = lector.nextDouble();
                    System.out.println("What year is the SOAT?");
                    soatYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the SOAT image?");
                    soatImageU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the SOAT coverage for third party accident coverage?");
                    soatAccidentCoverageU = lector.nextDouble();
                    lector.nextLine();
                } 
                else{
                soatPriceU = 0.0;
                soatYearU = 0;
                soatImageU = 0;
                soatAccidentCoverageU = 0.0;
                }
                System.out.println("Does the vehicle have technomechanics? if yes type yes, otherwise type no");
                String auxTecnoU = lector.nextLine();
                if(auxTecnoU.equalsIgnoreCase("yes")){
                    System.out.println("Since you have Technomechanic, what is the value of the Technomechanic?");
                    tehnomechanicPriceU = lector.nextDouble();
                    System.out.println("What is the price of the Technomechanic");
                    tehnomechanicYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the image of the technomechanic?");
                    tehnomechanicImageU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("What is the gas level emitted by this car?");
                    tehnomechanicGasLevelsU = lector.nextInt();
                    lector.nextLine();
                }
                else{
                tehnomechanicPriceU = 0.0;
                tehnomechanicYearU = 0;
                tehnomechanicImageU = 0;
                tehnomechanicGasLevelsU = 0;
                }
                System.out.println("Does the vehicle have an ownership card? if yes, type yes, otherwise type no");
                String auxOwnerCard = lector.nextLine();
                if(auxOwnerCard.equalsIgnoreCase("yes")){
                    System.out.println("Since you have an owner card, type the value of the owner card");
                    ownerCardPriceU = lector.nextDouble();
                    System.out.println("Enter the year of the ownership card");
                    ownerCardYearU = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Type the image of the ownership card");
                    ownerCardImageU = lector.nextInt();
                    lector.nextLine();
                }else{
                    ownerCardPriceU = 0.0;
                    ownerCardYearU = 0;
                    ownerCardImageU = 0;
                }
                company.registerMotorcycle( basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceU, ownerCardYearU, ownerCardImageU, placa,statusOption, soatPriceU,soatYearU,soatImageU, soatAccidentCoverageU,tehnomechanicPriceU, tehnomechanicYearU, tehnomechanicImageU, tehnomechanicGasLevelsU, gasolineCapacity, typeMotoOption);
                break;
            }
        }
    }
    /**
     * Name: calculateFinalPriceSold
     * this method calculates the final selling price of the vehicle.
     * <b>pre: </b> the person enters a whole number. <br>
     * <b>post: </b> the action is performed according to the option chosen by the user.
     * @param placa is to be able to search the vehicle by license plate
     */

    public static void calculateFinalPriceSold(){
        System.out.println("In this case it is necessary to enter the license plate number of the vehicle.");
        String placa = lector.nextLine();
        company.calculateFinalPriceSold(placa);
    }
    /**
     * Name: generateInformation
     * this method generates vehicle information
     * <b>pre: </b> the person enters a whole number. <br>
     * <b>post: </b> the action is performed according to the option chosen by the user.
     * @param auxInform variable needed to generate the information
     */
    public static void generateInformation(){
        System.out.println("Now a report will be generated, select an option:");
        System.out.println("Type 1 to know the type of vehicle.");
        System.out.println("Type 2 for fuel type.");
        System.out.println("Type 3 for new/used cars.");
        int auxInform = lector.nextInt();
        lector.nextLine();
        company.generateInformationn(auxInform);
    }
}