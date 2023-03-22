public class Partido {

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

    public static void partidos(){
        Partido partido1 = new Partido();
        partido1.setGolesEquipo1(2);
        partido1.setGolesEquipo2(0);
    }

    public static void equipos() {
        Equipo argentina = new Equipo();
        argentina.setNombre("Argentina");
        argentina.setDescripcion("Seleccionado");
        argentina.setId(1);
        System.out.println("El equipo ID=" + argentina.getId() + " es el " + argentina.getDescripcion() + " de " + argentina.getNombre());

        Equipo arabia = new Equipo();
        arabia.setNombre("Arabia Saudita");
        arabia.setDescripcion("Seleccionado");
        arabia.setId(2);
        System.out.println("El equipo ID=" + arabia.getId() + " es el " + arabia.getDescripcion() + " de " + arabia.getNombre());

        Equipo polonia = new Equipo();
        polonia.setNombre("Polonia");
        polonia.setDescripcion("Seleccionado");
        polonia.setId(3);
        System.out.println("El equipo ID=" + polonia.getId() + " es el " + polonia.getDescripcion() + " de " + polonia.getNombre());

        Equipo mexico = new Equipo();
        mexico.setNombre("México");
        mexico.setDescripcion("Seleccionado");
        mexico.setId(4);
        System.out.println("El equipo ID=" + mexico.getId() + " es el " + mexico.getDescripcion() + " de " + mexico.getNombre());


}

}