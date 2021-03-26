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
public class TransporteCarga extends Vehiculo {
    protected int pma;
    

    public TransporteCarga(String matricula, String modelo, TipoVehiculo tipoVehiculo, int Cilindros, int Cilindrada, int pma) {
        super(matricula, modelo, tipoVehiculo, Cilindros, Cilindrada);
        this.pma=pma;
    }
    

    @Override
    public double calcularPrecio() {
        double precio = 0;
        if(this.cilindros<10){
            precio = this.pma*3;
        }else{
            precio = this.pma*4;
        }
          precio += precio*0.2;
        return precio;
        
    }
    
}
