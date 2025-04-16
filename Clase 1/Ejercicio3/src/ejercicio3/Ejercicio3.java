package ejercicio3;



import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Ingresa un numero mayor a 2: ");
        int limite = scanner.nextInt();

        // Verificar que el número sea mayor que 2
        if (limite < 2) {
            System.out.println("Debes ingresar un numero mayor o igual a 2.");
            
            return;  // Salir del programa si el número es menor que 2
        }

        System.out.println("Numeros primos hasta " + limite + ":");

        // Iterar sobre todos los números desde 2 hasta el límite ingresado
        for (int numero = 2; numero <= limite; numero++) {
            boolean esPrimo = true;

            // Verificar si el número actual es primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;  // Si tiene un divisor, no es primo
                    
                    break;
                }
            }

            // Si el número es primo, mostrarlo
            if (esPrimo) {
                System.out.println(numero);
            }
        }
    }
}