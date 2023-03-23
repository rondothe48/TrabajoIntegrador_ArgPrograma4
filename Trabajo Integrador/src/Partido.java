public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    static String[]resultadoEnum = {"GANADOR", "EMPATE", "PERDEDOR"};

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

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1=equipo1;
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
        }
    }
    /*public static void resultado(Equipo equipo) {
        ResultadoEnum resultado = ResultadoEnum.GANADOR;
        System.out.println(equipo);
        System.out.println(resultado);
    }*/
}
