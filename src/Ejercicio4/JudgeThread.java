package Ejercicio4;

import java.util.List;
import java.util.Random;

public class JudgeThread implements Runnable{

    private final int NUM_DESCLASIFICADOS= 5;
    private List<Thread> caballos;

    public JudgeThread(List<Thread> caballos) {
        this.caballos = caballos;
    }


    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < NUM_DESCLASIFICADOS; i++) {
            int horseIndex = random.nextInt(caballos.size());
            caballos.get(horseIndex).interrupt();
            caballos.remove(horseIndex);
            System.out.println("¡Caballo descalificado!");
        }
    }
}
