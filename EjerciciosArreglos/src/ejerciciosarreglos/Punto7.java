package ejerciciosarreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese números enteros (0 para terminar):");

        int num;
        while (true) {
            System.out.print("Número: ");
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            numeros.add(num);
        }

        // Mostrar los números leídos
        System.out.println("\nNúmeros leídos: " + numeros);

        // Calcular suma y media
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }

        double media = numeros.isEmpty() ? 0 : (double) suma / numeros.size();

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);

        sc.close();
    }
}