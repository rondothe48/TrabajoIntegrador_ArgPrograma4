public class Main {
    public static void main(String[] args) {
        

        equipos();

    }

    public static void equipos() {
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Argentina");
        equipo1.setDescripcion("Seleccionado");
        equipo1.setId(1);
        System.out.println("El equipo ID=" + equipo1.getId() + " es el "+ equipo1.getDescripcion() + " de " + equipo1.getNombre());

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Arabia Saudita");
        equipo2.setDescripcion("Seleccionado");
        equipo2.setId(2);
        System.out.println("El equipo ID=" + equipo2.getId() + " es el "+ equipo2.getDescripcion() + " de " + equipo2.getNombre());

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("Polonia");
        equipo3.setDescripcion("Seleccionado");
        equipo3.setId(3);
        System.out.println("El equipo ID=" + equipo3.getId() + " es el "+ equipo3.getDescripcion() + " de " + equipo3.getNombre());

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("México");
        equipo4.setDescripcion("Seleccionado");
        equipo4.setId(4);
        System.out.println("El equipo ID=" + equipo4.getId() + " es el "+ equipo4.getDescripcion() + " de " + equipo4.getNombre());
    }

 /*    try {
        System.out.println(Files.readAllLines(Paths.get("E:/AAA GitHub/TrabajoIntegrador/Trabajo Integrador/src/pronostico.csv")));

    } catch(Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }*/
}
