/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller1corte2;

import java.util.Scanner;

/**
 *
 * @author JAIME BAUTISTA
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        // Pedir al usuario el número de elementos a mostrar
        System.out.print("Ingrese el número de elementos de la serie Fibonacci a mostrar: ");
        int n = input.nextInt();

        // Mostrar los primeros n elementos de la serie Fibonacci
        int a = 0;
        int b = 1;

        System.out.print("Serie Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
