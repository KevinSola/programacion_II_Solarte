package co.edu.uniquindio.programacion2.seguimiento2;

import co.edu.uniquindio.programacion2.seguimiento2.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        libreria();
    }

    public static void libreria(){
        List <Miembro> miembros = new ArrayList<>();
        List <Libro> libros = new ArrayList<>();
        List <Prestamo> prestamos = new ArrayList<>();
        Bibliotecario bibliotecario = new Bibliotecario("Jaimito", "45674821");
        libros.add(new Libro());
        libros.get(0).setAutor("Julio Verne");
        libros.get(0).setIsbn("3456");
        libros.get(0).setTitle("De la tierra a la luna");
        libros.get(0).setState(false);
        libros.add(new Libro());
        libros.get(1).setAutor("Julio Verne");
        libros.get(1).setIsbn("8713");
        libros.get(1).setTitle("La isla misteriosa");
        libros.get(1).setState(true);
        libros.add(new Libro());
        libros.get(2).setAutor("Ken Liu");
        libros.get(2).setIsbn("7126");
        libros.get(2).setTitle("La gracia de los reyes");
        libros.get(2).setState(true);
        miembros.add(new Miembro("juan", "123450"));
        miembros.add(new Miembro("salomon", "123491"));
        prestamos.add(new Prestamo("01/03/2018", "06/03/2018"));
        prestamos.add(new Prestamo("13/05/2018", "19/05/2018"));
        prestamos.add(new Prestamo("30/11/2018", "10/12/2018"));
        miembros.get(0).setPrestamos(prestamos.get(0));
        miembros.get(1).setPrestamos(prestamos.get(1));
        miembros.get(1).setPrestamos(prestamos.get(2));
        System.out.println(miembros.get(1).getPrestamos(0).toString());

    }
}
