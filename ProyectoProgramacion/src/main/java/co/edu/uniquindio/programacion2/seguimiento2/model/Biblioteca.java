package co.edu.uniquindio.programacion2.seguimiento2.model;

public abstract class Biblioteca {
    private String nameLibrary;

    public Biblioteca (String nameLibrary){
        this.nameLibrary = nameLibrary;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }
}
