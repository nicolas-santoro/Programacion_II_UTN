package actividad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class Archivo {
    public static <T> boolean Guardar(T dato, String path, boolean agregar){
        boolean rt = false;
        
        try(FileWriter fw = new FileWriter(path, agregar)){
            fw.write(dato.toString() + "\n");
            
            rt = true;
        }
        
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return rt;
    }
    
    public static String leer(String path){
        StringBuilder sb = new StringBuilder();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            
            while ((linea = br.readLine()) != null){
                sb.append(linea).append("\n");
            }
        }
        
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return sb.toString();
    }
    
    public static boolean buscarAlumno(int legajo, String path){
        boolean encontrado = false;
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            
            while ((linea = br.readLine()) != null){
                String[] separados = linea.split(" - ");
                
                if (Integer.parseInt(separados[0]) == legajo){
                    encontrado = true;
                    
                    break;
                }
            }
        }
        
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return encontrado;
    }
    
    public static boolean modificarAlumno(Alumno alumno, String path){
        ArrayList lineas = new ArrayList<>();
        boolean encontrado = false;
        boolean logrado = false;
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            
            while ((linea = br.readLine()) != null){
                String[] separados = linea.split(" - ");
                
                if (!separados[0].isEmpty()){
                    if (Integer.parseInt(separados[0]) != alumno.getLegajo()){
                        lineas.add(alumno.toString());
                        encontrado = true;
                    }

                    else{
                        lineas.add(linea);
                    }
                }
            }
        }
        
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        if (encontrado){         
            if (Archivo.Guardar(lineas, path, false)){
                System.out.println("Se guardo correctamente");
                
                logrado = true;
            }
            
            else {
                System.out.println("No se pudo reescribir el archivo...");
            }
        }
        
        return logrado;
    }
    
    public static boolean eliminarAlumno(Alumno alumno, String path){
        boolean encontrado = false;
        
        String contenido = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            
            while ((linea = br.readLine()) != null){
                String[] separados = linea.split(" - ");
                
                if (!separados[0].isEmpty()){
                    if (Integer.parseInt(separados[0]) != alumno.getLegajo()){
                        contenido += linea + "\n";
                    }

                    else{
                        encontrado = true;
                    }
                }
            }
        }
        
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        Archivo.Guardar(contenido, path, false);
        
        
        return encontrado;
    }
}