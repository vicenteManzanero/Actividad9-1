/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import itv.TipoVehiculo;
import java.util.regex.Pattern;

 public class Vehiculo extends VehiculoGeneral  {

    private String matricula;
    private String modelo;
    private TipoVehiculo tipoVehiculo;
    private int Cilindros;
    private static final int  PRECIO_BASE = 15;
    
    public static final String PATRON_MATRICULA = "\\d{4}[A-Z]{3}";

    public Vehiculo(String matricula, String modelo, TipoVehiculo tipoVehiculo,int Cilindros) {
        assert Pattern.matches(PATRON_MATRICULA, matricula);

        this.matricula = matricula;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.Cilindros = Cilindros;
    }
   
    public boolean tieneEsta(String matricula) {
        assert matricula != null;
        return this.matricula.equals(matricula);
    }   
    
    @Override
    public String toString() {
        return "Matricula:" + matricula + " Modelo:" + modelo + " Tipo:" + tipoVehiculo.toString();
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_BASE * Cilindros;
        
    }
}
