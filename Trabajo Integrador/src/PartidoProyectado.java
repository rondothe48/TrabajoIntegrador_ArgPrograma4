import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PartidoProyectado {
    static String equipo1p;
    static String equipo2p;
    private int golesEquipo1;
    private int golesEquipo2;
    //static String[]resultadoEnum = {"GANADOR", "EMPATE", "PERDEDOR"};

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

    public PartidoProyectado(String equipo1, String equipo2) throws IOException {
        PartidoProyectado.equipo1p = equipo1;
        PartidoProyectado.equipo2p = equipo2;
        Path archivoResultados = Paths.get("C:\\Users\\Rondo48\\Documents\\GitHub\\TrabajoIntegrador\\Trabajo Integrador\\src\\pronostico2.csv");
        Files.readAllLines(archivoResultados);
        String archivoStringResultados = Files.readString(archivoResultados);
        String[] listaStringResultados = archivoStringResultados.split(",");

        if (equipo1.equals(listaStringResultados[9]) || equipo1.equals(listaStringResultados[17])) {
            if (equipo1.equals(listaStringResultados[9])) {
                equipo1 = String.valueOf(Equipo.ARGENTINA);
                equipo2 = String.valueOf(Equipo.ARABIA_SAUDITA);
                System.out.println("------------\n" + "Las selecciones a jugar son = " + equipo1 + " y " + equipo2);
                setGolesEquipo1(Integer.parseInt(listaStringResultados[11]));
                setGolesEquipo2(Integer.parseInt(listaStringResultados[12]));
            } else if (equipo1.equals(listaStringResultados[17])) {
                equipo1 = String.valueOf(Equipo.POLONIA);
                equipo2 = String.valueOf(Equipo.MEXICO);
                System.out.println("------------\n" + "Las selecciones a jugar son= " + equipo1 + " y " + equipo2);
                setGolesEquipo1(Integer.parseInt(listaStringResultados[19]));
                setGolesEquipo2(Integer.parseInt(listaStringResultados[20]));
            }
            if (golesEquipo1 > golesEquipo2) {

                System.out.println(equipo1 + " " + ResultadoEnum.GANADOR + "\n" + equipo2 + " " + ResultadoEnum.PERDEDOR);
            } else if (golesEquipo1 < golesEquipo2) {

                System.out.println(equipo2 + " " + ResultadoEnum.GANADOR + "\n" + equipo1 + " " + ResultadoEnum.PERDEDOR);
            } else {

                System.out.println(equipo1 + " " + ResultadoEnum.EMPATE + " " + equipo2);
            }

        }
    }
}
