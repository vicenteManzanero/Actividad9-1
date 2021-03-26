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
public class Furgoneta extends TransporteCarga {
    

    public Furgoneta(String matricula, String modelo, TipoVehiculo tipoVehiculo, int Cilindros, int Cilindrada, int pma) {
        super(matricula, modelo, tipoVehiculo, Cilindros, Cilindrada, pma);
    }
    
    public double calcularPrecio() {
        return super.calcularPrecio();

    }
    
}
