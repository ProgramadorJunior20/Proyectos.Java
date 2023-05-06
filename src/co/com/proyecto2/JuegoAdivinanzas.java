package co.com.proyecto2;

import java.util.Random;

public class NumeroAleatorioApp {
    public static void main(String[] args) {
        /**
         * Proyecto No2: Crear un juego simple de adivinanza de números.
         */
        Random aleatorio = new Random();
        aleatorio.nextInt(100);

        System.out.println(aleatorio);
    }
}
