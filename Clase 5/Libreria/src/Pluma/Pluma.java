package Pluma;



import Tinta.Tinta;


public class Pluma {
    private String marca;
    private Tinta tinta;
    private int cantidad;

    public Pluma() {
        this.marca = "Sin marca";
        this.tinta = null;
        this.cantidad = 1;
    }
    public Pluma(Tinta tinta) {
        this.tinta = tinta;
    }
    public Pluma(String marca, Tinta tinta) {
        this(tinta);
        this.marca = marca;
    }
    public Pluma(String marca, Tinta tinta, int cantidad) {
        this(marca, tinta);
        this.cantidad = cantidad;
    }
    
    public String mostrar(){
        StringBuilder datos = new StringBuilder();
        
        datos.append("Marca de la pluma: ").append(marca).append(". ");
        datos.append("Cantidad disponible de la pluma: ").append(cantidad).append(". ");
        datos.append(Tinta.mostrar(tinta));
        
        return datos.toString();
    }
    
    public static boolean sonIguales(Pluma pluma, Tinta tinta){
        return Tinta.sonIguales(pluma.tinta, tinta);
    }
    
    public static boolean sonDistintos(Pluma pluma, Tinta tinta){
        return !(Pluma.sonIguales(pluma, tinta));
    }
    
    public static Pluma add(Pluma pluma, Tinta tinta){
        if (Pluma.sonIguales(pluma, tinta)){
            pluma.cantidad += 1;
        }
        
        return pluma;
    }
    
    public static Pluma remove(Pluma pluma, Tinta tinta){
        if (Pluma.sonIguales(pluma, tinta)){
            pluma.cantidad -= 1;
        }
        
        return pluma;
    }
}