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
        Color snehulakBarva;
        cervenaBarva=new Color(255,0,0);
        modraBarva = new Color(0,127,255);
        hnedaBarva = new Color(184, 115, 51);
        cherryBarva = new Color(210, 4, 45);
        snehulakBarva = new Color(135, 206, 235);

//        nakreslitKornout(hnedaBarva, 200, 175);
//
//        //presun
//        zofka.penUp();
//        zofka.turnRight(180);
//        zofka.move(200);
//
//        nakreslitKolecko(cherryBarva, 38);
        nakreslitSpodniKolecko(snehulakBarva, 35);

        //presun
        zofka.penUp();
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(115);
        zofka.turnRight(180);

        nakreslitStredniKolecko(snehulakBarva, 25);

        //presun
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);

        nakreslitVrchniKolecko(snehulakBarva, 20);

        //presun
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(105);

        nakreslitMaleKolecko(snehulakBarva, 10);

        //presun
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(170);
        zofka.turnRight(90);
        zofka.move(20);

        nakreslitMaleKolecko(snehulakBarva, 10);

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

    public void nakreslitSpodniKolecko(Color barvaCary, double spodniKolecko) {

        zofka.penDown();
        zofka.setPenColor(barvaCary);

        for (int i = 0; i < 18; i++) {
            zofka.move(spodniKolecko);
            zofka.turnRight(20);
        }
    }

    public void nakreslitStredniKolecko(Color barvaCary, double stredniKolecko) {

        zofka.penDown();
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 18; i++) {
            zofka.move(stredniKolecko);
            zofka.turnRight(20);
        }
    }

    public void nakreslitVrchniKolecko(Color barvaCary, double vrchniKolecko) {

        zofka.penDown();
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 18; i++) {
            zofka.move(vrchniKolecko);
            zofka.turnLeft(20);
        }
    }

    public void nakreslitMaleKolecko(Color barvaCary, double maleKolecko) {

        zofka.penDown();
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 18; i++) {
            zofka.move(maleKolecko);
            zofka.turnLeft(20);
        }
    }


    public static void main(String[] args) {

        new HlavniProgram().start();
    }

    }


