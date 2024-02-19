package co.edu.uniquindio.programacion2.principiosSolid.LSPyISP;

public class SpiderMan extends Heroe implements IClimb, IHaveStrength{

    public SpiderMan(String colorTraje) {
        super(colorTraje);
    }

    @Override
    public String climb() {
        return "Yo puedo trepar paredes, ";
    }

    @Override
    public String strength() {
        return "yo tengo super fuerza";
    }

    public String toString(){
        return "Soy SpiderMan y el color del traje es: " + getColorTraje() +
                "\n poderes:\n" + climb() + strength();
    }
}
