package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

       // nakresliRovnostrannyTrojuhelnik(100.0, new Color(0,127,255));

        //presun na stred

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(300);
        zofka.turnLeft(180);

        Color cervenaBarva;
        Color modraBarva;
        Color hnedaBarva;
        Color cherryBarva;
        cervenaBarva=new Color(255,0,0);
        modraBarva = new Color (0,127,255);
        hnedaBarva = new Color (184, 115, 51);
        cherryBarva = new Color(210, 4, 45);


        nakreslitKornout(hnedaBarva, 200, 175);

        //presun
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);

        nakreslitKolecko(cherryBarva, 38);

    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany, Color barvaCary) {
        // Zde lze používat proměnnou velikostStrany.
        // Jeji hodnota je takova, s jakou byla metoda zavolana
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
    }

    public void nakreslitKornout (Color barvaCary, double stranaA, double stranaB) {

        zofka.setPenColor(barvaCary);
        zofka.penDown();
        zofka.turnLeft(25);
        zofka.move(stranaA);
        zofka.turnRight(115);
        zofka.move(stranaB);
        zofka.turnRight(115);
        zofka.move(stranaA);
    }

    public void nakreslitKolecko(Color barvaCary, double velikost) {

        zofka.setPenColor(barvaCary);
        zofka.penDown();

        for (int i = 0; i < 18; i++) {
            zofka.move(velikost);
            zofka.turnLeft(20);
        }
    }

    public static void main(String[] args) {

        new HlavniProgram().start();
    }

    }


