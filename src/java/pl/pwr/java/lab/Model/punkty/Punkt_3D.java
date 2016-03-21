package pl.pwr.java.lab.Model.punkty;

/**
 * Created by Michał Bizoń on 07.03.2016.
 */
public class Punkt_3D extends Punkt_2D {
    private double z;

    public Punkt_3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void wyswietl() {
        System.out.println("[ " + super.getX() + " ; " + super.getY() + " ; " + z + " ]");
    }

    @Override
    public double obliczOdlegloscOdPoczatku() {
        double odleglosc = Math.sqrt(Math.pow(super.getX(),2)+Math.pow(super.getY(),2)+Math.pow(z,2));
        return odleglosc;
    }


}

