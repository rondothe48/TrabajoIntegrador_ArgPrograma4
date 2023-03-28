import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Partido {
    //private String equipo1;
    //private String equipo2;
    static String equipo1;
    static String equipo2;
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

    /*public static void partidos(int id, String nombre){
        Partido partido1 = new Partido();
        partido1.setGolesEquipo1(2);
        partido1.setGolesEquipo2(0);
    }*/

    public Partido(String equipo1, String equipo2) throws IOException {
        Partido.equipo1 = equipo1;
        Partido.equipo2 = equipo2;
        Path archivoResultados = Paths.get("E:/AAA GitHub/TrabajoIntegrador/Trabajo Integrador/src/resultados.csv");
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
            } else if ( golesEquipo1 < golesEquipo2) {

                System.out.println(equipo2 + " " + ResultadoEnum.GANADOR + "\n" + equipo1 + " " + ResultadoEnum.PERDEDOR);
            } else {

                System.out.println(equipo1 + " " + ResultadoEnum.EMPATE + " " + equipo2);
            };
        }

        //  BUSCAR SOLUCION A LA REPETICION DE CÓDIGO

        /*if (equipo1.equals(listaStringResultados[17])) {
            equipo1 = String.valueOf(Equipo.POLONIA);
            equipo2 = String.valueOf(Equipo.MEXICO);
            System.out.println("Las selecciones a jugar son= " + equipo1 + " y " + equipo2);
            setGolesEquipo1(Integer.parseInt(listaStringResultados[19]));
            setGolesEquipo2(Integer.parseInt(listaStringResultados[20]));
            if (golesEquipo1 > golesEquipo2) {

                System.out.println(equipo1 + " " + ResultadoEnum.GANADOR + "\n" + equipo2 + " " + ResultadoEnum.PERDEDOR);
            } else if ( golesEquipo1 < golesEquipo2) {

            System.out.println(equipo2 + " " + ResultadoEnum.GANADOR + "\n" + equipo1 + " " + ResultadoEnum.PERDEDOR);
            } else {

            System.out.println(equipo1 + " " + ResultadoEnum.EMPATE + " " + equipo2);
            }
        }*/
        /*this.equipo1=equipo1;
        this.equipo2=equipo2;
        setGolesEquipo1(1);
        setGolesEquipo2(2);
        if (golesEquipo1 < golesEquipo2) {
            System.out.println(equipo1 + "\n" + resultadoEnum[2]);
            System.out.println(equipo2 + "\n" + resultadoEnum[0]);
        } else if (golesEquipo1 > golesEquipo2) {
            System.out.println(equipo1 + "\n" + resultadoEnum[0]);
            System.out.println(equipo2 + "\n" + resultadoEnum[2]);
        } else {
            System.out.println(equipo1 + " - " + resultadoEnum[1] + " - " + equipo2);
        }*/
    }
    /*public static void resultado(Equipo equipo) {
        ResultadoEnum resultado = ResultadoEnum.GANADOR;
        System.out.println(equipo);
        System.out.println(resultado);
    }*/
}
