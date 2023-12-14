/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Ej1 {

    public static void main(String[] args) {
        
        String[] palabras=arrayPalabras();
        
        mostrarPalabras(palabras);
    }
    
    public static int numPalabras() {
        boolean errorOpcion=true;
        int numPalabras=0;
        do{
            try {
                numPalabras = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
                        + "el número de palabras que desea crear"));
                errorOpcion = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Has introducido un "
                        + "valor no númerico");
                errorOpcion = true;
            }
        }while(errorOpcion);
        return numPalabras;
    }
    
    public static String[] arrayPalabras(){
        String[] palabras=new String[numPalabras()];
        
        /*rellena el array de palabaras*/
        for(int i=0;i<palabras.length;i++){
            palabras[i]=JOptionPane.showInputDialog("Introduce una palabra");
        }
        return palabras;
    }
    
    public static void mostrarPalabras(String[] arrayPalabras){
        
        String[] palabras=arrayPalabras;
        String aux="";
        for (int i = 0; i < palabras.length; i++) {
            
            aux+=("Posición "+i+" "+palabras[i]+("\n"));
           
        }
         JOptionPane.showMessageDialog(null,aux);
        
        
    }
}

