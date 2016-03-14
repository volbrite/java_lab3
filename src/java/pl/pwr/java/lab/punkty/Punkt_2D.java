package pl.pwr.java.lab.punkty;

/**
 * Created by Michał Bizoń on 07.03.2016.
 */
public class Punkt_2D extends Punkt_1D {
    private double y;


//    public Punkt_2D(double x) {
//        super(x);
//    }

    public Punkt_2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    @Override
    public void wyswietl() {
        System.out.println("[ " + super.getX() + " ; " + y + " ]");
    }
}
