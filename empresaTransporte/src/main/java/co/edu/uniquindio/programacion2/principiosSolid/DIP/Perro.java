package co.edu.uniquindio.programacion2.principiosSolid.DIP;

public class Perro extends Animal implements IEat, IMove{

    public Perro(String typeAnimal) {
        super(typeAnimal);
    }

    @Override
    public String food() {
        return "Yo como cuido, ";
    }

    @Override
    public String motion() {
        return "Yo me muevo caminando.";
    }

    public String toString(){
        return "Yo soy un animal: " + getTypeAnimal() +
                "\n" + food() + motion();
    }
}
