public class Main {
    public static void main(String[] args) {
        // Crear objetos Autor
        Autor autor1 = new Autor(1, "Gabriel García Márquez", "gabriel@gmail.com");
        Autor autor2 = new Autor(2, "Miguel de Cervantes", "miguel@gmail.com");
        Autor autor3 = new Autor(3, "George Orwell", "george@gmail.com");

        // Crear objetos Libro
        Libro libro1 = new Libro("Cien años de soledad", autor1, 1967, "978-0-06-088328-7", false);
        Libro libro2 = new Libro("El Quijote", autor2, 1605, "978-0-19-953807-5",false);
        Libro libro3 = new Libro("1984", autor3, 1949, "978-0-452-28423-4",true);

        // Marcar algunos libros como prestados
        //libro1.setPrestado(true);
        //libro3.setPrestado(true);

        // Crear objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar todos los libros en la biblioteca
        System.out.println("Todos los libros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.mostrarInformacion());
        }

        // Mostrar libros prestados
        System.out.println("\nLibros prestados:");
        for (Libro libro : biblioteca.librosPrestados()) {
            System.out.println(libro.mostrarInformacion());
        }

        // Mostrar libros no prestados
        System.out.println("\nLibros no prestados:");
        for (Libro libro : biblioteca.librosNoPrestados()) {
            System.out.println(libro.mostrarInformacion());
        }

        // Buscar un libro por su título
        System.out.println("\nBuscando '1984':");
        Libro buscado = biblioteca.buscarLibroPorTitulo("1984");
        if (buscado != null) {
            System.out.println(buscado.mostrarInformacion());
        } else {
            System.out.println("El libro no se encontró en la biblioteca.");
        }
    }
}