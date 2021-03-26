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
public class TransportePersona extends Vehiculo {
    protected int numeroDePlazas;
    

    public TransportePersona(int numeroDePlazas, String matricula, String modelo, TipoVehiculo tipoVehiculo, int Cilindros, int Cilindrada) {
        super(matricula, modelo, tipoVehiculo, Cilindros, Cilindrada);
        this.numeroDePlazas = numeroDePlazas;
    }
    
    @Override
    public double calcularPrecio() {
   
        return this.PRECIO_BASE * this.cilindros;
        
    }
    
}
