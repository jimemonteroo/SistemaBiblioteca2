package model;

public class Libro implements Prestable {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    @Override
    public void prestar() throws LibroNoDisponibleException {
        if (!disponible) {
            throw new LibroNoDisponibleException("El libro '" + titulo + "' no está disponible.");
        }
        disponible = false;
    }

    @Override
    public void devolver() {
        disponible = true;
    }

    @Override
    public boolean isDisponible() {
        return disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
