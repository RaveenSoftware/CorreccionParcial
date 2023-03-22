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
public class ConversionTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tiempo en segundos: ");
        int tiempoSegundos = sc.nextInt();

        int dias = tiempoSegundos / 86400;
        int horas = (tiempoSegundos % 86400) / 3600;
        int minutos = ((tiempoSegundos % 86400) % 3600) / 60;
        int segundos = ((tiempoSegundos % 86400) % 3600) % 60;

        System.out.println(tiempoSegundos + " segundos son:");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }
}
