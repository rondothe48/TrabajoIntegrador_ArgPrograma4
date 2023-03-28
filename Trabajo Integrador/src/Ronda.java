import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ronda {
    //private List<Partido> partidos;

    public Ronda(Path archivoResultados) throws IOException {
        // Leer archivo de resultados y construir lista de objetos Partido
        Files.readAllLines(archivoResultados);
        String archivoStringResultados = Files.readString(archivoResultados);
        String[] listaStringResultados = archivoStringResultados.split(",");
        /*      Este código es de prueba /// funcional
        List<String> lineas = Files.readAllLines(archivoResultados);
        String archivoStringResultados = String.join(",", lineas);
        String[] listaStringResultados = archivoStringResultados.split(",");*/
        Partido partido1 = new Partido(listaStringResultados[9], listaStringResultados[14]);
        Partido partido2 = new Partido(listaStringResultados[17], listaStringResultados[22]);
    }

    /*public List<Partido> getPartidos() {
        return partidos;
    }*/

    /*public List<Partido> getPartidos(String archivoPronosticos) {
        // Leer archivo de pronósticos y actualizar lista de objetos Partido con los pronósticos


        return partidos;

    }*/
}