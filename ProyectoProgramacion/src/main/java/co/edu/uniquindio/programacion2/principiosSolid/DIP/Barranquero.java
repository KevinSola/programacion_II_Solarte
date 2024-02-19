package co.edu.uniquindio.programacion2.principiosSolid.DIP;

public class Barranquero extends Animal implements IMove, IEat{

    public Barranquero(String typeAnimal) {
        super(typeAnimal);
    }

    @Override
    public String food() {
        return "Yo como semillas e insectos, ";
    }

    @Override
    public String motion() {
        return "yo me muevo volando.";
    }

    public String toString(){
        return "Yo soy un animal: " + getTypeAnimal() +
                "\n" + food() + motion();
    }
}
