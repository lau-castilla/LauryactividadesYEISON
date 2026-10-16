package tablamultiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Tablamultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int N, resultado, contadorespares = 0;
        N=Integer.parseInt(JOptionPane.showInputDialog("Digite su numero entero"));
        
      for (int i=1; i<=10; i++){
         resultado=N*i;
         JOptionPane.showConfirmDialog(null, +N+ "x" +i+ "=" +resultado);
         
         if (resultado%2==0) {
           contadorespares++;
         }
      }//*cierre for
      JOptionPane.showMessageDialog(null, "cantidad de resultado pares: " +contadorespares);
    }
}
