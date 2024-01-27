package Ejercicio2;

public class PokemonThread implements Runnable{
    private int numero;

    public PokemonThread(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("Soy el pokemon número "+numero);
    }
}
