
import java.time.LocalDate;
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

  
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.añoPublicacion = 0;
        this.isbn = "";
    }

    
    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("ISBN: " + isbn);
    }

    public boolean esAntiguo() {
        int añoActual = LocalDate.now().getYear();
        return (añoActual - añoPublicacion) > 20;
    }

  
}

