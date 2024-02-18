package co.edu.uniquindio.programacion2.principiosSolid.OCP;

public class House extends Residency{
    private int numPeople;


    public House(String direccion, String useResidence, int numPeople) {
        super(direccion, useResidence);
        this.numPeople = numPeople;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public String toString(){
        return "La direccion es: " + getDireccion() +
                "\nLa residencia se usara como: " + getUseResidence() +
                "\nEl numero de personas en la residencia es: " + numPeople;
    }
}
