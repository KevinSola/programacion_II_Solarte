package co.edu.uniquindio.programacion2.principiosSolid.DIP;

public class Salmon extends Animal implements IEat, IMove{

    public Salmon(String typeAnimal) {
        super(typeAnimal);
    }

    @Override
    public String food() {
        return "Yo como crustaceos, ";
    }

    @Override
    public String motion() {
        return "yo me muevo nadando.";
    }

    public String toString(){
        return "Yo soy un animal: " + getTypeAnimal() +
                "\n" + food() + motion();
    }
}
