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
public class ComprobarNumeroAdecuadoParaApilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese un número natural
        System.out.print("Ingrese un número natural: ");
        int n = input.nextInt();

        // Comprobar si el número es adecuado para apilar
        int m = (int) (Math.sqrt(8 * n + 1) - 1) / 2;
        int check = m * (m + 1) / 2;

        if (check == n) {
            System.out.println(n + " es adecuado para apilar.");
        } else {
            System.out.println(n + " no es adecuado para apilar.");
        }
    }
}
