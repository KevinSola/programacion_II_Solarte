package co.edu.uniquindio.programacion2.empresaTransporte.model;

public class VehiculoPasajero extends Vehiculo{
    private int numPasajeros;
    public VehiculoPasajero(String placa, String modelo, String marca, String color, int numPasajeros){
        super(placa, modelo, marca, color);
        this.numPasajeros = numPasajeros;
    }
    public VehiculoPasajero(){

    }

    public int getNumPasajeros(){
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String toString(){
        return "Placa: " + getPlaca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Color: " + getColor() + "\n" +
                "Numero de pasajeros: " + numPasajeros;
    }

}
