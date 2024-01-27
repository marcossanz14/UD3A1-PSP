package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class CarreraAnimales {
    public static void main(String[] args) {
        Animal tortuga1 = new Animal("Tortuga 1", 200);
        Thread tt1 = new Thread(tortuga1);
        Animal tortuga2 = new Animal("Tortuga 2", 200);
        Thread tt2 = new Thread(tortuga2);
        Animal tortuga3 = new Animal("Tortuga 3", 200);
        Thread tt3 = new Thread(tortuga3);
        Animal tortuga4 = new Animal("Tortuga 4", 200);
        Thread tt4 = new Thread(tortuga4);
        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();

        Animal conejo1 = new Animal("Conejo 1", 100);
        Thread tc1 = new Thread(conejo1);
        Animal conejo2 = new Animal("Conejo 2", 100);
        Thread tc2 = new Thread(conejo2);
        Animal conejo3 = new Animal("Conejo 3", 100);
        Thread tc3 = new Thread(conejo3);
        tc1.start();
        tc2.start();
        tc3.start();

        Animal guepardo = new Animal("Guepardo 1", 50);
        Thread tg1 = new Thread(guepardo);
        tg1.start();


    }
}
