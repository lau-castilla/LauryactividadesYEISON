/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulop;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class RectanguloP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int base, altura,area,perimetro ;
	base= Integer.parseInt(JOptionPane.showInputDialog("digite la base"));
    altura= Integer.parseInt(JOptionPane.showInputDialog("digite la altura"));
	
	
	if((base>altura) || (altura>base)){
        area=base*altura;
	 perimetro=(2*(base+altura)) ;
        JOptionPane.showMessageDialog(null, "su area es "+area+ "\nsu perimetro es"+perimetro);
        
    }
		
		
	else{
 JOptionPane.showMessageDialog(null, "error no es un rectangulo");
    }
    }
    
}
