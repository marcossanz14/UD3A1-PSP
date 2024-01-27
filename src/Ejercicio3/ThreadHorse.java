package Ejercicio3;

public class ThreadHorse implements Runnable {
    private String name;

    public ThreadHorse(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5000; i+=100) {
            try {
                Thread.sleep(200);
                System.out.printf("%s: %dm para finalizar\n", this.name, (5000-i));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(this.name+": Ha finalizado");
    }
}
