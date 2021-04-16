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
        for (int i = 0; i < 10; i++) {
            posicionAleatoria = aleatorio.nextInt(201)-50;
            try{
            
             System.out.println("El valor de la array en la posición " + posicionAleatoria + " es " +array[posicionAleatoria] );
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("La posicion "+ posicionAleatoria + " está fuera de rango");
            }
            
        }
        
        
       
        
    }
    
}
