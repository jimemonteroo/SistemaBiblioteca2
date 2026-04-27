import model.Biblioteca;
import controller.BibliotecaController;
import view.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        BibliotecaController controller = new BibliotecaController(biblioteca);
        BibliotecaView view = new BibliotecaView(controller);
        view.mostrarMenu();
    }
}
