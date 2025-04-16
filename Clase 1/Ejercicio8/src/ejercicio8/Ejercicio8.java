package ejercicio8;


import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes
        final double IMPORTE_ANTIGUEDAD = 51000;
        final double DESCUENTO_PORCENTAJE = 0.13;

        // Variables para el total general
        double totalBrutoGeneral = 0;
        double totalDescuentosGeneral = 0;
        double totalNetoGeneral = 0;

        // Bucle para la entrada de datos
        while (true) {
            // Leer datos del empleado
            System.out.print("Desea ingresar un nuevo empleado? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (respuesta.equals("n")) {
                // Si el usuario no quiere ingresar más empleados, salir del bucle
                break;
            }

            // Solicitar datos del empleado
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el valor hora del empleado: ");
            double valorHora = scanner.nextDouble();

            System.out.print("Ingrese la antiguedad (en anos) del empleado: ");
            int antiguedad = scanner.nextInt();

            System.out.print("Ingrese la cantidad de horas trabajadas en el mes del empleado: ");
            int horasTrabajadas = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            // Calcular el total a cobrar en bruto
            double totalBruto = (valorHora * horasTrabajadas) + (antiguedad * IMPORTE_ANTIGUEDAD);

            // Calcular los descuentos
            double totalDescuentos = totalBruto * DESCUENTO_PORCENTAJE;

            // Calcular el valor neto a cobrar
            double valorNeto = totalBruto - totalDescuentos;

            // Acumular los totales generales
            totalBrutoGeneral += totalBruto;
            totalDescuentosGeneral += totalDescuentos;
            totalNetoGeneral += valorNeto;

            // Mostrar recibo del empleado
            System.out.println("\nRecibo del empleado:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Antiguedad: " + antiguedad + " anios");
            System.out.println("Valor hora: $" + valorHora);
            System.out.println("Total a cobrar en bruto: $" + totalBruto);
            System.out.println("Total de descuentos: $" + totalDescuentos);
            System.out.println("Valor neto a cobrar: $" + valorNeto);
            System.out.println();
        }

        // Mostrar totales generales
        System.out.println("Totales Generales:");
        System.out.println("Total bruto de todos los empleados: $" + totalBrutoGeneral);
        System.out.println("Total de descuentos de todos los empleados: $" + totalDescuentosGeneral);
        System.out.println("Valor neto a cobrar de todos los empleados: $" + totalNetoGeneral);
    }
}