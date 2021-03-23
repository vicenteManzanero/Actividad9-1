/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import itv.TipoVehiculo;
import java.util.regex.Pattern;

 public abstract class VehiculoGeneral  {

    private String matricula;
    private String modelo;
    private TipoVehiculo tipoVehiculo;
    private int Cilindros;
    
    public static final String PATRON_MATRICULA = "\\d{4}[A-Z]{3}";

    public VehiculoGeneral(String matricula, String modelo, TipoVehiculo tipoVehiculo,int Cilindros) {
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
    public abstract double calcularPrecio();
}
