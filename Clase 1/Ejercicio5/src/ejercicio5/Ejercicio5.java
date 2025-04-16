package ejercicio5;


import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println("Centros numericos entre 1 y " + numero + ":");

        // Iterar a través de todos los números desde 1 hasta el número ingresado
        for (int i = 1; i <= numero; i++) {
            int sumaIzquierda = 0;
            int sumaDerecha = 0;

            // Calcular la suma de los números a la izquierda de i
            for (int j = 1; j < i; j++) {
                sumaIzquierda += j;
            }

            // Calcular la suma de los números a la derecha de i
            for (int k = i + 1; sumaDerecha < sumaIzquierda; k++) {
                sumaDerecha += k;
            }

            // Verificar si i es un centro numérico
            if (sumaIzquierda == sumaDerecha) {
                System.out.println("Centro numerico encontrado: " + i);
                System.out.println("Suma Izquierda: " + sumaIzquierda);
                System.out.println("Suma Derecha: " + sumaDerecha);
                System.out.println();
            }
        }
    }
}