package ejerciciosarreglos;

import java.util.ArrayList;

public class Punto9 {

    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>();

        //a) adicionar 6 datos e imprimirlos
        for (int i = 1; i <= 6; i++) {
            int valor = i * 10;
            arreglo.add(valor);
            System.out.print("| " + valor + " |");
        }
        System.out.println();

        //b) adicionar 1000 en 1 y 2000 en 3
        arreglo.add(1, 1000);
        arreglo.add(3, 2000);
        LeerContenido(arreglo);

        //c) posición 0 (5000) y posición 2(10000)
        arreglo.set(0, 5000);
        arreglo.set(2, 10000);
        LeerContenido(arreglo);

        //d y e
        LeerPosicion(arreglo);

        //f) adicionar 2000 en ultima posicion
        arreglo.add(2000);

        //g) recorer de nuevo con posicones nuevas
        LeerPosicion(arreglo);

        //h)Averiguar si existe el 40 y su posicion
        System.out.println();
        int valorBuscado = 40;{
            // Buscar la posición (índice) de la primera ocurrencia
            int indice = arreglo.indexOf(valorBuscado);
            if (indice != -1) {
                System.out.println("El valor " + valorBuscado + " esta en el arreglo, en la posicion (indice): " + indice);
            } else {
                System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo.");
            }
        }
        System.out.println();
        
        //i) eliminar valor en posicion 5
        arreglo.remove(5);
        LeerContenido(arreglo);
        System.out.println("Numero en posicion 5 eliminado");
        
        //j)averiguar si la lista esta vacia o cuantos elementos contiene
        if (arreglo.isEmpty()) {
            System.out.println("\nLa lista no contiene ningun dato");
        }else{
            int tamaño = arreglo.size();
            System.out.println("\nLa lista contiene "+tamaño+" elementos");
        }
        System.out.println();
        
        //k)Crear un segundo ArrayList con 3 objetos enteros
        ArrayList <Integer> b = new ArrayList<>();
        b.add(111);   b.add(222);   b.add(333);
        LeerContenido(b);
        
        //l) nuevo array C con 2 elementos
        ArrayList <Integer> c = new ArrayList<>();
        c.add(77777); c.add(88888);
        LeerContenido(c);
        
        //m)Agregar a (b) los elementos  (a) y (c) e imprima  (b)
        b.addAll(arreglo);
        b.addAll(c);
        LeerContenido(b);
        
        //n Adicionar un nuevo valor (99999) a la lista (a) e imprímala
        arreglo.add(99999);
        LeerContenido(arreglo);
        
        //o) elimine A Y C de B e imprima
        b.removeAll(arreglo);
        LeerContenido(b);
        
        //p eliminar todo A y comprobar
        System.out.println("Eliminar todo contenido del Primer ArregloLista");
        arreglo.removeAll(arreglo);
        System.out.println("Imprimir primer ArregloLista");
        LeerContenido(arreglo);
    }

    private static void LeerPosicion(ArrayList<Integer> arreglo) {
        //Imprima la posición de la primera ocurrencia del valor 2000
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i) == 2000) {
                System.out.println("\nPrimera ocurrencia de 2000, indice: " + i);
                break;
            }
        }
        //e) Imprima la posición de la ultima ocurrencia del valor 2000
        for (int i = arreglo.size() - 1; i >= 0; i--) {
            if (arreglo.get(i) == 2000) {
                System.out.println("Ultima ocurrencia de 2000,indice: " + i);
                break; // Se detiene al encontrar la última (más a la derecha)
            }
        }
    }

    private static void LeerContenido(ArrayList<Integer> arreglo) {
        int i = 0;
        while (arreglo.size() > i) {
            System.out.print("| " + arreglo.get(i) + " |");
            i++;
        }
        System.out.println();
    }
}
