package co.edu.uniquindio.programacion2;

public class VehiculoPasajero extends Vehiculo{
    private int numPasajeros;
    public VehiculoPasajero(String placa, String modelo, String marca, String color, int numPasajeros){
        super(placa, modelo, marca, color);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros(){
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cantidadPasajeros=" + numPasajeros;
    }
}
