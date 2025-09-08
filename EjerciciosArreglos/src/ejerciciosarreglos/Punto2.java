package ejerciciosarreglos;

public class Punto2 {

    public static void main(String[] args) {
        int[] pares = new int[100];

        esPar(pares);
        leerValores(pares);
    }

    private static void esPar(int[] pares) {
        int numero = 1;
        for (int i = 0; i < pares.length; i++) {
            if (numero % 2 == 0) {
                pares[i] = numero;
                numero++;
            } else {
                numero++;
                pares[i] = numero;
                numero++;
            }
        }
    }

    private static void leerValores(int[] pares) {
        for (int i = 0; i < pares.length; i++) {
            System.out.print("| " + pares[i] + " |");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
