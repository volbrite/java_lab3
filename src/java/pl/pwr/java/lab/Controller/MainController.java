package pl.pwr.java.lab.Controller;

import pl.pwr.java.lab.Main;
import pl.pwr.java.lab.Model.figury.Kwadrat;
import pl.pwr.java.lab.Model.figury.Okrag;
import pl.pwr.java.lab.Model.figury.Trojkat;
import pl.pwr.java.lab.Model.punkty.Punkt_1D;
import pl.pwr.java.lab.Model.punkty.Punkt_2D;
import pl.pwr.java.lab.Model.punkty.Punkt_3D;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainController {

    public ArrayList wczytajDane() throws IOException {
        ArrayList<Object> listaPunktow = new ArrayList<>();

        File file = new File(Main.class.getResource("/test.txt").getPath());

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            try {
                String wsp[] = line.split(";");
//            System.out.println(wsp.length);
                if (wsp.length == 1) {
                    listaPunktow.add(new Punkt_1D(Double.parseDouble(wsp[0])));
                } else if (wsp.length == 2) {
                    listaPunktow.add(new Punkt_2D(Double.parseDouble(wsp[0]), Double.parseDouble(wsp[1])));
                } else if (wsp.length == 3) {
                    listaPunktow.add(new Punkt_3D(Double.parseDouble(wsp[0]), Double.parseDouble(wsp[1]), Double.parseDouble(wsp[2])));
                }
            } catch (NumberFormatException e) {
                System.out.println("Bład wczytywnia. prawdopodobnie niepoprawne dane w pliku. Dane: \n" +
                        line +
                        "\nzostaną pominięte.\n");
            }
        }
        fileReader.close();
        return listaPunktow;
    }

    public void wykonajOperacjeNaObiektach() {
        ArrayList<Object> lista;
        try {
            lista = wczytajDane();
            System.out.println("================================================");
            System.out.println("Wczytano z pliku: " + lista.size() + " punktów.");
            System.out.println("================================================");

            for (Object o : lista) {
                if (o instanceof Punkt_1D) {
                    Punkt_1D p = (Punkt_1D) o;
                    System.out.println("Typ wczytanego punktu: " + p.getClass().getSimpleName());
                    System.out.println("Współrzędne punktu: "); p.wyswietl();
                    System.out.println("Odległość od początku układu współrzędnych: " + p.obliczOdlegloscOdPoczatku());

                } else if (o instanceof Punkt_2D) {
                    Punkt_2D p = (Punkt_2D) o;
                    System.out.println("Typ wczytanego punktu: " + p.getClass().getSimpleName());
                    System.out.println("Współrzędne punktu: "); p.wyswietl();
                    System.out.println("Odległość od początku układu współrzędnych: " + p.obliczOdlegloscOdPoczatku());
                } else if (o instanceof Punkt_3D) {
                    Punkt_3D p = (Punkt_3D) o;
                    System.out.println("Typ wczytanego punktu: " + p.getClass().getSimpleName());
                    System.out.println("Współrzędne punktu: "); p.wyswietl();
                    System.out.println("Odległość od początku układu współrzędnych: " + p.obliczOdlegloscOdPoczatku());
                } else {
                    System.out.println("");
                }
                System.out.println("==========================");
            }

            testFigur();
        } catch (IOException e) {
            System.out.println("Wystąpił problem z otworzeniem pliku. Proszę sprawdzić czy plik istnieje.");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public void testFigur() {
        Okrag okrag = new Okrag(10,20);
        okrag.wyswietl();

        Kwadrat kwadrat = new Kwadrat(1,2,3,4);
        kwadrat.wyswietl();

//        Trojkat trojkat = new Trojkat()


        System.out.println("====================");
    }


}
