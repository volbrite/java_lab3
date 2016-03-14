package pl.pwr.java.lab.figury;

import pl.pwr.java.lab.interfejsy.*;
import pl.pwr.java.lab.punkty.Punkt_1D;

/**
 * Created by Michał Bizoń on 14.03.2016.
 */
public class Okrag extends Punkt_1D implements Figure  {
    private Punkt_1D srodekOkregu;
    private double promien;

    public Okrag(Punkt_1D srodekOkregu, double promien) {
        this.srodekOkregu = srodekOkregu;
        this.promien = promien;
    }

    @Override
    public void rysuj() {

    }

    @Override
    public void cosTamZrob() {

    }
}
