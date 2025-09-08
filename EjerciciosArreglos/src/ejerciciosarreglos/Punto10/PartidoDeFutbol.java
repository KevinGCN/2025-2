package ejerciciosarreglos.Punto10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PartidoDeFutbol {

    //final en clases hijas sirve para evitar cambios
    private static final String NOMBREFICHERO
            = "C:\\Users\\carli\\OneDrive\\Documentos\\NetBeansProjects\\EjerciciosArreglos\\src\\Punto10\\partidos.txt";

    public static void main(String[] args) {
        ///crear arraylist para traer todos las lineas del archivo plano
        System.out.println("***Crear un arralist de objetos de la clase PartidoFutbol");
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        ArrayList<PartidoFutbol> partidosCopia = new ArrayList<>();
        //insertar el fichero hacia los datos, Clase File lee ficheros
        File fichero = new File(NOMBREFICHERO);
        System.out.println("Se ha cargado el archivo");
        //leer lineas
        Scanner leerLinea;

        //obtener los datos de cada ilnea del dichero
        System.out.println("...Leemos el contenido...");
        try {
            leerLinea = new Scanner(fichero);
            //hasnext comprueba que exista una linea siguiente, es un iterador como for
            while (leerLinea.hasNext()) {
                String linea = leerLinea.nextLine();
                String[] cortarLinea = linea.split("::");
                //String[] es un subconjunto de String, split corta lineas de cararcteres

                PartidoFutbol partido = new PartidoFutbol();
                //propiedades separadas de partido
                partido.setEquipoLocal(cortarLinea[0]);
                partido.setEquipoVisitante(cortarLinea[1]);
                partido.setGolLocal(Integer.parseInt(cortarLinea[2]));
                partido.setGolVisitante(Integer.parseInt(cortarLinea[3]));

                partidos.add(partido);//agrega los elementos seccionados en la clase PartidoFutbol
                partidosCopia.add(partido);//agrega los elementos seccionados en la clase PartidoFutbol
                //con los setters se posiciona ademas de [] para la posicion

            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(PartidoDeFutbol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo leer el archivo");
        }

        //comenzamos a consultar
        System.out.println("Guardados " + partidos.size() + " partidos");

        //contains para busquedas de tipo string
        //a)Mostrar donde el visitante Ganó
        int contador = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.getGolLocal() < partido.getGolVisitante()) {
                System.out.println("Equipo visitante ganador del "
                        + contador + " partido fue: " + partido.getEquipoVisitante());
                contador = contador + 1;
            } else {
                contador += 1;
            }
        }

        //b)Contar cuantas veces gano el Sevilla
        int sevillaGano = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.getEquipoLocal().equals("Sevilla") &&
                    partido.getGolLocal() > partido.getGolVisitante()) {
                sevillaGano += 1;
            } else if (partido.getEquipoVisitante().equals("Sevilla") &&
                    partido.getGolLocal() < partido.getGolVisitante()) {
                sevillaGano += 1;
            }
        }
        System.out.println("Veces que Sevilla gano: " + sevillaGano);

        //c) Eliminar los partidos que no son empates
        partidosCopia.removeIf(partido -> 
                partido.getGolLocal() != partido.getGolVisitante());

        // Imprimir los partidos restantes (que son empates)
        System.out.println("Partidos que terminaron en empate: " + 
                partidosCopia.size());

        for (PartidoFutbol partido : partidosCopia) {
            System.out.println(partido.getEquipoVisitante()+" "+
                    partido.getGolVisitante()+" : "+partido.getGolLocal()+
                    " "+partido.getEquipoLocal());
        }
        
        //d) Contar cuantos partidos ganaron los locales
        int contadorLocal = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.getGolLocal()>partido.getGolVisitante()) {
                contadorLocal += 1;
            }
        }
        System.out.println("Los equipos locales ganaron "+contadorLocal+""
                + " partidos");
    }

}
