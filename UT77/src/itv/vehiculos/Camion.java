/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itv.vehiculos;

import itv.TipoVehiculo;

/**
 *
 * @author ciclost
 */
public class Camion extends TransporteCarga {
    

    public Camion(String matricula, String modelo, TipoVehiculo tipoVehiculo, int Cilindros, int Cilindrada, int pma) {
        super(matricula, modelo, tipoVehiculo, Cilindros, Cilindrada, pma);
    }
    
    public double calcularPrecio(){
        double precio = super.calcularPrecio();
        
        
        
        if(this.cilindrada>2000){
            precio+=20;
        }
            precio+=40;
            
        

        return precio;
    }
    
}
