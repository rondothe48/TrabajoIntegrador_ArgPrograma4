import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //resultados lector .csv
        Path archivoResultados = Paths.get("src/resultados.csv");
        Files.readAllLines(archivoResultados);
        String archivoStringResultados = Files.readString(archivoResultados);

        String[] listaStringResultados = archivoStringResultados.split(",");


        //pronostico lector .csv
        Path archivoPronostico = Paths.get("src/pronostico.csv");
        Files.readAllLines(archivoPronostico);
        String archivoStringPronostico = Files.readString(archivoPronostico);

        String[] listaStringPronostico = archivoStringPronostico.split(",");


        //New ronda
        Ronda ronda1 = new Ronda(listaStringResultados);
        System.out.println(ronda1);

        System.out.println("------------" + "\n------------");

        //New pronostico
        Pronostico pronosticoPrueba = new Pronostico(listaStringPronostico, listaStringResultados);
        System.out.println(pronosticoPrueba);



        //Partido partido1 = new Partido(Equipo.ARGENTINA, Equipo.ARABIA_SAUDITA);
        //Partido partido2 = new Partido(Equipo.POLONIA, Equipo.MEXICO);
        //Partido.resultado(Equipo.ARABIA_SAUDITA);
        //Pronostico.pronostico();
    }


}


