/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio_integrador_aerolinea;

import java.util.Scanner;

/**
 *
 * @author DREP
 */
public class Ejercicio_Integrador_Aerolinea {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Creamos la matriz Vuelos
        Scanner sc = new Scanner(System.in);
        int vueloAerolinea[][] = new int[6][3];
        System.out.println("Ingrese Cantidad De Asientos para el Destino(6) x " + " horario(3) ");

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                vueloAerolinea[f][c] = (int) (Math.random() * 100);
            }
        }

        //pintando matriz
        for (int f = 0; f < 6; f++) {
            System.out.println(" ");
            for (int c = 0; c < 3; c++) {
                System.out.print(vueloAerolinea[f][c] + "    ");
            }
            System.out.println("  ");
        }
        //venta de asientos
        int destino, turno, cantAsientos;
        String bandera = "";
        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.print("Ingrese Destino: ");
            destino = sc.nextInt();
            System.out.print("Ingrese turno: ");
            turno = sc.nextInt();
            System.out.print("Ingrese Cantidad Asientos");
            cantAsientos = sc.nextInt();
            if (destino >= 0 && destino <= 5) {
                if (turno >= 0 && turno <= 2) {
                    if (cantAsientos > vueloAerolinea[destino][turno]) {
                        System.out.println("No Hay Asientos Disponibles");
                    } else {
                        System.out.println("Ha Reservado Con Exito");
                        vueloAerolinea[destino][turno] = vueloAerolinea[destino][turno] - cantAsientos;
                    }
                } else {
                    System.out.println("Numero de turno Esta Fuera De Rango Ingrese Entre 0 y 2");
                }
            } else {
                System.out.println("Numero de Destino Esta Fuera De Rango Ingrese Entre 0 y 5");
            }
            System.out.println("Desea Continuar Reservando?\n Ingrese Finish para Finalizar o  cualquier"
                    + " valor para continuar");
            bandera = sc.next();

        }

    }
}
