package co.edu.uniquindio.programacion2.seguimiento2.model;

public class Bibliotecario extends Empleado implements GestionarDVD, GestionarRevista, GetionarLibro{
    public Bibliotecario(String nameEmploye, String idEmploye) {
        super(nameEmploye, idEmploye);
    }
    public void gestionarPrestamo(){

    }

    @Override
    public int DVDs() {
        return 0;
    }

    @Override
    public int magazines() {
        return 0;
    }

    @Override
    public int books() {
        return 0;
    }
}
