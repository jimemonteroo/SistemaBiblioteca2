package model;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
    }

    public void registrarPrestamo() {
        try {
            libro.prestar();
            System.out.println("Préstamo realizado a " + usuario.getNombre());
        } catch (LibroNoDisponibleException e) {
            System.out.println(e.getMessage());
        }
    }

    public void devolverLibro() {
        libro.devolver();
        System.out.println("Libro devuelto por " + usuario.getNombre());
    }
}
