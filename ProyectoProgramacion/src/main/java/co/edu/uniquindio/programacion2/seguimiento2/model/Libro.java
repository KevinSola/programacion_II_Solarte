package co.edu.uniquindio.programacion2.seguimiento2.model;

public class Libro {
    private String title;
    private String autor;
    private String isbn;
    private boolean state;

    public Libro(String title, String autor, String isbn, boolean state) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.state = state;
    }

    public Libro() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
