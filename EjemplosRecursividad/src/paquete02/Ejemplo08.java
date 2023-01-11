/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio

        System.out.println("Ingrese el tamaño del arreglo");
        int posiciones = entrada.nextInt();
        int[] arreglo1 = new int[posiciones];

        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingresar el valor de la posicion " + i);
            arreglo1[i] = entrada.nextInt();
        }

        System.out.printf("La suma es igual a: %s\n", 
                misterio(arreglo1, posiciones));

    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
