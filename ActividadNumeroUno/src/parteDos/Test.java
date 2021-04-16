
package parteDos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {


    public static void main(String[] args) {

        try {
            Triangulo t = new Triangulo(2,5,4);
        } catch (TrianguloIlegalException ex) {
            System.out.println(ex.getMessage());
           
        }

    }
    
}
