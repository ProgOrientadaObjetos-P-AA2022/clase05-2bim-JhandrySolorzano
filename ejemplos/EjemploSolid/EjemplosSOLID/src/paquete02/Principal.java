
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Persona est1 = new Persona("Jose Miguel", 20);
        Persona est2 = new Persona("Paula", 22);
        Persona est3 = new Persona("Claudia", 18);
        Persona est4 = new Persona("Daniela", 21);
        
        ArrayList<Persona> listado = new ArrayList<>();
        
        listado.add(est1);
        listado.add(est2);
        listado.add(est3);
        listado.add(est4);
        
        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        
        operaciones.establecerEstudiante(listado);
        operaciones.establecerPromedioEdades();
        

       System.out.printf("%s\n", operaciones);
        
        
        
        
        
    
        
        
    }
}
