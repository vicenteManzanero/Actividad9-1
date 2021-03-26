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
public class Coche extends TransportePersona {
    protected final double  PRECIO_PLAZA = 1.5;

    public Coche(int numeroDePlazas, String matricula, String modelo, TipoVehiculo tipoVehiculo, int Cilindros, int Cilindrada) {
        super(numeroDePlazas, matricula, modelo, tipoVehiculo, Cilindros, Cilindrada);
    }

    public double calcularPrecio() {
        double precio = 0;
        if(this.numeroDePlazas>3){
            precio = this.PRECIO_BASE * this.cilindros+ this.PRECIO_PLAZA * numeroDePlazas;
        }else{
            precio = this.PRECIO_BASE * this.cilindros;
        }
        
        
        if (this.cilindrada>1200){
            precio +=10;
        }
       
   
        return precio;
        
    }
    
}
