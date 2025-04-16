package generics;

/**
 *
 * @author maxin
 */
public class Persona implements Comparable<Persona> {
    
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }

    @Override
    public String toString() {
        return this.nombre + " (" + this.edad + ")";
    }   
}
