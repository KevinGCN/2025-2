package ejerciciosarreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numerosPares = new ArrayList<>();

        // a) Inicializar con los 20 primeros números pares (2 al 40)
        for (int i = 1; i <= 20; i++) {
            numerosPares.add(i * 2);//se multiplica por 2 por que los pares son
                                    //multiplos de 2
        }

        // a) Imprimir el ArrayList inicial
        System.out.println("ArrayList inicial:");
        imprimirLista(numerosPares);

        // b) Leer un número y colocarlo en su posición correcta
        System.out.print("\nIngrese un número para insertar en orden: ");
        int numeroNuevo = sc.nextInt();
        insertarOrdenado(numerosPares, numeroNuevo);

        System.out.println("ArrayList después de insertar:");
        imprimirLista(numerosPares);

        // c) Borrar un valor solicitado por el usuario
        System.out.print("\nIngrese un número para eliminar: ");
        int numeroEliminar = sc.nextInt();

        if (numerosPares.contains(numeroEliminar)) {
            numerosPares.remove(Integer.valueOf(numeroEliminar));
            System.out.println("Número eliminado con éxito.");
        } else {
            System.out.println("El número no está en la lista.");
        }

        System.out.println("ArrayList final:");
        imprimirLista(numerosPares);

        sc.close();
    }

    // Método para imprimir los elementos del ArrayList
    public static void imprimirLista(ArrayList<Integer> lista) {
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para insertar un número manteniendo el orden ascendente
    public static void insertarOrdenado(ArrayList<Integer> lista, int numero) {
        int i = 0;
        while (i < lista.size() && lista.get(i) < numero) {
            i++;
        }
        lista.add(i, numero);
    }
}