package model;

public interface Prestable {
    void prestar() throws LibroNoDisponibleException;
    void devolver();
    boolean isDisponible();
}

