package ejerciciosarreglos;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numerosEntrada = new ArrayList<>();
        ArrayList<Integer> factorialSalida = new ArrayList<>();

        // Tamaño inicial de la lista
        System.out.print("Defina el tamano del arreglo: ");
        int tamaño = sc.nextInt();

        // Llenar la lista de números aleatorios
        NumerosIniciales(tamaño, numerosEntrada);

        // Calcular el factorial de cada número y guardar en la otra lista
        CalculoFactorial(numerosEntrada, factorialSalida);

        // Mostrar resultados
        System.out.println("\nLos numeros generados son:");
        LeerValores(numerosEntrada);
        System.out.println("\nLos factoriales correspondientes son:");
        LeerValores(factorialSalida);

        sc.close();
    }

    // Genera 'tamaño' números aleatorios entre 1 y 9 y los agrega a la lista
    private static void NumerosIniciales(int tamaño, ArrayList<Integer> numerosEntrada) {
        Random rand = new Random();
        for (int i = 0; i < tamaño; i++) {
            int numeroAleatorio = rand.nextInt(9) + 1; // entre 1 y 9
            numerosEntrada.add(numeroAleatorio);
        }
    }

    // Calcula el factorial de cada número en numerosEntrada y los guarda en factorialSalida
    private static void CalculoFactorial(ArrayList<Integer> numerosEntrada, ArrayList<Integer> factorialSalida) {
        for (int num : numerosEntrada) {
            int factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            factorialSalida.add(factorial);
        }
    }

    // Imprime los valores de una lista con sus posiciones
    private static void LeerValores(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posicion " + i + ": " + lista.get(i));
        }
    }
}

