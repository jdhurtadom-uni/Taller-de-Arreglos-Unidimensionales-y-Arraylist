package arraylist;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class E10 {

    private static final String ficheroPartido =
    "C:\\Users\\Usuario\\OneDrive\\Documentos\\ProyectoPartido\\ProyectoPartido\\src\\PartidoLiga.txt";

    public static void main(String[] args) {

        System.out.println("--Se crea un Arraylist para trabajar en el main");

        ArrayList<PartidoFutbol> partidos = new ArrayList<>();

        File fichero = new File(ficheroPartido);
        Scanner leerLinea = null;

        try {

            System.out.println("..leemos el contenido del fichero");

            leerLinea = new Scanner(fichero);

            while (leerLinea.hasNextLine()) {

                String linea = leerLinea.nextLine().trim();

                PartidoFutbol partidoJugado = new PartidoFutbol();

                String[] cortarString = linea.split("::");

                partidoJugado.setEquipoLocal(cortarString[0]);
                partidoJugado.setEquipoVisitante(cortarString[1]);
                partidoJugado.setGolLocal(Integer.parseInt(cortarString[2]));
                partidoJugado.setGolVisitante(Integer.parseInt(cortarString[3]));

                partidos.add(partidoJugado);
            }

        } catch (Exception e) {

            System.out.println("Archivo no leido");

        }

        System.out.println("\n...Guardado");
        System.out.println("Total de partidos " + partidos.size());

        // Mostrar todos los partidos
        System.out.println("\n LISTA DE PARTIDOS ");

        Iterator<PartidoFutbol> recorridoIterator = partidos.iterator();

        while (recorridoIterator.hasNext()) {

            PartidoFutbol partidoJugado = recorridoIterator.next();

            System.out.println(
                    partidoJugado.getEquipoLocal() + " "
                    + partidoJugado.getGolLocal() + " "
                    + partidoJugado.getEquipoVisitante() + " "
                    + partidoJugado.getGolVisitante());
        }

        
        // 1 Mostrar partidos donde ganó el visitante
        

        System.out.println("\n PARTIDOS DONDE GANÓ EL VISITANTE ");

        for (PartidoFutbol p : partidos) {

            if (p.getGolVisitante() > p.getGolLocal()) {

                System.out.println(
                        p.getEquipoLocal() + " "
                        + p.getGolLocal() + " - "
                        + p.getEquipoVisitante() + " "
                        + p.getGolVisitante());
            }
        }

        
        // 2 Contar cuántas veces ganó el Barcelona
        

        int victoriasBarcelona = 0;

        for (PartidoFutbol p : partidos) {

            if (p.getEquipoLocal().equals("Barcelona")
                    && p.getGolLocal() > p.getGolVisitante()) {

                victoriasBarcelona++;
            }

            if (p.getEquipoVisitante().equals("Barcelona")
                    && p.getGolVisitante() > p.getGolLocal()) {

                victoriasBarcelona++;
            }
        }

        System.out.println("\nVictorias del Barcelona: " + victoriasBarcelona);

        
        // 3 Eliminar partidos que no sean empate
        

        Iterator<PartidoFutbol> it = partidos.iterator();

        while (it.hasNext()) {

            PartidoFutbol p = it.next();

            if (p.getGolLocal() != p.getGolVisitante()) {

                it.remove();
            }
        }

        System.out.println("\n PARTIDOS QUE TERMINARON EN EMPATE ");

        for (PartidoFutbol p : partidos) {

            System.out.println(
                    p.getEquipoLocal() + " "
                    + p.getGolLocal() + " - "
                    + p.getEquipoVisitante() + " "
                    + p.getGolVisitante());
        }

        
        // 4 Contar partidos ganados por el local
       

        int victoriasLocal = 0;

        for (PartidoFutbol p : partidos) {

            if (p.getGolLocal() > p.getGolVisitante()) {

                victoriasLocal++;
            }
        }

        System.out.println("\nPartidos ganados por el equipo local: " + victoriasLocal);
    }
}

/* SEGUNDA CLASE */

class PartidoFutbol {

    private String equipoLocal;
    private String equipoVisitante;
    private int golLocal;
    private int golVisitante;

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolLocal() {
        return golLocal;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }
}