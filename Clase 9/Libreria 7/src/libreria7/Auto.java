package libreria7;



public class Auto extends Vehiculo {
    protected int cantidadAsientos;

    public Auto(String patente, Byte cantidadRuedas, Marcas marca, int asientos) {
        super(patente, cantidadRuedas, marca);
        
        this.cantidadAsientos = asientos;
    }

    public String mostrarAuto() {
        StringBuilder datos = new StringBuilder();
        
        datos.append(super.mostrar());
        datos.append("Cantidad de asientos: ").append(this.cantidadAsientos).append("\n").append("\n");
        
        
        return datos.toString();
    }
}