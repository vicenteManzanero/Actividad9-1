package parteUno;

import java.util.Random;

public class Array {

    public static void main(String[] args) {
        
        final int LONGITUD_ARRAY=100;        
        int[] array = new int[LONGITUD_ARRAY];
        Random aleatorio = new Random(System.currentTimeMillis());
        int posicionAleatoria;
              
        for (int i = 0; i < array.length; i++) {
            array[i]= aleatorio.nextInt(501);
            
        }
        posicionAleatoria = aleatorio.nextInt(201)-50;
        
        System.out.println("El valor de la array en la posición " + posicionAleatoria + " es " +array[posicionAleatoria] );
        
    }
    
}
