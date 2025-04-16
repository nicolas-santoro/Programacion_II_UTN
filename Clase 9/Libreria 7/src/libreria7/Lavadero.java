package libreria7;



import java.util.ArrayList;


public class Lavadero {
    private ArrayList<Vehiculo> vehiculos;
    private float precioAuto;
    private float precioCamion;
    private float precioMoto;

    private Lavadero() {
        this.vehiculos = new ArrayList<>();
    }

    public Lavadero(float precioAuto, float precioCamion, float precioMoto) {
        this();
        this.precioAuto = precioAuto;
        this.precioCamion = precioCamion;
        this.precioMoto = precioMoto;
    }

    public String getDetalle() {
        StringBuilder sb = new StringBuilder();

        sb.append("Vehiculos:\n");
        for (Vehiculo vehiculo : this.vehiculos) {
            if (vehiculo instanceof Auto auto) {
                sb.append(auto.mostrarAuto());
            } 
            
            else if (vehiculo instanceof Camion camion) {
                sb.append(camion.mostrarCamion());
            } 
            
            else if (vehiculo instanceof Moto moto) {
                sb.append(moto.mostrarMoto());
            } 
            
            else {
                sb.append(vehiculo.mostrar());
            }
        }

        sb.append("Precios:\n");
        sb.append("Precio de los autos: ").append(precioAuto).append("\n");
        sb.append("Precio de los camiones: ").append(precioCamion).append("\n");
        sb.append("Precio de las motos: ").append(precioMoto).append("\n");

        
        return sb.toString();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }

    public double mostrarTotalFacturado() {
        int autos = 0;
        int camiones = 0;
        int motos = 0;

        // Contar el número de vehículos por tipo
        for (Vehiculo vehiculo : this.vehiculos) {
            if (vehiculo instanceof Auto) {
                autos++;
            } 

            else if (vehiculo instanceof Camion) {
                camiones++;
            } 

            else if (vehiculo instanceof Moto) {
                motos++;
            }
        }

        // Calcular el total facturado
        return (autos * this.precioAuto) + (camiones * this.precioCamion) + (motos * this.precioMoto);
    }

    public double mostrarTotalFacturado(Vehiculos tipoVehiculo) {
        int contador = 0;

        // Contar el número de vehículos por tipo según la enumeración pasada
        for (Vehiculo vehiculo : this.vehiculos) {
            switch (tipoVehiculo) {
                case AUTO:
                    if (vehiculo instanceof Auto) {
                        contador++;
                    }
                    
                    break;
                    
                case CAMION:
                    if (vehiculo instanceof Camion) {
                        contador++;
                    }
                    
                    break;
                    
                case MOTO:
                    if (vehiculo instanceof Moto) {
                        contador++;
                    }
                    
                    break;
            }
        }

        // Calcular la ganancia según el tipo de vehículo
        switch (tipoVehiculo) {
            case AUTO:
                return contador * this.precioAuto;
                
            case CAMION:
                return contador * this.precioCamion;
                
            case MOTO:
                return contador * this.precioMoto;
                
            default:
                return 0; // En caso de que no coincida con los tipos
        }
    }

    public boolean sonIguales(Lavadero lavadero, Vehiculo vehiculo) {
        for (Vehiculo vehiculoI : lavadero.vehiculos) {
            if (Vehiculo.sonIguales(vehiculoI, vehiculo)) {
                return true;  // Retorna true si encuentra un vehículo igual
            }
        }
        
        
        return false;  // Retorna false si no lo encuentra
    }

    public boolean agregar(Vehiculo vehiculo) {
        boolean respuesta = false;
    
        if (!this.sonIguales(this, vehiculo)) {  // Agregar si NO está en la lista
            this.vehiculos.add(vehiculo);
            
            respuesta = true;
        }

        
        return respuesta;
    }

    public boolean remover(Vehiculo vehiculo) {
        boolean respuesta = false;
    
        if (this.sonIguales(this, vehiculo)) {  // Remover solo si está en la lista
            this.vehiculos.remove(vehiculo);
            
            respuesta = true;
        }

        
        return respuesta;
    }
}