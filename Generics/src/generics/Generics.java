package generics;

import ejemplos.*;


/**
 *
 * @author maxin
 */
public class Generics {

    public static void main(String[] args) {
          
//        String n0 = "0";
//        int n1= 5;
//        float n2 = 3.3f;
//        double n3 = 5.5;
//        long n4 = 8;
//        Object obj = 2;
//        
//        Generics.mostrarNumero(n1);
//        Generics.mostrarNumero(n2);
//        Generics.mostrarNumero(n3);
//        Generics.mostrarNumero(n4);
//
////        Generics.mostrarNumero(n0);
////        Generics.mostrarNumero(new Persona("",2));
////        Generics.mostrarNumero(obj);
//        
//        Generics.mostrarEntero(n1);
////        Generics.mostrarEntero(n2);
////        Generics.mostrarEntero(n3);
////        Generics.mostrarEntero(n4);
//
//        
//        Persona p1 = new Persona("juan", 22);
//        Persona p2 = new Persona("rosa", 51);
//        Persona p3 = new Persona("ana", 36);
//        
//        Generics.mostrarPersona(p1);
//        Generics.mostrarPersona(p2);
//        Generics.mostrarPersona(p3);
//        
//        //Generics.mostrarPersona(new Terricola(5));
//        
//        Numerica<Integer> numerica1 = new Numerica<>(n1);
//        Numerica<Float> numerica2 = new Numerica<>(n2);
//        Numerica<Double> numerica3 = new Numerica<>(n3);
//
//        System.out.println(numerica1);
//        System.out.println(numerica2);
//        System.out.println(numerica3);
//        
//        //Numerica<Persona> numerica4 = new Numerica<>();
//        //System.out.println(numerica4);
//        
//        Terricola<Persona> terricola1 = new Terricola<>(p1);
//        Terricola<Persona> terricola2 = new Terricola<>(p2);
//        Terricola<Persona> terricola3 = new Terricola<>(p3);
//        Terricola<Empleado> terricola4 = new Terricola<>(new Empleado("",0));
//
//        System.out.println(terricola1);
//        System.out.println(terricola2);
//        System.out.println(terricola3);
        
        Generics.MostarEjemplos();
    }
    
    public static <T extends Number> void mostrarNumero(T valor)
    {
        //if(valor instanceof Number){
            System.out.println(((Number)valor).doubleValue());
        //}
        System.out.println(valor.getClass() + " " + valor);
    }
    
    public static <T extends Persona> void mostrarPersona(T valor)
    {
        System.out.println(valor);
    }
    
    public static <T extends Integer> void mostrarEntero(T valor)
    {
        System.out.println(valor.getClass() + " " + valor);
    }
    
    
    private static void MostarEjemplos(){
        
//Métodos genéricos
            
        String mje = ClaseConMetodosGenericos.metodoEstatico("Accedo al Método Genérico");
        System.out.println(mje);

        System.out.println(ClaseConMetodosGenericos.metodoEstatico(true));

        int nro = ClaseConMetodosGenericos.metodoEstatico(55);

        ClaseDerivada objDerivado = ClaseConMetodosGenericos.metodoEstatico(new ClaseDerivada());

        ClaseConMetodosGenericos.metodoEstaticoDos(new Clase());

        ClaseConMetodosGenericos.metodoEstaticoDos(objDerivado);

        //ClaseConMetodosGenericos.metodoEstaticoDos(0);// ERROR!
                      
//Fin Métodos genéricos

//Simple
            
        ClaseSimple<String> objString = new ClaseSimple<>();
        ClaseSimple<Integer> objInt = new ClaseSimple<>(2);
        ClaseSimple<Boolean> objBool = new ClaseSimple<>(true);
        ClaseSimple<Clase> objClase = new ClaseSimple<>(new Clase());

        //System.out.println(objString);
        System.out.println(objInt);
        System.out.println(objBool);
        System.out.println(objClase);
            
//Fin Simple
            

//Menos Simple
           
        ClaseMenosSimple<Integer,Double> objIntDouble = new ClaseMenosSimple<>();
        ClaseMenosSimple<Boolean,String> objBoolString = new ClaseMenosSimple<>();
        ClaseMenosSimple<Clase,ClaseDerivada> objClase1 = new ClaseMenosSimple<>();

        objIntDouble.setMiAtributo(4);
        objIntDouble.setMiAtributo2(4.5);

        objBoolString.setMiAtributo(true);
        objBoolString.setMiAtributo2("Hola");

        objClase1.setMiAtributo(new Clase());
        objClase1.setMiAtributo2(new ClaseDerivada());

        System.out.println("Objeto 1: "+objIntDouble.getMiAtributo() + " - ");
        System.out.println(objIntDouble.getMiAtributo2());
        System.out.println("Objeto 2: " + objBoolString.getMiAtributo() + " - ");
        System.out.println(objBoolString.getMiAtributo2());
        System.out.println("Objeto 3: " + objClase1.getMiAtributo() + " - ");
        System.out.println(objClase1.getMiAtributo2());
           
//Fin MenosSimple

//Con restricción
            
        ClaseConRestriccion<ClaseDerivada, ClaseConInterface, Clase> claseRestrictiva;
        claseRestrictiva = new ClaseConRestriccion<>(new ClaseDerivada(),new ClaseConInterface(),new Clase());

        claseRestrictiva.mostrar();

        //ClaseConRestriccion<Clase, String, ClaseDerivada > objError;
            
//Fin Con restricción

//Con colecciones

        ClaseGenericaConColeccion<String> cadenas = new ClaseGenericaConColeccion<>(3);
        ClaseGenericaConColeccion<Clase> clases = new ClaseGenericaConColeccion<>(2);
        ClaseGenericaConColeccion<AlgunaInterface> interfaces = new ClaseGenericaConColeccion<>(2);
        
        cadenas.agregar("hola");
        cadenas.agregar("mundo");
        if(cadenas.agregar("generics")){
            System.out.println("Se agregaron...");
        }
        
        if( ! cadenas.agregar("generics")){
            System.out.println("NO se agregaron...");
        }       
        
        clases.agregar(new Clase());
        clases.agregar(new ClaseDerivada());
        
        //clases.agregar(8);// ERROR
     
        interfaces.agregar(new ClaseConInterface());
        
        

//Fin Con colecciones
    }
    
    
    
    
    
    
    
    

    
    
}
