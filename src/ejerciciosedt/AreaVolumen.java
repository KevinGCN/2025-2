package ejerciciosedt;
import java.util.Scanner;

public class AreaVolumen {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Volumen del cubo");
        System.out.println("2. Area de un Circulo");
        System.out.println("3. Area de un Cuadrado");
        System.out.print("Escoga una opcion: ");
        int opcion = sc.nextInt();

        //seleccion
        switch (opcion) {
            case 1:
                System.out.print("Digite la medida del lado en centimetros: ");
                double lado = sc.nextDouble();
                VolumenCubo(lado);
                break;
            case 2:
                System.out.print("Digite el radio del circulo en centimetros: ");
                double radio = sc.nextDouble();
                AreaCirculo(radio);
                break;
            case 3:
                System.out.print("Digite el tamaño del lado en centimetros: ");
                double Tlado = sc.nextDouble();
                PerimetroCuadrado(Tlado);
                break;
            default:
                System.out.println("Opcion invalida.");
        }

    }

    public static void PerimetroCuadrado(double lado){
        double area = 0;
        //proceso sumando
        for (int i = 0; i < 4; i++) {
            area = area + lado;
        }
        System.out.println("El area del cuadrado es de "+area+" centimetros cuadrados");
    }
    
    public static void AreaCirculo(double radio) {
        //proceso elevado
        double area = Math.PI * (Math.pow(radio, 2));
        //resultado por consola
        System.out.println("El area del circulo es " + area + " centimetros cuadrados");
    }

    public static void VolumenCubo(double lado) {
        //proceso elevado a 3
        double volumen = Math.pow(lado, 3);
        //mensaje por sistema
        System.out.println("El volumen del cubo es " + volumen + " centimetros cubicos");
    }
}
