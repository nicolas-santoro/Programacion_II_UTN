package generics;

/**
 *
 * @author maxin
 * @param <T>
 */
public class Numerica<T extends Number> {
    
    private T param;
    
    public Numerica(T valor){
        this.param = valor;
    }

    @Override
    public String toString(){
        double cuadrado = Math.pow(this.param.doubleValue(), 2);
        return String.valueOf(cuadrado);
    }
}
