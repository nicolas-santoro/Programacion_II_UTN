package ejercicio1;



import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner
        
        int suma = 0;  // Variable para almacenar la suma de los números
        int maximo = Integer.MIN_VALUE;  // Inicializar el máximo al valor mínimo posible
        int minimo = Integer.MAX_VALUE;  // Inicializar el mínimo al valor máximo posible

        
        // Pedir 5 números al usuario
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa un numero: ");
            int numero = scanner.nextInt();  // Leer un número entero

            // Sumar el número a la variable escalar
            suma += numero;

            
            // Actualizar el valor máximo
            if (numero > maximo) {
                maximo = numero;
            }

            // Actualizar el valor mínimo
            if (numero < minimo) {
                minimo = numero;
            }
        }

        
        // Calcular el promedio
        double promedio = (double) suma / 5;

        
        // Mostrar los resultados
        System.out.println("Numero mas grande: " + maximo);
        System.out.println("Numero mas chico: " + minimo);
        System.out.println("Promedio de los numeros: " + promedio);
        }
    }