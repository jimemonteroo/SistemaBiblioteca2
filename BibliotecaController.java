package controller;

import model.*;
import dao.LibroDAO;
import java.io.IOException;

public class BibliotecaController {
    private Biblioteca biblioteca;
    private LibroDAO libroDAO;

    public BibliotecaController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.libroDAO = new LibroDAO();
    }

    public void registrarLibro(String titulo, String autor) throws IOException {
        Libro libro = new Libro(titulo, autor);
        biblioteca.agregarLibro(libro);
        libroDAO.guardarLibro(libro);
    }

    public void registrarUsuario(String nombre, int id) {
        Usuario usuario = new Usuario(nombre, id);
        biblioteca.registrarUsuario(usuario);
    }

    public void realizarPrestamo(Libro libro, Usuario usuario) {
        Prestamo prestamo = new Prestamo(libro, usuario);
        prestamo.registrarPrestamo();
    }
}
