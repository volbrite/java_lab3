package pl.pwr.java.lab.Model.figury;

import pl.pwr.java.lab.Model.interfejsy.*;
import pl.pwr.java.lab.Model.punkty.Punkt_1D;

/**
 * Created by Michał Bizoń on 14.03.2016.
 */
public class Okrag extends Punkt_1D implements Figure  {
    private Punkt_1D srodekOkregu;
    private double promien;

    public Okrag(double srodekOkregu, double promien) {
        this.srodekOkregu = new Punkt_1D(srodekOkregu);
        this.promien = promien;
    }

    @Override
    public void rysuj() {

    }

    @Override
    public void cosTamZrob() {

    }

    @Override
    public void wyswietl() {
        System.out.println("Wspolrzedne: [" + srodekOkregu.getX() + "]    |    Promień: " + promien);
    }
}
