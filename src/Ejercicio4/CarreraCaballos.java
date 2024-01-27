package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class CarreraCaballos {
    public static void main(String[] args) {

        List<Thread> caballos = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            ThreadHorse horse = new ThreadHorse("Caballo " + i);
            Thread horseThread = new Thread(horse);
            caballos.add(horseThread);
        }

        // Iniciar los caballos
        for (Thread horseThread : caballos) {
            horseThread.start();
        }

        JudgeThread judge = new JudgeThread(caballos);
        Thread judgeThread = new Thread(judge);
        judgeThread.start();

    }
}
