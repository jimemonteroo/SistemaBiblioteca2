package dao;

import model.Libro;
import java.io.*;
import java.util.*;

public class LibroDAO {
    private static final String FILE_NAME = "libros.txt";

    public void guardarLibro(Libro libro) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.isDisponible());
            bw.newLine();
        }
    }

    public List<String> cargarLibros() throws IOException {
        List<String> libros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                libros.add(linea);
            }
        }
        return libros;
    }
}
