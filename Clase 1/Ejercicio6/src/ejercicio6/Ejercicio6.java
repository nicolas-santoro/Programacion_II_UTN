package ejercicio6;


import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el año inicial y final
        System.out.print("Ingresa un anio inicial: ");
        int anioInicial = scanner.nextInt();
        System.out.print("Ingresa un anioo final: ");
        int anioFinal = scanner.nextInt();
        
        // Mostrar mensaje si el año inicial es mayor que el año final
        if (anioInicial > anioFinal) {
            System.out.println("El anio inicial debe ser menor o igual al año final.");
            return;
        }
        
        System.out.println("Anios bisiestos:");

        // Iterar sobre el rango de años
        for (int i = anioInicial; i <= anioFinal; i++){
            if (i % 4 == 0){
                if (i % 100 == 0 && i % 400 == 0){
                    int anioBisiesto = i;
                    System.out.println(anioBisiesto);
                }
            }
        }
    }
}