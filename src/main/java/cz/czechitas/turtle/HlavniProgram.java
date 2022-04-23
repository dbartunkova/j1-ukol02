package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        nakresliZmrzlinu(zofka);

        nakresliSnehulaka(zofka);
    }

    private void nakresliSnehulaka(Turtle zofka) {
        zofka.setLocation(200, 200);
        nakresliKolecko(zofka, 10);
        zofka.turnLeft(-10);
        zofka.setLocation(200, 200);
        nakresliKolecko(zofka, -13);
        zofka.setLocation(200, 420);
        nakresliKolecko(zofka, 15);
        zofka.setLocation(140, 240);
        nakresliKolecko(zofka, 5);
        zofka.setLocation(260, 240);
        nakresliKolecko(zofka, 5);
    }


    private void nakresliZmrzlinu(Turtle zofka) {
        zofka.setLocation(50, 50);

        nakresliKolecko(zofka, 11.0);
        zofka.turnLeft(90);
        zofka.setLocation(135, 50);
        nakresliRovnostrannyTrojuhelnik(zofka, 85.0);
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle turtle, double velikostStrany) {
        turtle.move(velikostStrany);
        turtle.turnLeft(120.0);
        turtle.move(velikostStrany);
        turtle.turnLeft(120.0);
        turtle.move(velikostStrany);
        turtle.turnLeft(120.0);
    }

    private void nakresliObdelnik (Turtle turtle, double velikostStranyA, double velikostStranyB){
        turtle.move(velikostStranyA);
        turtle.turnLeft(90.0);
        turtle.move(velikostStranyB);
        turtle.turnLeft(90.0);
        turtle.move(velikostStranyA);
        turtle.turnLeft(90.0);
        turtle.move(velikostStranyB);
        turtle.turnLeft(90.0);
    }

    private void nakresliCtverecek(Turtle turtle, double delkaStrany) {
        nakresliMnohouhelnik(turtle, delkaStrany, 4);
    }

    private void nakresliKolecko(Turtle turtle, double polomerKolecka) {
        nakresliMnohouhelnik(turtle, polomerKolecka, 24);
    }

    private void nakresliMnohouhelnik(Turtle turtle, double delkaStrany, int pocetStran) {
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(uhel);
        }
    }

}