import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ronda {

    public Ronda(String[] listaStringResultados) throws IOException {
        // Leer archivo de resultados y construir lista de objetos Partido
        /*      Este código es de prueba /// funcional
        List<String> lineas = Files.readAllLines(archivoResultados);
        String archivoStringResultados = String.join(",", lineas);
        String[] listaStringResultados = archivoStringResultados.split(",");*/
        Partido partido1 = new Partido(listaStringResultados[9], listaStringResultados[14]);
        Partido partido2 = new Partido(listaStringResultados[17], listaStringResultados[22]);
    }


    public String toString() {
        return "";
    }
}