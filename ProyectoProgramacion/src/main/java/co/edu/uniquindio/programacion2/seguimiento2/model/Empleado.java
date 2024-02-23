package co.edu.uniquindio.programacion2.seguimiento2.model;

public abstract class Empleado {
    private String nameEmploye;
    private String idEmploye;

    public Empleado (String nameEmploye, String idEmploye){
        this.nameEmploye = nameEmploye;
        this.idEmploye = idEmploye;
    }

    public String getNameEmploye() {
        return nameEmploye;
    }

    public void setNameEmploye(String nameEmploye) {
        this.nameEmploye = nameEmploye;
    }

    public String getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(String idEmploye) {
        this.idEmploye = idEmploye;
    }
}
