package actividad2;



import Tinta.Tinta;
import Pluma.Pluma;
import Enumerados.*;


public class Actividad2 {
    public static void main(String[] args) {
        // Crear instancias de Tinta
        Tinta tinta1 = new Tinta();
        Tinta tinta2 = new Tinta(Color.Verde, Tipo.China);
        Tinta tinta3 = new Tinta(Color.Rojo, Tipo.Conbrillito);
        
        // Mostrar detalles de la tinta
        System.out.println("Detalles de la primer tinta: " + Tinta.mostrar(tinta1));
        System.out.println("");
        System.out.println("Detalles de la segunda tinta: " + Tinta.mostrar(tinta2));
        System.out.println("");
        System.out.println("Detalles de la tercer tinta: " + Tinta.mostrar(tinta3));
        System.out.println("");
        
        // Verificar si las tintas son iguales o distintas
        System.out.println("La primer y segunda tinta, son iguales? " + Tinta.sonIguales(tinta1, tinta2));
        System.out.println("");
        System.out.println("La primer y tercer tinta, son iguales? " + Tinta.sonIguales(tinta1, tinta3));
        System.out.println("");
        
        // Crear instancias de Pluma
        Pluma pluma1 = new Pluma("Parker", tinta1, 5);
        Pluma pluma2 = new Pluma("Montblanc", tinta2, 10);
        Pluma pluma3 = new Pluma("Parker", tinta3, 2);
        
        // Mostrar detalles de las plumas
        System.out.println("Detalles de la primer pluma: " + pluma1.mostrar());
        System.out.println("");
        System.out.println("Detalles de la segunda pluma: " + pluma2.mostrar());
        System.out.println("");
        System.out.println("Detalles de la tercer pluma: " + pluma3.mostrar());
        System.out.println("");
        
        // Probar métodos add y remove
        System.out.println("Aniadiendo la primer tinta a la primer pluma:");
        Pluma.add(pluma1, tinta1);
        System.out.println("");
        System.out.println("Detalles actualizados de la primer pluma: " + pluma1.mostrar());
        System.out.println("");
        
        System.out.println("Eliminando la primer tinta de la primer pluma:");
        Pluma.remove(pluma1, tinta1);
        System.out.println("");
        System.out.println("Detalles actualizados de la primer pluma: " + pluma1.mostrar());
        System.out.println("");
        
        System.out.println("Eliminando la primer tinta de la segunda tinta (debe permanecer igual):");
        Pluma.remove(pluma2, tinta1);
        System.out.println("");
        System.out.println("Detalles actualizados de la segunda tinta: " + pluma2.mostrar());
    }
}