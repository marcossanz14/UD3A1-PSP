package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero par: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i ++) {
            TrainerThread tt = new TrainerThread(i);
            Thread t = new Thread(tt);
            t.start();
            t.join();

            PokemonThread pokemonThread = new PokemonThread(i);
            Thread tp = new Thread(pokemonThread);
            tp.start();
            tp.join();
        }
    }
}
