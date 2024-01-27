package Ejercicio5;

public class Animal implements Runnable {
    private String name;
    private int descanso;

    public Animal(String name, int descanso) {
        this.name = name;
        this.descanso = descanso;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3000; i+=100) {
            try {
                Thread.sleep(descanso);
                System.out.printf("%s: %dm para finalizar\n", this.name, (3000-i));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(this.name+": Ha finalizado");
    }
}
