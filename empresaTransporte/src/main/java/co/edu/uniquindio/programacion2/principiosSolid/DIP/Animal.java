package co.edu.uniquindio.programacion2.principiosSolid.DIP;

public abstract class Animal {
    private String typeAnimal;

    public Animal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }
}
