package model;

public class SOAT extends Document {

    private double accidentCoverage;

    public SOAT(double price, int year, int image, double accidentCoverage) {
        super(price, year, image);
        this.accidentCoverage = accidentCoverage;
    }

    public double getAccidentCoverage() {
        return accidentCoverage;
    }

    public void setAccidentCoverage(double accidentCoverage) {
        this.accidentCoverage = accidentCoverage;
    }

    public String toString(){
        return super.toString() + "El monto que cubre el SOAT en lo que a accidentes a terceros se refiere es: "+accidentCoverage;
    }
}