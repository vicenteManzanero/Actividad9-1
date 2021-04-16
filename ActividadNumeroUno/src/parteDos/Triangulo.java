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
public class Triangulo {
    private double l1,l2,l3;

    public Triangulo(double l1, double l2, double l3) throws TrianguloIlegalException{
        if((l1+l2)>l3){
            throw new TrianguloIlegalException(l1,l2,l3);
            
        }else
        
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        
    }

  
    
    
    
}
