package co.edu.uniquindio.programacion2.seguimiento2.model;

import java.util.ArrayList;
import java.util.List;

public class Miembro {
    private String nameMember;
    private String idMember;
    private List<Prestamo> prestamos = new ArrayList<>();

    public Miembro(String nameMember, String idMember) {
        this.nameMember = nameMember;
        this.idMember = idMember;
        this.prestamos = prestamos;
    }

    public Miembro() {
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo add) {
        this.prestamos.add(add);
    }

}
