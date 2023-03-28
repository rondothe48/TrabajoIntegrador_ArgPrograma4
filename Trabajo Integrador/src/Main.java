import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Ronda ronda1 = new Ronda(Paths.get("C:\\Users\\Rondo48\\Documents\\GitHub\\TrabajoIntegrador\\Trabajo Integrador\\src\\resultados.csv"));
        System.out.println(ronda1);
        System.out.println("------------" + "\n------------");
        Pronostico pronosticoPrueba = new Pronostico(Paths.get("C:\\Users\\Rondo48\\Documents\\GitHub\\TrabajoIntegrador\\Trabajo Integrador\\src\\pronostico.csv"));
        System.out.println(pronosticoPrueba);



        //Partido partido1 = new Partido(Equipo.ARGENTINA, Equipo.ARABIA_SAUDITA);
        //Partido partido2 = new Partido(Equipo.POLONIA, Equipo.MEXICO);
        //Partido.resultado(Equipo.ARABIA_SAUDITA);
        //Pronostico.pronostico();
    }


}


