import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;

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

    public int puntos() {
        this.partido = new Partido(Equipo.ARGENTINA, Equipo.ARABIA_SAUDITA);
        
    }
}
