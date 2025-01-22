package proyecto1_clase4;

import java.util.Scanner;
public class Proyecto1_clase4 {
    public static void main(String[] args) {
    // declarar variables
    int n1,n2,n3,n4, suma;
    Scanner lectura = new Scanner(System.in);
    //Entrada de datos
    System.out.print("Ingresar Numero 1: ");
    n1=lectura.nextInt();
    System.out.print("Ingresar Numero 2: ");
    n2=lectura.nextInt();
    System.out.print("Ingresar Numero 3: ");
    n3=lectura.nextInt();
    System.out.print("Ingresar Numero 4: ");
    n4=lectura.nextInt();
    // procesar datos
    suma=n1+n2+n3+n4;
    // salida de datos
    System.out.println("La suma de los numeros es: " + suma);
}
    
}