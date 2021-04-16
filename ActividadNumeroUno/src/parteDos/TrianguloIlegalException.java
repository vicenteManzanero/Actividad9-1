/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parteDos;

/**
 *
 * @author ciclost
 */
public class TrianguloIlegalException extends Exception {  
    private double l1,l2,l3;

    public TrianguloIlegalException(double l1, double l2, double l3) {
        super("El lado "+ l1+ " mas el lado "+l2+" no puede ser más grande que el lado " + l3);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    
    
    
    
}
