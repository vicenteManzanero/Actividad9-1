
import itv.TipoVehiculo;
import itv.vehiculos.Coche;
import itv.vehiculos.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ciclost
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        
        Vehiculo v1 = new Coche(4,"1234ABC","Ibiza",TipoVehiculo.COCHE,5,2000);
        double precio = v1.calcularPrecio();
        System.out.println(precio);
    }
    
}
