package Ejercicio2;

public class TrainerThread implements Runnable{
    private PokemonThread pokemonThread;
    private int numero;

    public TrainerThread(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("Soy el entrenador número: "+numero);
    }
}
