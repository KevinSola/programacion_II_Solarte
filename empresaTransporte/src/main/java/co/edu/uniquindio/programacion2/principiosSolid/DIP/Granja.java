package co.edu.uniquindio.programacion2.principiosSolid.DIP;

import java.util.ArrayList;
import java.util.List;

public class Granja {
    private List<Animal> animals;
    public Granja (List <Animal> animals){
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
