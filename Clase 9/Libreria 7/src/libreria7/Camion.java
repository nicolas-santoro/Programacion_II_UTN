package libreria7;



public class Camion extends Vehiculo {
    protected float tara;

    public Camion(String patente, Byte cantidadRuedas, Marcas marca, float tara) {
        super(patente, cantidadRuedas, marca);
        
        this.tara = tara;
    }
    
    public String mostrarCamion() {
        StringBuilder datos = new StringBuilder();
        
        datos.append(super.mostrar());
        datos.append("Tara: ").append(this.tara).append("\n").append("\n");
        
        
        return datos.toString();
    }
}