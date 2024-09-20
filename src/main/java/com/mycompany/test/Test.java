/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Dicta
 */
public class Test {
    static private String separacion = "------------------------------------";
    static private String prueba = "Test-Git";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        
        HashMap<String, String> user_credentials = new HashMap<>();
        user_credentials.put("Joel", "1234");  // Joel tiene la contraseña 1234
        user_credentials.put("Manu", "5678");  // Manu tiene la contraseña 5678
        
        do {
            System.out.println("Pulsa 1 para iniciar sesion:");
            System.out.println("Pulsa 2 para mostrar credenciales (Test):");
            System.out.println("Pulsa 3 para cerrar:");
            System.out.println(separacion);

            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    verficarUser(scanner, user_credentials);
                    break;
                case 2:
                    System.out.println(user_credentials);
                    System.out.println(separacion);
                    break;
                case 3:
                    System.out.println("Ceerrando programa...");
                    break;
                default:
                    System.out.println("Intentalo de nuevo");
                    System.out.println(separacion);
                    break;
            } 
        } while (option != 3);
    } 
    
    public static void verficarUser(Scanner scanner, HashMap<String, String> user_credentials) {
        System.out.println("Introduce nombre de usuario:");
        System.out.println(separacion);
        String name = scanner.nextLine(); 
          
        if (user_credentials.containsKey(name)) { // Verificar si el nombre está en la lista
            System.out.println("Tu nombre es: " + name);
            System.out.println("Introduce tu contraseña:");
            System.out.println(separacion);
            String pass = scanner.nextLine();
            
            if (user_credentials.get(name).equals(pass)) {
                System.out.println("Inicio de sesion correcto.");
                System.out.println(separacion);
                 
            } else {
                System.out.println("Contraseña incorrecta");
                System.out.println(separacion);
            }
        } else {
            System.out.println("Nombre de usuario no válido.");
        }
    }
}
