import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        System.out.println(Files.readAllLines(Paths.get("E:/AAA GitHub/TrabajoIntegrador/Trabajo Integrador/src/pronostico.csv")));

    } catch(Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
