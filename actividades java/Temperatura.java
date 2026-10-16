/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Temperatura {

    public static void main(String[] args) {
       
	float celsius, fahrenheit, multiplicacion=(float) 1.8;
	int suma=32;
	celsius=Float.parseFloat(JOptionPane.showInputDialog("digite su temperatura en grados celsius"));
	fahrenheit=(float) celsius*multiplicacion+suma;
	JOptionPane.showMessageDialog(null,"su temperatura en grados fahrenheit " +fahrenheit);
    }
}
