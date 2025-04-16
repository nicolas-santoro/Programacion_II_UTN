package Tinta;



import Enumerados.*;


public class Tinta {
    private Color color;
    private Tipo tipo;
    
    public Tinta() {
        this.color = Color.Verde;
        this.tipo = Tipo.China;
    }

    public Tinta(Color color) {
        this();
        this.color = color;
    }

    public Tinta(Color color, Tipo tipo) {
        this(color);
        this.tipo = tipo;
    }
    
    private String mostrar(){
        StringBuilder datos = new StringBuilder();
        
        datos.append("Color de la tinta: ").append(color).append(". ");
        datos.append("Tipo de tinta: ").append(tipo);
        
        String resultadoFinal = datos.toString();
        
        return resultadoFinal;
    }
    
    public static String mostrar(Tinta tinta){
        return tinta.mostrar();
    }
    
    public static boolean sonIguales(Tinta tinta1, Tinta tinta2){
        return tinta1.color.equals(tinta2.color) && tinta1.tipo.equals(tinta2.tipo);
    }
    
    public static boolean sonDistintos(Tinta tinta1, Tinta tinta2){
        return !(Tinta.sonIguales(tinta1, tinta2));
    }
}