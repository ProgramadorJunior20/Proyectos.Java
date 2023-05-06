package co.com.protectoage;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        int edad = pedirEdad();
        validarEdad(edad);
    }

    public static int pedirEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        return edad;
    }

    public static void validarEdad(int edad){
        if (edad < 18){
            System.out.println("Usted es menor de edad.");
        } else {
            if (edad >= 18){
                System.out.println("Usted es mayor de edad.");
            }
        }
    }
}
