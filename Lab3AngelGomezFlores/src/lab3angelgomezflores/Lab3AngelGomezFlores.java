/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3angelgomezflores;

import java.util.Scanner;

/**
 *
 * @author Angel G
 */
public class Lab3AngelGomezFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una opcion");
            System.out.println("1) DIPTONGO");
            System.out.println("2)");
            System.out.println("3)");
            System.out.println(":");
            int op = entrada.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Ingrese una palabra:");
                    String palabra = entrada.nextLine();
                    palabra = entrada.nextLine();
                    while (bandera) {
                        
                    }
                    break;
                }
                case 2: {
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("");
                    break;
                }
                case 4: {
                    bandera = false;
                    break;
                }

                default: {
                    break;
                }
            }
        }
    }

}
