import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Pronostico {

        //private List<Partido> partidos;

    //public Pronostico(Path archivoResultados) throws IOException {
            // Leer archivo de resultados y construir lista de objetos Partido
        /*Files.readAllLines(archivoResultados);
        String archivoStringResultados = Files.readString(archivoResultados);
        String[] listaStringResultados = archivoStringResultados.split(",");
        /*      Este código es de prueba /// funcional
        List<String> lineas = Files.readAllLines(archivoResultados);
        String archivoStringResultados = String.join(",", lineas);
        String[] listaStringResultados = archivoStringResultados.split(",");*/
        //PartidoProyectado partido1 = new PartidoProyectado(listaStringResultados[9], listaStringResultados[14]);
        //PartidoProyectado partido2 = new PartidoProyectado(listaStringResultados[17], listaStringResultados[22]);




    private int golesEquipo1;
    private int golesEquipo2;
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


   /* public static void pronostico() throws IOException {
        Path archivoPronostico = Paths.get("C:/Nacho/GitHub Repositories/TrabajoIntegrador/Trabajo Integrador/src/pronostico2.csv");
        Files.readAllLines(archivoPronostico);
        String archivoStringPronostico = Files.readString(archivoPronostico);
        String[] listaStringPronostico = archivoStringPronostico.split(",");

        Path archivoResultados = Paths.get("C:/Nacho/GitHub Repositories/TrabajoIntegrador/Trabajo Integrador/src/resultados.csv");
        Files.readAllLines(archivoResultados);
        String archivoStringResultados = Files.readString(archivoResultados);
        String[] listaStringResultados = archivoStringResultados.split(",");


    }*/

    public Pronostico(String[] listaStringPronostico, String[] listaStringResultados) throws IOException {
            int puntos = 0;

            //PRUEBA DE PRONOSTICO CON BUCLE FOR  --- intentar solucionarlo
            for(int i = 0; i < listaStringPronostico.length; i++) {
                if (listaStringPronostico[i].equals("x")) {
                    setGolesEquipo1(Integer.parseInt(listaStringResultados[11]));
                    setGolesEquipo2(Integer.parseInt(listaStringResultados[12]));
                    if (listaStringPronostico[i].equals("x") && golesEquipo1 > golesEquipo2) {
                        puntos++;
                    } else if (listaStringPronostico[i].equals("x")  && golesEquipo1 == golesEquipo2) {
                        puntos++;
                    } else if (listaStringPronostico[i].equals("x")  && golesEquipo1 < golesEquipo2) {
                        puntos++;
                    }
            }



            if (listaStringPronostico[6].equals("x") || listaStringPronostico[7].equals("x") || listaStringPronostico[8].equals("x")) {
                setGolesEquipo1(Integer.parseInt(listaStringResultados[11]));
                setGolesEquipo2(Integer.parseInt(listaStringResultados[12]));
                if (listaStringPronostico[6].equals("x") && golesEquipo1 > golesEquipo2) {
                    puntos++;
                } else if (listaStringPronostico[7].equals("x")  && golesEquipo1 == golesEquipo2) {
                    puntos++;
                } else if (listaStringPronostico[8].equals("x")  && golesEquipo1 < golesEquipo2) {
                    puntos++;
                }
            }
            if (listaStringPronostico[11].equals("x") || listaStringPronostico[12].equals("x") || listaStringPronostico[13].equals("x")) {
                setGolesEquipo1(Integer.parseInt(listaStringResultados[19]));
                setGolesEquipo2(Integer.parseInt(listaStringResultados[20]));
                if (listaStringPronostico[11].equals("x") && golesEquipo1 > golesEquipo2) {
                    puntos++;
                } else if ( listaStringPronostico[12].equals("x")  && golesEquipo1 == golesEquipo2) {
                    puntos++;
                } else if (listaStringPronostico[13].equals("x")  && golesEquipo1 < golesEquipo2) {
                    puntos++;
                }
            }

        System.out.println("Mariana tiene = " + puntos + " puntos");
            }
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
    /*public String toString() {
        return "";
    }*/
    }
}
