package co.com.proyecto2;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        /**
         * Proyecto No2: Crear un juego simple de adivinanza de números.
         */

        // Generar numero aleatorio de 1 al 100
        Random random = new Random();
        int aleatorio = random.nextInt(100) + 1;

        // Pedir al jugador que adivine un número
        Scanner sc = new Scanner(System.in);
        int adivinar;
        int intentos = 0;
        boolean victoria = false;

        while (intentos < 5){
            System.out.print("Adivina un número entre 1 y 100: ");
            adivinar = sc.nextInt();
            intentos++;

            // Comprobar si el jugador adivinó el número
            if (adivinar == aleatorio){
                System.out.println("¡Felicidades, adivinaste el número");
                victoria = true; 
                break;
            } else if (adivinar < aleatorio) {
                System.out.println("El numero que adivinaste es demasiado bajo. Intente de nuevo");
            } else if (adivinar > aleatorio) {
                System.out.println("El número que adivinaste es demasiado alto. Intente de nuevo");
            }
        }
        System.out.println();

        // Si el jugador no adivina el número después de 5 intentos, muestra el número generado aleatoriamente
        if (!victoria){
            System.out.println("Lo siento, no adivinaste el numero en 5 intentos. El numero era " + aleatorio + ".");
        }
    }
}
