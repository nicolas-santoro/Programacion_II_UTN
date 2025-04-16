package ejemplos;

/**
 *
 * @author maxin
 */
public class ClaseConMetodosGenericos {
    
    public static <T> T metodoEstatico(T valor)
    {
        T unaVariable = valor;
        
        System.out.println(unaVariable.getClass() + " " + valor);
        
        return valor;
    }
    
    public static <U extends Clase> void metodoEstaticoDos(U valor)
    {
        System.out.println(valor);
    }
}
