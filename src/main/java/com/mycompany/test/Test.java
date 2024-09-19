/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author Dicta
 */
public class Test {

    public static void main(String[] args) {
        var separacion = "------------------------------------";
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Pulsa 1 para continuar:");
            System.out.println("Pulsa 2 para cerrar:");
            System.out.println(separacion);

            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.println("Introduce tu nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Tu nombre es: " + nombre);
                    System.out.println(separacion);
                    break;
                case 2:
                    System.out.println("Ceerrando programa...");
                    break;
                default:
                    System.out.println("Intentalo de nuevo");
                    System.out.println(separacion);
                    break;
            } 
        } while (option != 2);
    } 
}
