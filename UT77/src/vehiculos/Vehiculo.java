/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import itv.TipoVehiculo;
import java.util.regex.Pattern;

 public abstract class Vehiculo  {

    protected String matricula;
    protected String modelo;
    protected TipoVehiculo tipoVehiculo;
    protected int cilindros;
    protected int cilindrada;
    protected final int  PRECIO_BASE = 15;
    
    public static final String PATRON_MATRICULA = "\\d{4}[A-Z]{3}";

    public Vehiculo(String matricula, String modelo, TipoVehiculo tipoVehiculo,int Cilindros,int Cilindrada) {
        assert Pattern.matches(PATRON_MATRICULA, matricula);

        this.matricula = matricula;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.cilindros = Cilindros;
        this.cilindrada = Cilindrada;
    }
   
    public boolean tieneEsta(String matricula) {
        assert matricula != null;
        return this.matricula.equals(matricula);
    }   
    
    @Override
    public String toString() {
        return "Matricula: " + matricula + "Modelo: " + modelo +"Cilindros: "+cilindros+"Cilindrada: "+cilindrada+"Tipo: "+tipoVehiculo.toString();
    }

    public abstract double calcularPrecio();
}
