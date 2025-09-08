package ejerciciosarreglos;

public class Punto1 {
    
    // Función principal
    public static void main(String[] args) {
        int[] primos = new int[10]; // tamaño del arreglo (cantidad de primos)
        EstablecerValor(primos);
        MostrarContenido(primos);
    }
    
    // Verifica si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        if (numero == 2) {//2 es el unico par primo
            return true;
        }
        if (numero % 2 == 0) {//con % eliminamos los numeros pares
            return false;
        }

        for (int i = 3; i <= Math.sqrt(numero); i += 2) { //avanzamos comprobando los numeros impares
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Llena el arreglo con números primos
    private static void EstablecerValor(int[] primos) {
        int numero = 2;
        int i = 0;

        while (i < primos.length) {
            if (esPrimo(numero)) {
                primos[i] = numero;
                i++;
            }
            numero++;
        }
    }

    // Muestra el contenido del arreglo con su posición
    private static void MostrarContenido(int[] primos) {
        for (int i = 0; i < primos.length; i++) {
            System.out.println("El numero en la posicion " + i + " es el " + primos[i]);
        }
    }

}
