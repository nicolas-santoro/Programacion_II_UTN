package ejemplos;

/**
 *
 * @author maxin
 * @param <T>
 * @param <U>
 * @param <X>
 */
public class ClaseConRestriccion<T extends X, U extends AlgunaInterface, X extends Clase> {
    
    private T miAtributoT;
    private U miAtributoU;
    private X miAtributoX;
    
    public ClaseConRestriccion() {
        
        this.miAtributoT = null; // ya que es de tipo referencia.
        this.miAtributoU = null;
        this.miAtributoX = null;
    }
    
    public ClaseConRestriccion(T paramT, U paramU, X paramX) {
              
        this.miAtributoT = paramT;
        this.miAtributoU = paramU;
        this.miAtributoX = paramX;
    }
    
    public void mostrar()
    {
        System.out.println(this.miAtributoT.toString());
        System.out.println(this.miAtributoU.toString());
        System.out.println(this.miAtributoX.toString());
    }

}
