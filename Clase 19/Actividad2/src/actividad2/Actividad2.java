package actividad2;



public class Actividad2 {
    public static void main(String[] args) {
        Alumno a1 = new Alumno(58, "Santoro", "Nicolas");
        Alumno a2 = new Alumno(24, "Alberti", "Lucio");
        
        String path = "./Alumnos.txt";
        
//        if (Archivo.Guardar(a1, path, false)){
//            System.out.println("Se ha creado correctamente");
//        }
//        
//        else{
//            System.out.println("No se ha podido crear...");
//        }
//        
//        if (Archivo.Guardar(a2, path, false)){
//            System.out.println("Se ha creado correctamente");
//        }
//        
//        else{
//            System.out.println("No se ha podido crear...");
//        }
        
        System.out.println(Archivo.leer(path));
        
//        System.out.println(Archivo.buscarAlumno(58, path));
//        System.out.println(Archivo.buscarAlumno(0, path));
        
        System.out.println(Archivo.eliminarAlumno(a1, path));
        System.out.println(Archivo.leer(path));
    }
}