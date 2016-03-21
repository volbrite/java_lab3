package pl.pwr.java.lab.Model.punkty;

/**
 * Created by Michał Bizoń on 07.03.2016.
 */
public class Punkt_1D {
    private double x;


    public Punkt_1D(double x) {
        this.x = x;
    }

    public Punkt_1D() {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void wyswietl() {
        System.out.println("[ " + x + " ]");
    }

    public double obliczOdlegloscOdPoczatku() {
        return this.x;
    }

}
