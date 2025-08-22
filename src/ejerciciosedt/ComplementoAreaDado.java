package ejerciciosedt;

import java.util.Scanner;

public class ComplementoAreaDado {

    public static void main(String[] args) {
        //instancias
        Scanner sc = new Scanner(System.in);
        //variables
        int opcion;

        //inicio de ciclo
        do {
            //Menu de Selección
            System.out.println("Bienvenido");
            System.out.println("Que desead hacer?");
            System.out.println("1. Calcular Area de un Circulo");
            System.out.println("2. Calcular Perimetro de un Cuadrado");
            System.out.println("3. Calcular Volumen Cubo");
            System.out.println("4. Jugar Acierta el Dado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //Pedir por teclado los valores
                    System.out.print("Digite el radio del circulo en centimetros: ");
                    double radio = sc.nextDouble();
                    AreaVolumen.AreaCirculo(radio);
                    break;
                case 2:
                    System.out.print("Digite el tamaño del lado en centimetros: ");
                    double lado = sc.nextDouble();
                    AreaVolumen.PerimetroCuadrado(lado);
                    break;
                case 3:
                    System.out.print("Digite el tamaño del del lado en centimetros: ");
                    double ladov = sc.nextDouble();
                    AreaVolumen.VolumenCubo(ladov);
                    break;
                case 4:
                    int intentos = 3;
                    while (intentos > 0) {
                        intentos = Juegodado(sc, intentos);
                    }
                    break;

                default:
                    throw new AssertionError();
            }
        } while (opcion != 5);
    }

    public static int Juegodado(Scanner sc, int intentos) {
        System.out.println("¿Tirar dado?");
        System.out.println("1. SI     2. NO");
        int lanzar = sc.nextInt();
        if (lanzar == 1) {
            int resultado = Dado.lanzarDado();
            if (resultado == 6) {
                System.out.println("¡Felicidades! Sacaste el resultado máximo.");
            } else {
                intentos--;
                System.out.println("No sacaste un 6. Te quedan " + intentos + " intentos.");
                if (intentos == 0) {
                    System.out.println("Se acabaron tus intentos. ¡Perdiste!");
                }
            }
        } else {
            System.out.println("Saliste del juego.");
            intentos = 0; // Terminar el juego
        }
        return intentos;
    }
}
