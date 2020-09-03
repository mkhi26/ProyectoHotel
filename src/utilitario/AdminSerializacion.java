/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;
import java.io.*;
/**
 *
 * @author Arkoses_as
 */
public class AdminSerializacion {
    /**
     * Método utilizado para guardar un objeto serializable
     * @author OHernandez
     * @date 12Oct2017
     * @param objeto Objeto a guardar en el archivo
     * @param nombreArchivo Nombre del archivo
     */
    public static void guardar(Object objeto, String nombreArchivo) {
        ObjectOutputStream salida=null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream("Serializacion/"+nombreArchivo));
            salida.writeObject(objeto);
            salida.close();
        } catch (Exception ex) {
            System.out.println("Error al guardar información en AdminSerializacion "+ex.getMessage()+ex.getStackTrace());
        }
    }

    /**
     * Método para obtener un objeto serializado
     * @author OHernandez
     * @date 12Oct2017
     * @param nombreArchivo
     * @return El objeto obtenido del archivo
     */
    public static Object obtener(String nombreArchivo) {
        Object obj1=null;
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Serializacion\\"+nombreArchivo));
            System.out.print(entrada);
            obj1 = (Object) entrada.readObject();
            entrada.close();
            
        } catch (Exception ex) {
            
            System.out.println("Error al obtener objeto AdminSerializacion: "+ex.getMessage());
        }
         return obj1;
    }
}
