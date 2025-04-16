package libreria7;



public class Vehiculo {
    protected String patente;
    protected Byte cantidadRuedas;
    protected Marcas marca;

    public Vehiculo(String patente, Byte cantidadRuedas, Marcas marca) {
        this.patente = patente;
        this.cantidadRuedas = cantidadRuedas;
        this.marca = marca;
    }
    
    public String getPatente() {
        return this.patente;
    }

    public Marcas getMarca() {
        return this.marca;
    }

    protected String mostrar() {
        StringBuilder datos = new StringBuilder();
        
        datos.append("Patente: ").append(this.patente).append("\n");
        datos.append("Cantidad de ruedas: ").append(this.cantidadRuedas).append("\n");
        datos.append("Marca: ").append(this.marca).append("\n");
        
        
        return datos.toString();
    }

    public static boolean sonIguales(Vehiculo vehiculo1, Vehiculo vehiculo2) {
        return vehiculo1.patente.equals(vehiculo2.patente) && vehiculo1.marca.equals(vehiculo2.marca);
    }
}