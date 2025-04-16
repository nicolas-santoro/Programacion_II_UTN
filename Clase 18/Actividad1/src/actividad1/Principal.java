package actividad1;



public class Principal {
    public static void main(String[] args) {
        Calculadora casio = new Calculadora();
        
        try {
            System.out.println(casio.dividir(10, 15));
        }
        
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}