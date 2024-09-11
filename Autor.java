
/**
 * Write a description of class Autor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Autor
{
    // instance variables - replace the example below with your own
    private int id;
    private String nombreAutor;
    private String correo;

    /**
     * Constructor for objects of class Autor
     */
    public Autor()
    {
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Autor(int id, String nombreAutor, String correo)
    {
        // put your code here
        this.id=id;
        this.nombreAutor= nombreAutor;
        this.correo= correo;
    }
    public String toString(){
        return String.valueOf(id) + nombreAutor + correo;
    }
}