package co.edu.uniquindio.programacion2.empresaTransporte;

import co.edu.uniquindio.programacion2.empresaTransporte.model.Asociados;
import co.edu.uniquindio.programacion2.empresaTransporte.model.VehiculoCarga;
import co.edu.uniquindio.programacion2.empresaTransporte.model.VehiculoPasajero;

public class Main {
    public static void main(String[] args) {
        creacionObjetos();
    }
     public static void creacionObjetos(){
         int n = 1;
         VehiculoCarga vehiculoCarga1 = new VehiculoCarga();
         vehiculoCarga1.setPlaca("WER345");
         vehiculoCarga1.setEjes(4);
         vehiculoCarga1.setCarga(200000);
         vehiculoCarga1.setColor("rojo");
         vehiculoCarga1.setMarca("nissan");
         vehiculoCarga1.setModelo("tractomula");

         Asociados asociados1 = new Asociados();
         asociados1.setNombre("kedin johana");
         asociados1.setId("1040200535");
         asociados1.setCelular("3015648790");
         asociados1.setVehiculo(vehiculoCarga1.toString());
         asociados1.setEmail("johana123@gmail.com");

         VehiculoPasajero vehiculoPasajero1 = new VehiculoPasajero();
         vehiculoPasajero1.setPlaca("HSC234");
         vehiculoPasajero1.setColor("rojo");
         vehiculoPasajero1.setMarca("nissan");
         vehiculoPasajero1.setModelo("twingo");
         vehiculoPasajero1.setNumPasajeros(4);

         Asociados asociados2 = new Asociados();
         asociados2.setNombre("francisco javier");
         asociados2.setId("1056876112");
         asociados2.setCelular("3024568989");
         asociados2.setVehiculo(vehiculoPasajero1.toString());
         asociados2.setEmail("javier4545@gmail.com");

         System.out.println("Informacion del cliente " + n + ":");
         System.out.println(asociados1);
         System.out.println("\ninformacion del cliente " + (n+1) + ":");
         System.out.println(asociados2);
     }
}