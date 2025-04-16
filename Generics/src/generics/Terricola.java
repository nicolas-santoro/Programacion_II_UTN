package generics;

/**
 *
 * @author maxin
 * @param <T>
 */
public class Terricola <T extends Persona> {
    
    private T param;
    
    public Terricola(T valor){
        this.param = valor;
    }
    
    @Override
    public String toString(){
        return this.param.toString();
    }

}