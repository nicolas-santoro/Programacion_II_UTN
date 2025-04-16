package ejercicio7;



import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la fecha de nacimiento
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Anio: ");
        int anio = scanner.nextInt();
        
        // Validar la fecha ingresada
        if (!esFechaValida(dia, mes, anio)) {
            System.out.println("La fecha ingresada no es válida.");
            
            return;
        }
        
        // Crear un objeto LocalDate con la fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        // Obtener la fecha actual
        LocalDate hoy = LocalDate.now();
        
        // Calcular la diferencia en días
        long diasVividos = java.time.Duration.between(fechaNacimiento.atStartOfDay(), hoy.atStartOfDay()).toDays();
        
        // Mostrar el resultado
        System.out.println("Dias vividos desde la fecha de nacimiento hasta hoy: " + diasVividos);
    }

    // Método para verificar si una fecha es válida
    public static boolean esFechaValida(int dia, int mes, int anio) {
        try {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
            
            return true; // La fecha es válida
        }
        catch (Exception e) {
            return false; // La fecha no es válida
            }
        }
    }