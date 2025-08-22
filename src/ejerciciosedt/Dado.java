package ejerciciosedt;
import java.util.Random;
import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        int opcion;

        do {
            System.out.println("Tienes "+intentos+" intentos para conseguir el numero 6");
            System.out.println("Tirar dado?");
            System.out.println("1. Si      2. No");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int resultado = lanzarDado();
                    if (resultado == 6) {
                        System.out.println("¡Felicidades! Sacaste el resultado maximo.");
                        break; // gana y sale
                    } else {
                        intentos--;
                        System.out.println("No sacaste un 6. Te quedan " + intentos + " intentos.");
                        if (intentos == 0) {
                            System.out.println("Se acabaron tus intentos. ¡Juego terminado!");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Juego terminado. Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (intentos > 0 || opcion == 2);
    }

    // Método que lanza el dado y devuelve un número entre 1 y 6
    public static int lanzarDado() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(6) + 1;
        System.out.println("Numero del dado: " + numeroAleatorio);
        return numeroAleatorio;
    }
}
