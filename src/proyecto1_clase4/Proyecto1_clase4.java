/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1_clase4;

/**
 *
 * @author LEONARDO ROJAS
 */

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
package proyecto1_clase4;

import java.until.Scanner;
public class Proyecto1_clase4 (
    public static void main(String[] args) {
    // declarar variable
    int n1,n2, suma;
    Scanner lectura = new Scanner(System.in);
    // Scanner para ingresar algun dato
    //Entrada de datos
    System.out.print("Ingresar Numero 1:");
    n1 = lectura.nextInt();
    System.out.print("Ingresar Numero 2:");
    n2 = lectura.nextInt();
    // procesar datos
    suma=n1+n2;
    // salida de datos
    System.out.print("La suma de los numeros es: " + suma);
}