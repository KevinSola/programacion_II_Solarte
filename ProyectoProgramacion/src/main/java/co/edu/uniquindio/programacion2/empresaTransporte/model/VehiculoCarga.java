package co.edu.uniquindio.programacion2.empresaTransporte.model;

public class VehiculoCarga extends Vehiculo {
    private int carga;
    private int ejes;

    public VehiculoCarga(String placa, String modelo, String marca, String color, int carga, int ejes){
        super (placa, modelo, marca,color);
        this.carga = carga;
        this.ejes = ejes;
    }

    public VehiculoCarga(){

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
        return "Placa: " + getPlaca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Color: " + getColor() + "\n" +
                "Carga: " + carga +
                "Cantidad de ejes: " + ejes;
    }

}
