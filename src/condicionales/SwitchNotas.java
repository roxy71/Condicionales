/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Matematicas
/**
 *
 * @author LAB03
 */
public class SwitchNotas 
{
    public static void main(String[] args)
    {
       float nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una nota"));
       //El metodo round es para redondear un decimal
       switch(Math.round(nota))//Se recibe el valor
       {
           case 7://Caso 1 - si el valor es 7
          JOptionPane.showMessageDialog(null, "NOTABLE");     
            break;
           case 6://Caso 2 - si el valor es 6
         JOptionPane.showMessageDialog(null, "BIEN");
          break;
           case 5://Caso 3 - si el valor es 5
         JOptionPane.showMessageDialog(null, "SUFICIENTE");
         break;
           case 4://Caso 4 - si el valor es 4
         JOptionPane.showMessageDialog(null, "INSUFICIENTE");
         break;
         
       } 
    
       
    }
}
