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
            // String acumulador ="";
            switch (op) {
                case 1: {
                    System.out.println("Ingrese una palabra:");
                    String palabra = entrada.nextLine();
                    palabra = entrada.nextLine();
                    int cont = 0, cont2 = 1;
                    //System.out.println(palabra);
                    String acumulador = "";
                    boolean centinela = true;
                    while (palabra.length() != cont2) {
                        if (palabra.charAt(cont) == 'a' && palabra.charAt(cont2) == 'i') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                            centinela = false;
                        } else if (palabra.charAt(cont) == 'a' && palabra.charAt(cont2) == 'u') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                            centinela = false;
                        } else if (palabra.charAt(cont) == 'e' && palabra.charAt(cont2) == 'i') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                            centinela = false;
                        } else if (palabra.charAt(cont) == 'e' && palabra.charAt(cont2) == 'u') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                            centinela = false;
                        } else if (palabra.charAt(cont) == 'o' && palabra.charAt(cont2) == 'i') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                            centinela = false;
                        }else if (palabra.charAt(cont) == 'o' && palabra.charAt(cont2) == 'u'){
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                            centinela = false;
                        }

                        cont++;
                        cont2++;
                    }
                    break;
                }
                case 2: {
                    System.out.println("-----------Palabras palIndromes--------------");
                    System.out.println("Ingrese una palabra:");
                    String palabra = entrada.nextLine();
                    palabra.toLowerCase();
                    boolean centinela = true;
                    int cont = 0;
                    int cont2 = palabra.length()-1;
                    while (cont != palabra.length()) {
                        if (palabra.charAt(cont) == palabra.charAt(cont2)) {
                            System.out.println("La palabra es palindrome");
                        }
                    }
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
