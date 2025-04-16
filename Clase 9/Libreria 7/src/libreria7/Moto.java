package libreria7;



public class Moto extends Vehiculo {
    protected float cilindrada;

    public Moto(String patente, Byte cantidadRuedas, Marcas marca, float cilindrada) {
        super(patente, cantidadRuedas, marca);
        
        this.cilindrada = cilindrada;
    }

    public String mostrarMoto() {
        StringBuilder datos = new StringBuilder();
        
        datos.append(super.mostrar());
        datos.append("Cilindrada: ").append(this.cilindrada).append("\n").append("\n");
        
        
        return datos.toString();
    }
}