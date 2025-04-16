package actividad1;



import java.time.LocalDate;


public class Actividad1 {
    public static void main(String[] args) {
        Cosa cosa1 = new Cosa();
        cosa1.establecerValor(42);
        cosa1.establecerValor("Hola mundo");
        cosa1.establecerValor(LocalDate.of(2006, 05, 15));

        // Llamar al método de instancia
        System.out.println(cosa1.mostrar());

        // Llamar al método de clase
        System.out.println(Cosa.mostrar(cosa1));
    }
}