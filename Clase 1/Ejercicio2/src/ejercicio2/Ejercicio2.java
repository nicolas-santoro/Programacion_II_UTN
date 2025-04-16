package ejercicio2;



import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();
        
        // Variables para guardar el cuadrado y el cubo del número
        int cuadrado = 0;
        int cubo = 0;
        
        
        if (numero > 0){
            cuadrado = (int) Math.pow(numero, 2);  // Calcular el cuadrado
            cubo = (int) Math.pow(numero, 3);      // Calcular el cubo
        }
        
        else{
        System.out.print("Ingrese un número mayor a 0: ");
        numero = scanner.nextInt();  // No es necesario declarar la variable de nuevo
        cuadrado = (int) Math.pow(numero, 2);
        cubo = (int) Math.pow(numero, 3);
        }
        
        
    System.out.println(numero + " al cuadrado es: " + cuadrado);
    System.out.println(numero + " al cubo es: " + cubo);
    }
}