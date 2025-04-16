package ejemplos;

/**
 *
 * @author maxin
 * @param <T>
 * @param <U>
 */
public class ClaseMenosSimple<T, U> {
    
    private T miAtributo;
    private U miAtributo2;

    public T getMiAtributo() {
        return this.miAtributo;
    }

    public U getMiAtributo2() {
        return this.miAtributo2;
    }

    public void setMiAtributo(T miAtributo) {
        this.miAtributo = miAtributo;
    }

    public void setMiAtributo2(U miAtributo2) {
        this.miAtributo2 = miAtributo2;
    }
   
}
