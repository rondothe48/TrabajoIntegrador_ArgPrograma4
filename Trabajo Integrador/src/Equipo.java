public enum Equipo {
    ARGENTINA("Argentina"), ARABIA_SAUDITA("Arabia Saudita"),
    POLONIA("POLONIA"), MEXICO("MEXICO");

    private String nombre;
    //private int iD;

    private Equipo(String nombre) {
        this.nombre = nombre;
    }
}
