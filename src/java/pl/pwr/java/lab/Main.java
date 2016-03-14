package pl.pwr.java.lab;

import pl.pwr.java.lab.punkty.Punkt_1D;
import pl.pwr.java.lab.punkty.Punkt_2D;
import pl.pwr.java.lab.punkty.Punkt_3D;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Punkt 1D; Punkt 2D; Punkt 3D;
 *
 * @TODO: - konstruktory (bezparametryczne, losujący pola, z argumentem);
 * - wypisz: [0,4 ; 0,4 ; 10.4]
 * - odległość od 0,0,0
 * pobieranie danych z pliku etc;
 */


public class Main {

    public static ArrayList wczytajDane() {
        ArrayList<Object> listaPunktow = new ArrayList<>();

        try {
            File file = new File(Main.class.getResource("/test.txt").getPath());
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String wsp[] = line.split(";");
                System.out.println(wsp.length);
                if (wsp.length == 1) {
                    listaPunktow.add(new Punkt_1D(Double.parseDouble(wsp[0])));
                } else if (wsp.length == 2) {
                    listaPunktow.add(new Punkt_2D(Double.parseDouble(wsp[0]),Double.parseDouble(wsp[1])));
                } else if (wsp.length == 3) {
                    listaPunktow.add(new Punkt_3D(Double.parseDouble(wsp[0]),Double.parseDouble(wsp[1]), Double.parseDouble(wsp[2])));
                } else {
                    System.out.println("blad wczytywnia. prawdopodobnie niepoprawne dane w pliku.");
                }
            }
            fileReader.close();
            return listaPunktow;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {

        Punkt_1D punkt1D = new Punkt_1D(11.11);
        punkt1D.wyswietl();
        Punkt_2D punkt2D = new Punkt_2D(22.22, 22.22);
        punkt2D.wyswietl();
        Punkt_3D punkt3D = new Punkt_3D(33.33, 33.33, 33.33);
        punkt3D.wyswietl();

        System.out.println("====================");
        ArrayList<Object> lista = wczytajDane();
        System.out.println("====================");
        System.out.println(lista.size());
        for (Object o : lista) {
            if (o instanceof Punkt_1D) {
                Punkt_1D p = (Punkt_1D) o;
                p.wyswietl();
            } else if (o instanceof  Punkt_2D) {
                Punkt_2D p = (Punkt_2D) o;
                p.wyswietl();
            } else if (o instanceof Punkt_3D) {
                Punkt_3D p = (Punkt_3D) o;
                p.wyswietl();
            } else {
                System.out.println("cos nie tak");
            }
        }

    }
}
