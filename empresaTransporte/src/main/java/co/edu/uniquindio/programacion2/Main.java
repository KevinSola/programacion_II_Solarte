package co.edu.uniquindio.programacion2;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        Vehiculo vehiculoCarga1 = new VehiculoCarga("HSC234", "Tractomula", "Isuzu", "rojo", 300000, 4);
        Asociados asociados1 = new Asociados("kedin johana", "1040200535", "johana123@gmail.com", "3015648790","vehiculo de carga");

        Vehiculo vehiculoPasajero1 = new VehiculoPasajero("HSC234", "twingo", "Nissan", "rojo", 4);
        Asociados asociados2 = new Asociados("francisco javier", "1056876112", "francisco321@gmail.com", "3024568989","vehiculo de pasajeros");

        System.out.println("Informacion del cliente " + n + ":");
        System.out.println(asociados1);
        System.out.println("\ninformacion del cliente " + (n+1) + ":");
        System.out.println(asociados2);


    }
}