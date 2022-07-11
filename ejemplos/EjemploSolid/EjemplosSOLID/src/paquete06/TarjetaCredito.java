/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author User
 */
public class TarjetaCredito {
    String nom;
    String codigo;
    Double cupoM;
    
    public TarjetaCredito(String n, String c, double cM){
        nom=n;
        codigo=c;
        cupoM=cM;
    }
    
    public void establecerNombre(String n){
        nom=n;
    }
    
    public void establecerCodigo(String n){
        codigo=n;
    }
    
   public void establecerCupoM(double n){
        cupoM=n;
    }
       
       
    public String obtenerNombre(){
       return nom;
    }
       
    public String obtenerCodigo(){
        return codigo;
    }
    
    public double obtenerCupoM(){
        return cupoM;
    }
         
         
    
}
