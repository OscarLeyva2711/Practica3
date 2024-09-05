
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    // Constructor que inicializa la lista de libros como una lista vacía
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
 
    // Método para mostrar la información de todos los libros en la biblioteca
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInformacion();
                System.out.println();  // Separador entre libros
            }
        }
    }

    // Método para buscar un libro por su título
    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.mostrarInformacion();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro con el título '" + titulo + "' no se encontró en la biblioteca.");
        }
    }
}