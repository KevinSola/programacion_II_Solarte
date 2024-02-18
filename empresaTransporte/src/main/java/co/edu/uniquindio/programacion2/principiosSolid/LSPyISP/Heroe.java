package co.edu.uniquindio.programacion2.principiosSolid.LSPyISP;

public abstract class Heroe {
    private String colorTraje;

    public Heroe(String colorTraje) {
        this.colorTraje = colorTraje;
    }

    public String getColorTraje() {
        return colorTraje;
    }

    public void setColorTraje(String colorTraje) {
        this.colorTraje = colorTraje;
    }
}
