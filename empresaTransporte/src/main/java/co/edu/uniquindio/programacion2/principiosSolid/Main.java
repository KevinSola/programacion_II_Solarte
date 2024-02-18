package co.edu.uniquindio.programacion2.principiosSolid;

import co.edu.uniquindio.programacion2.principiosSolid.SRP.EncryptPassword;
import co.edu.uniquindio.programacion2.principiosSolid.SRP.SaveUser;

public class Main {
    public static void main(String[] args) {
        newUser();
    }

    public static void newUser(){
        EncryptPassword user = new EncryptPassword("kevin", "12345");
        System.out.println("El usuario es: " + user.getUser() + " y la contraseña es: " + user.encrypt());
    }
}
