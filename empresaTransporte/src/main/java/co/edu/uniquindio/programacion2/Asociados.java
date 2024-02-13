package co.edu.uniquindio.programacion2;

public class Asociados {
    private String nombre;
    private String id;
    private String email;
    private String celular;
    private String vehiculo;

    public Asociados(String nombre, String id, String email, String celular, String vehiculo){
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.celular = celular;
        this.vehiculo = vehiculo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Asociado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", vehiculo='" + vehiculo + '\''+
                '}';
    }
}