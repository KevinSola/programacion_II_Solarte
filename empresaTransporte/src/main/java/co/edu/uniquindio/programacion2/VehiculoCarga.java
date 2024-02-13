package co.edu.uniquindio.programacion2;

public class VehiculoCarga extends Vehiculo {
    private int carga;
    private int ejes;

    public VehiculoCarga(String placa, String modelo, String marca, String color, int carga, int ejes){
        super (placa, modelo, marca,color);
        this.carga = carga;
        this.ejes = ejes;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public String toString(){
        return super.toString() +
                ", capacidadCarga=" + carga +
                ", numeroEjes=" + ejes;
    }

}
