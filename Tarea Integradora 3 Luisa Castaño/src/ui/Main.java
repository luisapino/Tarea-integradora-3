package ui;
import java.util.Scanner;
import model.Company;

public class Main{
    public static Company company;
    public static Scanner lector;

    public static void main(String [] args){
        lector = new Scanner(System.in);

        int option = options();
        while(option != 4){
            switch (option){
                case 1:{
                    registerVehicle();
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }
                
            }
            option = options();
            
        }  
    }
    
    public static int options(){

        System.out.println("""
                Menu: you have the following options
                Type the number 1 if you want register vehicles (new or used) for sale.
                Type the number 2 if you want calculating the total selling price of a vehicle.
                Type the number 3 if you want generate reports with all vehicle data.
                Type the number 4 to finish the process.
                """);
        int menu = lector.nextInt();
        lector.nextLine();
        return menu;
    }
    public static void registerVehicle(){
        System.out.println("Se empezará el registro del vehiculo.");
        System.out.println("""
                Ingrese el tipo de vehiculo
                Digite 1 si es un carro.
                Digite 2 si es una moto.
                """);
        int typeVehicleOption = lector.nextInt();
        if(typeVehicleOption != 1 && typeVehicleOption != 2){
            System.out.println("La opción ingresada es incorrecta, ingrese por favor una opción válida");
            typeVehicleOption = lector.nextInt();
        }
        lector.nextLine();
        switch(typeVehicleOption){
            case 1:{
                System.out.println("""
                    ¿Qué tipo de carro tiene?
                    Digite 1 si es a gasolina.
                    Digite 2 si es electrico.
                    Digite 3 si es hibrido.
                    """);
                    int typeCarOption = lector.nextInt();
                    if(typeCarOption != 1 && typeCarOption != 2 && typeCarOption != 3){
                        System.out.println("Opción invalida, por favor ingrese una opción correcta.");
                        typeCarOption = lector.nextInt();
                    }
                    lector.nextLine();
                    switch(typeCarOption){
                        case 1:{
                            registerCarGasoline();
                            break;
                        }
                        case 2:{
                            registerHybridCar();
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

    public static void registerCarGasoline(){
        System.out.println("""
            Digite el tipo de auto que tiene.
            Digite el 1 si es SEDAN.
            Digite el 2 si es PICKUP TRUCK.
        """);
        int typeCarOption = lector.nextInt();
        if(typeCarOption != 1 && typeCarOption != 2){
            System.out.println("Opción incorrecta, ingrese una opción válida por favor");
            typeCarOption = lector.nextInt();
        }
        System.out.println("Ingrese el precio base del carro: ");
        double basePrice = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la marca del vehiculo: ");
        String mark = lector.nextLine();
        System.out.println("Ingrese el año del modelo del carro: ");
        int model = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el cilindraje del vehiculo: ");
        int cilinderCapacity = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el kilometraje del vehiculo: ");
        double kilometers = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese el numero de puertas: ");
        int numDoor = lector.nextInt();
        lector.nextLine();
        System.out.println("Las ventanas de su vehiculo son polarizadas? De ser así, digite: si ");
        System.out.println("Si no son polarizadas, digite: no");
        String polarizaionOption = lector.nextLine();
        boolean polarized = false;
        if(polarizaionOption.equalsIgnoreCase( "si")){
            polarized = true;
        }
        else if(polarizaionOption.equalsIgnoreCase( "no")){
            polarized = false;
        }
        System.out.println("""
            Que tipo de gasolina usa el carro?
            Digite 1 para gasolina de tipo extra.
            Digite 2 para gasolina de tipo corriente.
            Digite 3 para gasolina de tipo diesel.
            """);
        int gasolineOption = lector.nextInt();
        lector.nextLine(); 
        System.out.println("Ingrese cual es la capacidad del tanque de gasolina en galones");
        double gasolineCapacity = lector.nextDouble();
        lector.nextLine();
        System.out.println("Cual es el consumo (galones por km) del vehiculo");
        double gasolineConsume = lector.nextDouble();
        lector.nextLine();
        System.out.println("El vehiculo que registra es nuevo o usado?");
        System.out.println("Digite 1 si es nuevo");
        System.out.println("Digite 2 si es usado");
        int statusOption = lector.nextInt();
        if(statusOption != 1 && statusOption != 2){
            System.out.println("Opcion incorrecta, ingrese por favor una opcion válida");
            statusOption = lector.nextInt();
        }
        lector.nextLine();
        String placa = "";
        if (statusOption ==2){
            System.out.println("Digite la placa del vehiculo por favor: ");
            placa = lector.nextLine();
        } else{
            placa = "El carro es nuevo, por lo que no tiene placa aún";
        }

        System.out.println("Ahora se registrará información de la documentación del carro: ");
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

                System.out.println("Cual es el valor de la tecnomecanica");
                tehnomechanicPriceN = lector.nextDouble();
                System.out.println("Cual es el año de la tecnomecanica");
                tehnomechanicYearN = lector.nextInt();
                lector.nextLine();
                System.out.println("Ingrese la imagen de la tecnomecanica");
                tehnomechanicImageN = lector.nextInt();
                lector.nextLine();
                System.out.println("Ingrese el nivel de gas que eite el vehiculo");
                int tehnomechanicGasLevels = lector.nextInt();
                lector.nextLine();
                company.registerCarGasoline( basePrice, mark,  model,  cilinderCapacity, kilometers, ownerCardPriceN, ownerCardYearN, ownerCardImageN, placa,statusOption, soatPriceN,soatYearN,soatImageN, soatAccidentCoverageN,tehnomechanicPriceN, tehnomechanicYearN, tehnomechanicImageN, tehnomechanicGasLevels, numDoor, polarized, typeCarOption, gasolineCapacity, gasolineOption);
                break;
            }
            case 2:{

                break;
            }

        }

    }

    public void registerElectricCar(){
        System.out.println("");

    }
    
    public static void registerHybridCar(){

    }

    public static void registerMotorcycle(){

    }

}
