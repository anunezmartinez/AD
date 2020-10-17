import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Archivos {

    public void eDirectorio(String dirName){
        File directorio = new File(dirName);
        if(directorio.isDirectory()){
            System.out.println("Es un directorio");
        }else{
            System.out.println("No es un directorio.");
        }
    }
    public void eFichero(String dirName){
        File archivo = new File(dirName);
        if(archivo.isFile()){
            System.out.println("Es un archivo.");
        }else {
            System.out.println("No es un archivo.");
        }

    }
    public void creaDirectorio(String dirName){
        File directorio = new File(dirName);
        if(directorio.isFile()){
            System.out.println("El directorio ya existe.");
        } else{
            directorio.mkdirs();
            System.out.println("Directorio creado correctamente.");
        }
    }
    public void creaFichero(String dirName, String fileName) throws IOException {
    File directorio = new File(dirName);
    File archivo = new File(fileName);
    if(directorio.isDirectory()){
        System.out.println("El directorio ya existe.");
    } else if(!directorio.isDirectory()){
       try{
           archivo.createNewFile();
           System.out.println("El archivo ha sido creado.");
       }catch (IOException e){
        e.printStackTrace();
       }
    } else {
        System.out.println("El directorio no existe.");
    }
    }

    public void modoAcceso(String dirName, String fileName){
        File archivo = new File(dirName, fileName);
        if(archivo.exists()){
            if(archivo.canWrite()){
                System.out.println("Escritura Si");
            } else if(!archivo.canWrite()){
                System.out.println("Escritura no.");
            }
            if(archivo.canRead()){
                System.out.println("Lectura si");
            } else if(!archivo.canRead()){
                System.out.println("Lectura no");
            }
        } else{
            System.out.println("El fichero no existe.");
        }

    }
    public void calculaLonxitude(String dirName, String fileName){
        File archivo = new File(dirName, fileName);
        if(archivo.exists()){
            System.out.println("Tamaño do archivo: " + archivo.length() + "B");
        } else {
            System.out.println("El fichero no existe.");
        }
    }
    public void mLectura(String dirName, String fileName){
        File archivo = new File(dirName, fileName);
        if(archivo.exists()){
            archivo.setReadOnly();
        } else {
            System.out.println("El fichro no existe.");
        }
    }
    public void mEscritura(String dirName, String fileName){
        File archivo = new File(dirName, fileName);
        if(archivo.exists()){
            archivo.setWritable(true);
            System.out.println("Permisos cambiados.");
        } else {
            System.out.println("El fichro no existe.");
        }
    }
    public void borraFichero(String dirName, String fileName){
        File archivo = new File(dirName, fileName);
        if(archivo.exists()){
            if(archivo.delete()){
                System.out.println("Archivo borrado correctamente.");
            } else {
                System.out.println("El archivo no pudo ser borrado correctamente.");
            }

        }else{
            System.out.println("Archivo no existente o no encontrado.");
        }
    }
    public void borraDirectorio(String dirName) {
        File dir = new File(dirName);
        if (dir.exists()) {
            if (dir.delete()) System.out.println("El directorio se elimino correctamente");
            else System.out.println("El directorio no pudo ser eliminado");
        } else System.out.println("El directorio no existe");
    }
    public void mContido(String dirName) {
        File dir = new File(dirName);
        if (dir.exists()) {
            System.out.println(Arrays.toString(dir.list()));
        } else System.out.println("El directorio no existe.");
    }
}
