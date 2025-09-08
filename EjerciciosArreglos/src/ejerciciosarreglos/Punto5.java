package ejerciciosarreglos;

import java.util.Scanner;
import java.util.ArrayList;

public class Punto5 {

    public static void main(String[] args) {
        ArrayList<Integer> arregloContenedor = new ArrayList<>();
        ArrayList<Integer> arregloInvertido = new ArrayList<>();
        
        Menu(arregloContenedor, arregloInvertido);
        System.out.print("\nNumeros guardados");
        LeerContenido(arregloContenedor);
        System.out.print("\nNumeros Invertidos");
        LeerContenido(arregloInvertido);
    }

    private static void Menu(ArrayList<Integer> arregloContenedor,
            ArrayList<Integer> arregloInvertido) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de numeros a ingresar?: ");
        int tamaño = sc.nextInt();
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Numero a invertir= ");
            int num = sc.nextInt();
            arregloContenedor.add(num);
            arregloInvertido.add(invertirNumero(num));
        }
        sc.close();
    }

    private static void LeerContenido(ArrayList<Integer> arreglo) {
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.print("\n Numero guardado :" + arreglo.get(i)
                    + " en la posicion :" + i);
        }
    }

    private static int invertirNumero(int num) {
        int invertido = 0;
        while (num != 0) {
            int digito = num % 10;            // 1. Extrae el último dígito
            invertido = invertido * 10 + digito;  // 2. Lo agrega al nuevo número
            num /= 10;                        // 3. Elimina el último dígito
        }
        return invertido;
    }

}
