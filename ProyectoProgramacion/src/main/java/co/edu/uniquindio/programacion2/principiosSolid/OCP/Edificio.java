package co.edu.uniquindio.programacion2.principiosSolid.OCP;

public class Edificio extends Residency implements Floors{
    private String numFloors;
    public Edificio(String direccion, String useResidence, String numFloors) {
        super(direccion, useResidence);
        this.numFloors = numFloors;
    }

    @Override
    public String numFloor(String numFloors) {
        numFloors = this.numFloors;
        return numFloors;
    }

    public String toString(){
        return "La direccion es: " + getDireccion() +
                "\nEl edificio se usara como: " + getUseResidence() +
                "\nEl numero de pisos en el edificio es: " + numFloor(numFloors);
    }
}
