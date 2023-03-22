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
public class TrianguloRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        // Pedir al usuario el número de asteriscos de la base y de la altura
        System.out.print("Ingrese el número de asteriscos de la base del triángulo: ");
        int n = input.nextInt();

        // Dibujar el triángulo rectángulo con asteriscos
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




