package ejercicio4;



public class Ejercicio4 {
    public static void main(String[] args) {
        int count = 0;  // Contador para los números perfectos encontrados
        int num = 2;    // Comenzar desde el número 2

        System.out.println("Los primeros 4 numeros perfectos son:");

        // Buscar números perfectos
        while (count < 4) {
            if (esPerfecto(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    // Método para verificar si un número es perfecto
    public static boolean esPerfecto(int numero) {
        int sumaDivisores = 0;

        // Encontrar la suma de los divisores propios del número
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Comparar la suma de divisores con el número
        return sumaDivisores == numero;
    }
}