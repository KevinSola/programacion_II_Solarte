package co.edu.uniquindio.programacion2.principiosSolid;

import co.edu.uniquindio.programacion2.principiosSolid.LSPyISP.Heroe;
import co.edu.uniquindio.programacion2.principiosSolid.LSPyISP.SpiderMan;
import co.edu.uniquindio.programacion2.principiosSolid.LSPyISP.SuperMan;
import co.edu.uniquindio.programacion2.principiosSolid.OCP.Edificio;
import co.edu.uniquindio.programacion2.principiosSolid.OCP.House;
import co.edu.uniquindio.programacion2.principiosSolid.SRP.EncryptPassword;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        newUser();
//        newResidency();
        newSuperHeroes();

    }

    public static void newSuperHeroes(){
        List <Heroe> heroes = new ArrayList<>();
        heroes.add(new SuperMan("Azul"));
        heroes.add(new SpiderMan("Rojo y azul"));

        for (Heroe heroe : heroes){
            System.out.println(heroe.toString());
        }
    }

    public static void newResidency(){
        House casa1 = new House("Armenia/Quindio", "Vivienda", 4);
        House casa2 = new House("Circasia/Quindio", "Tienda", 2);
        Edificio edificio1 = new Edificio("Armenia/Quindio", "Empresa", "8");
        System.out.println(casa1.toString());
        System.out.println(casa2.toString());
        System.out.println(edificio1.toString());

    }

    public static void newUser(){
        EncryptPassword user = new EncryptPassword("kevin", "12345");
        System.out.println("El usuario es: " + user.getUser()
                + " y la contraseña es: " + user.encrypt());
    }
}
