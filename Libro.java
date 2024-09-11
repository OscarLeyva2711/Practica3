
import java.time.LocalDate;
public class Libro {
    private String titulo;
    private Autor autor;
    private int añoPublicacion;
    private String isbn;
    private boolean esPrestado;

  
    

    
    public Libro(String titulo, Autor autor, int añoPublicacion, String isbn, boolean esPrestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        esPrestado=false;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean esAntiguo() {
        int añoActual = LocalDate.now().getYear();
        return (añoActual - añoPublicacion) > 20;
    }
    public boolean setPrestado(){
        this.esPrestado=esPrestado;
        return esPrestado;
    }
    public boolean getPrestado(){
        return esPrestado;
    }
    public String mostrarInformacion() {
       return titulo + autor+ String.valueOf(añoPublicacion) + isbn;
    }
  
}