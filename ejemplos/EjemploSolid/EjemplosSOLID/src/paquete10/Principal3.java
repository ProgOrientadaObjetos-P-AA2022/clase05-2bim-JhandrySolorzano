/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

/**
 *
 * @author USUARIO
 */
public class Principal3 {
     public static void main(String[] args) {
        String nombreArchivo = "Generadores1.data";
        ArchivoLectura lectura= new ArchivoLectura(nombreArchivo);
        lectura.establecerGeneradores();
        System.out.println(lectura);

    }
}
