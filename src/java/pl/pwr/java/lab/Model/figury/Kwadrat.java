package pl.pwr.java.lab.Model.figury;

import pl.pwr.java.lab.Model.interfejsy.Figure;
import pl.pwr.java.lab.Model.punkty.Punkt_2D;

/**
 * Created by Michał Bizoń on 14.03.2016.
 */
public class Kwadrat extends Punkt_2D implements Figure {

    private Punkt_2D punkt1;
    private Punkt_2D punkt2;

//    public Kwadrat(double x1, double y1, double x2 , double y2) {
//        super();
//
//        this.punkt1 = super(y1, x1);
//        this.punkt2 = punkt2;
//    }
//
//    public Kwadrat(double x, double y) {
//        super(x, y);
//    }


    public Kwadrat(double x1, double y1, double x2, double y2) {
        super();
        this.punkt1 = new Punkt_2D(x1,y1);
        this.punkt2 = new Punkt_2D(x2,y2);
    }

    @Override
    public void rysuj() {

    }

    @Override
    public void cosTamZrob() {

    }

    @Override
    public void wyswietl() {
        System.out.println("Współrzędne kwadratu: ");
        punkt1.wyswietl();
        punkt2.wyswietl();
    }
}
