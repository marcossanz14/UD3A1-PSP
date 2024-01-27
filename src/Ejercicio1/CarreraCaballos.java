package Ejercicio1;

public class CarreraCaballos {
    public static void main(String[] args) {
        ThreadHorse horse1 = new ThreadHorse("Caballo 01");
        Thread th1 = new Thread(horse1);
        th1.start();
        ThreadHorse horse2 = new ThreadHorse("Caballo 02");
        Thread th2 = new Thread(horse2);
        th2.start();
        ThreadHorse horse3 = new ThreadHorse("Caballo 03");
        Thread th3 = new Thread(horse3);
        th3.start();
        ThreadHorse horse4 = new ThreadHorse("Caballo 04");
        Thread th4 = new Thread(horse4);
        th4.start();
        ThreadHorse horse5 = new ThreadHorse("Caballo 05");
        Thread th5 = new Thread(horse5);
        th5.start();
        ThreadHorse horse6 = new ThreadHorse("Caballo 06");
        Thread th6 = new Thread(horse6);
        th6.start();
        ThreadHorse horse7 = new ThreadHorse("Caballo 07");
        Thread th7 = new Thread(horse7);
        th7.start();
        ThreadHorse horse8 = new ThreadHorse("Caballo 08");
        Thread th8 = new Thread(horse8);
        th8.start();
        ThreadHorse horse9 = new ThreadHorse("Caballo 09");
        Thread th9 = new Thread(horse9);
        th9.start();
        ThreadHorse horse10 = new ThreadHorse("Caballo 10");
        Thread th10 = new Thread(horse10);
        th10.start();

    }
}
