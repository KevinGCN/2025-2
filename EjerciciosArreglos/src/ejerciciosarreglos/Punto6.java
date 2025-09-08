package ejerciciosarreglos;

import java.util.ArrayList;

public class Punto6 {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        // a) Rellenar y mostrar
        RellenarContenido(nombres);
        LeerContenido(nombres);

        // b) Adicionar en posición 1
        nombres.add(1, "Lara");
        System.out.println("\n\nNombre 'Lara' agregado en la posición 1.");

        // c) Remover posición 0
        String eliminado = nombres.remove(0);
        System.out.println("Nombre '" + eliminado + "' eliminado de la posición 0.");

        // d) Adicionar nuevo nombre en posición 0
        nombres.add(0, "Angie");
        System.out.println("Nombre 'Angie' agregado en la posición 0.");

        // e) Mostrar el contenido final
        System.out.println("\nLista final:");
        LeerContenido(nombres);

        // f) Obtener nombre en la posición 1
        String nombrePos1 = nombres.get(1);
        System.out.println("\n\nNombre en posición 1: " + nombrePos1);

        // g) Obtener último nombre
        String ultimoNombre = nombres.get(nombres.size() - 1);
        System.out.println("Último nombre guardado: " + ultimoNombre);
    }

    private static void RellenarContenido(ArrayList<String> nombres) {
        nombres.add("Jhoan");
        nombres.add("Kevin");
        nombres.add("Emerson");
        nombres.add("Juan");
        nombres.add("Brayan");
    }

    private static void LeerContenido(ArrayList<String> nombres) {
        System.out.println("\nNombres guardados:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Posición " + i + ": " + nombres.get(i));
        }
    }
}
