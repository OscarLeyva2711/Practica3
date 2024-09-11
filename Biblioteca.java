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

    // Método para obtener la lista de libros prestados
    public ArrayList<Libro> librosPrestados() {
        ArrayList<Libro> prestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getPrestado()) {
                prestados.add(libro);
            }
        }
        return prestados;
    }

    // Método para obtener la lista de libros no prestados
    public ArrayList<Libro> librosNoPrestados() {
        ArrayList<Libro> noPrestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.getPrestado()) {
                noPrestados.add(libro);
            }
        }
        return noPrestados;
    }

    // Método para buscar un libro por su título
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // Método para obtener todos los libros
    public ArrayList<Libro> getLibros() {
        return libros;
    }
}