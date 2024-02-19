package co.edu.uniquindio.programacion2.principiosSolid.LSPyISP;

public class SuperMan extends Heroe implements IFly, IHaveStrength{


    public SuperMan(String colorTraje) {
        super(colorTraje);
    }

    @Override
    public String fly() {
        return "yo puedo volar, ";
    }

    @Override
    public String strength() {
    return "yo tengo super fuerza";
    }

    public String toString(){
        return "Soy super-man y el color del traje es: " + getColorTraje() +
                "\n poderes:\n" + fly() + strength();
    }
}
