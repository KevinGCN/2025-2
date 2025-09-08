package ejerciciosarreglos;

import java.util.Random;

public class Punto4 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        ValoresIniciales(numeros);
        System.out.println("El mayor numero del arreglo es: " + Mayor(numeros));
        System.out.println("El menor numero del arreglo es: " + Menor(numeros));
    }

    //si se quiere ver el contenido del arreglo
    private static void MostrarArreglo(int[] numeros) {
        System.out.print("Arreglo generado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void ValoresIniciales(int[] numeros) {
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) { //para asignar valores
            int numeroAleatorio;
            boolean repetido;

            do {
                repetido = false;
                numeroAleatorio = rand.nextInt(50) + 1;

                // Verifica si el número ya existe en posiciones anteriores
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numeroAleatorio) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            numeros[i] = numeroAleatorio;
        }
    }

    private static int Menor(int[] numeros) {
        int valorMin = 10;
        for (int i = 0; i < numeros.length; i++) {
            if (valorMin >= numeros[i]) {
                valorMin = numeros[i];
            }
        }
        return valorMin;
    }

    private static int Mayor(int[] numeros) {
        int valorMax = 10;
        for (int i = 0; i < numeros.length; i++) {
            if (valorMax <= numeros[i]) {
                valorMax = numeros[i];
            }
        }
        return valorMax;
    }
}
