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
            System.out.println("2)Palabras Palindromas");
            System.out.println("3)Encriptación de Contraseñas");
            System.out.println("4)salir");
            int op = entrada.nextInt();
            // String acumulador ="";
            switch (op) {
                case 1: {
                    System.out.println("Ingrese una palabra:");
                    String palabra = entrada.nextLine();
                    palabra = entrada.nextLine();
                    palabra = palabra.toLowerCase();
                    int cont = 0, cont2 = 1;
                    //System.out.println(palabra);
                    String acumulador = "";
                    while (palabra.length() != cont2) {
                        if (palabra.charAt(cont) == 'a' && palabra.charAt(cont2) == 'i') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                        } else if (palabra.charAt(cont) == 'a' && palabra.charAt(cont2) == 'u') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                        } else if (palabra.charAt(cont) == 'e' && palabra.charAt(cont2) == 'i') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                        } else if (palabra.charAt(cont) == 'e' && palabra.charAt(cont2) == 'u') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                        } else if (palabra.charAt(cont) == 'o' && palabra.charAt(cont2) == 'i') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                        } else if (palabra.charAt(cont) == 'o' && palabra.charAt(cont2) == 'u') {
                            acumulador += palabra.charAt(cont);
                            acumulador += palabra.charAt(cont2);
                            System.out.println("felicidades:" + acumulador);
                        }else {
                            System.out.println("La palabra no contiene un diptongo");
                            break;
                        }

                        cont++;
                        cont2++;
                    }
                    break;
                }
                case 2: {
                    System.out.println("-----------Palabras palIndrome--------------");
                    System.out.println("Ingrese una palabra:");
                    String palabra = entrada.nextLine();
                    palabra = entrada.nextLine();
                    palabra = palabra.toLowerCase();
                    System.out.println(palabra);
                    String acumulador = "";
                    int cont2 = palabra.length() - 1;
                    while (cont2 >= 0) {
                        acumulador += palabra.charAt(cont2);
                        cont2--;
                    }
                    if (acumulador.equalsIgnoreCase(palabra)) {
                        System.out.println("la palabra es palindrome");
                    }else {
                        System.out.println("La palabra no es palindrome");
                    }
                    break;
                }
                case 3: {
                    System.out.println("---------Encriptacion Contra-------");
                    System.out.println("Ingrese una contra:");
                    String contra = entrada.next();
                    System.out.println("Ingrese un numero:");
                    int numero = entrada.nextInt();
                    int cont = 0;
                    String acumulador = "";
                    while (cont < contra.length()) {
                        if (contra.charAt(cont) == 'a' || contra.charAt(cont) == 'A') {
                            acumulador += numero;

                        } else if (contra.charAt(cont) == 'e' || contra.charAt(cont) == 'E') {
                            acumulador += numero;

                        } else if (contra.charAt(cont) == 'i' || contra.charAt(cont) == 'I') {
                            acumulador += numero;

                        } else if (contra.charAt(cont) == 'o' || contra.charAt(cont) == 'O') {
                            acumulador += numero;

                        } else if (contra.charAt(cont) == 'u' || contra.charAt(cont) == 'U') {
                            acumulador += numero;

                        } else {
                            acumulador += contra.charAt(cont);
                        }
//                        System.out.println(acumulador);
                        cont++;
                    }
                    System.out.println("password Final:" + acumulador);
                    break;
                }
                case 4: {
                    bandera = false;
                    break;
                }

            }
        }
    }

}
