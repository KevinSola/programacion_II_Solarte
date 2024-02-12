package co.edu.uniquindio.programacion2;

public class Vehiculo {
    private String placa;
    private String modelo;
    private int marca;
    private int color;

    public Vehiculo(){
    }

    public Vehiculo (String placa, String modelo, int marca, int color){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getMarca(){
        return marca;
    }

    public void setMarca(int marca){
        this.marca = marca;
    }

    public int getColor(){
        return color;
    }

    public void setColor(int color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
