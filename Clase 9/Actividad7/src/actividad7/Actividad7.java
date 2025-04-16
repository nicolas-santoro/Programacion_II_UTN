package actividad7;

import libreria7.*;

public class Actividad7 {
    public static void main(String[] args) {
        // Crear instancias de Vehículos
        Auto auto1 = new Auto("ABC123", (byte) 4, Marcas.FORD, 5);
        Auto auto2 = new Auto("DEF456", (byte) 4, Marcas.FIAT, 4);
        Camion camion1 = new Camion("GHI789", (byte) 6, Marcas.IVECO, 2000);
        Moto moto1 = new Moto("JKL012", (byte) 2, Marcas.ZANELLA, 150);

        // Crear el lavadero con precios por tipo de vehículo
        Lavadero lavadero = new Lavadero(500.0f, 1500.0f, 200.0f);

        // Agregar vehículos al lavadero
        lavadero.agregar(auto1);
        lavadero.agregar(auto2);
        lavadero.agregar(camion1);
        lavadero.agregar(moto1);

        // Mostrar detalles de los vehículos en el lavadero
        System.out.println(lavadero.getDetalle());

        // Mostrar total facturado por todos los vehículos
        System.out.println("Total facturado por todos los vehiculos: " + lavadero.mostrarTotalFacturado());

        // Mostrar facturado por tipo de vehículo usando la enumeración Vehiculos
        System.out.println("Total facturado por autos: " + lavadero.mostrarTotalFacturado(Vehiculos.AUTO));
        System.out.println("Total facturado por camiones: " + lavadero.mostrarTotalFacturado(Vehiculos.CAMION));
        System.out.println("Total facturado por motos: " + lavadero.mostrarTotalFacturado(Vehiculos.MOTO));

        // Eliminar un vehículo y mostrar el detalle actualizado
        lavadero.remover(auto1);
        System.out.println("Detalle despues de remover un auto:");
        System.out.println(lavadero.getDetalle());
    }
}