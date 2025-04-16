package ejemplos;

/**
 *
 * @author maxin
 * @param <T>
 */
public class ClaseSimple<T> {
    
    private T miAtributo;

    public ClaseSimple()
    {
        this.miAtributo = null;
    }

    public ClaseSimple(T parametro) 
    {
        this.miAtributo = parametro;
    }
    
    @Override
    public String toString(){
        return this.miAtributo.toString();
    }
    
}
