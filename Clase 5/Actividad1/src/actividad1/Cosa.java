package actividad1;



import java.time.LocalDate;


public class Cosa {
    private int entero;
    private String cadena;
    private LocalDate fecha;
    
    public void establecerValor(int numero){
        this.entero = numero;
    }
    public void establecerValor(String texto){
        this.cadena = texto;
    }
    public void establecerValor(LocalDate fecha){
        this.fecha = fecha;
    }
    
    public String mostrar(){
        return entero + " - " + cadena + " - " + fecha;
    }
    public static String mostrar(Cosa algo){
        return algo.mostrar();
    }
}