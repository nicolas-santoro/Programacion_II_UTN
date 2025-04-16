package ejercicio9;


import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario la altura de la pirámide
        System.out.print("Ingresa la altura de la piramide: ");
        int altura = scanner.nextInt();
        
        // Validar que la altura sea positiva
        if (altura <= 0) {
            System.out.println("La altura debe ser un numero entero positivo.");
            return;
        }
        
        // Imprimir la pirámide
        for (int i = 1; i <= altura; i++) {
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Cambiar de línea
            System.out.println();
        }
    } 
}