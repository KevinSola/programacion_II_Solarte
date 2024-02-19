package co.edu.uniquindio.programacion2.principiosSolid.OCP;

public abstract class Residency {
    private String direccion;
    private String useResidence;

    public Residency (String direccion, String useResidence){
        this.direccion = direccion;
        this.useResidence = useResidence;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUseResidence() {
        return useResidence;
    }

    public void setUseResidence(String useResidence) {
        this.useResidence = useResidence;
    }
}
