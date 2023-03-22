import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pronostico {
    public static void pronostico() throws IOException {
        Path archivoPronostico = Paths.get("C:/Nacho/GitHub Repositories/TrabajoIntegrador/Trabajo Integrador/src/pronostico.csv");
        Files.readAllLines(archivoPronostico);
        String archivoStringPronostico = Files.readString(archivoPronostico);
        String[] listaStringPronostico = archivoStringPronostico.split(",");

        Path archivoResultados = Paths.get("C:/Nacho/GitHub Repositories/TrabajoIntegrador/Trabajo Integrador/src/resultados.csv");
        Files.readAllLines(archivoResultados);
        String archivoStringResultados = Files.readString(archivoResultados);
        String[] listaStringResultados = archivoStringResultados.split(",");

        if (listaStringPronostico[9].equals(listaStringResultados[12])) {

        }
    }

    public static void puntos() {

    }
}
