

package paquete06;


public class Principal {
    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito("Visa","12026545", 2000 );
        MayorEdad representante = new MayorEdad("Jose", tarjeta);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjetaCredito());
        
    }
}
