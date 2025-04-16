package ejemplos;

import java.util.ArrayList;

/**
 *
 * @author maxin
 * @param <T>
 */
public class ClaseGenericaConColeccion<T> {
    
    private ArrayList<T> lista;
    private int capacidad;
    
    public ClaseGenericaConColeccion(int capacidad){
        
        this.lista = new ArrayList<>();
        this.capacidad = capacidad;
    }

    public ArrayList<T> getLista() {
        return this.lista;
    }
    
    public boolean agregar(T dato){
        
        boolean rta = false;
        
        if(this.lista.size() < this.capacidad){
            this.lista.add(dato);
            rta = true;
        }
        
        return rta;
    }
    
}
