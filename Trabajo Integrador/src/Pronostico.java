import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pronostico {

        //private List<Partido> partidos;

    public Pronostico(Path archivoResultados) throws IOException {
            // Leer archivo de resultados y construir lista de objetos Partido
        Files.readAllLines(archivoResultados);
        String archivoStringResultados = Files.readString(archivoResultados);
        String[] listaStringResultados = archivoStringResultados.split(",");
        /*      Este código es de prueba /// funcional
        List<String> lineas = Files.readAllLines(archivoResultados);
        String archivoStringResultados = String.join(",", lineas);
        String[] listaStringResultados = archivoStringResultados.split(",");*/
        PartidoProyectado partido1 = new PartidoProyectado(listaStringResultados[9], listaStringResultados[14]);
        PartidoProyectado partido2 = new PartidoProyectado(listaStringResultados[17], listaStringResultados[22]);









    /*private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    static String[]ResultadoEnum = {"GANADOR", "EMPATE", "PERDEDOR"};
    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }


    /*public static void pronostico() throws IOException {
        Path archivoPronostico = Paths.get("C:/Nacho/GitHub Repositories/TrabajoIntegrador/Trabajo Integrador/src/pronostico.csv");
        Files.readAllLines(archivoPronostico);
        String archivoStringPronostico = Files.readString(archivoPronostico);
        String[] listaStringPronostico = archivoStringPronostico.split(",");

        Path archivoResultados = Paths.get("C:/Nacho/GitHub Repositories/TrabajoIntegrador/Trabajo Integrador/src/resultados.csv");
        Files.readAllLines(archivoResultados);
        String archivoStringResultados = Files.readString(archivoResultados);
        String[] listaStringResultados = archivoStringResultados.split(",");


    }*/

    /*public Pronostico(Path archivoPronostico) throws IOException {
        Files.readAllLines(archivoPronostico);
        String archivoStringPronostico = Files.readString(archivoPronostico);
        String[] listaStringPronostico = archivoStringPronostico.split(",");




        /*this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        setGolesEquipo1(1);
        setGolesEquipo2(2);
        if (golesEquipo1 < golesEquipo2) {
            System.out.println(equipo1 + "\n" + ResultadoEnum[0]);
            System.out.println(equipo2 + "\n" + ResultadoEnum[2]);
        } else {
            System.out.println(equipo2 + "\n" + ResultadoEnum[0]);
            System.out.println(equipo1 + "\n" + ResultadoEnum[2]);
        }*/
}
    public String toString() {
        return "";
    }
    public void puntos() {
    }
}
