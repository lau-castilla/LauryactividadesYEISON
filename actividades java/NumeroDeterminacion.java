/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerodeterminacion;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class NumeroDeterminacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int numero;
     numero =Integer.parseInt(JOptionPane.showInputDialog("Digite su numero"));
     
     if (numero %2==0){
       JOptionPane.showMessageDialog(null,"el numero es par");
     }//*cierre if 1
       else{
         JOptionPane.showMessageDialog(null,"el numero es impar");
               } //*cierre else 1
     if (numero>0){
         JOptionPane.showMessageDialog(null,"el numero es posotivo");
     }//*cierre if 2
     else if (numero<0){
         JOptionPane.showMessageDialog(null,"el numero es negativo");
     }//*cierre else if 
     
    else{
            JOptionPane.showMessageDialog(null,"el numero es cero"); 
             }
    }
    
}
