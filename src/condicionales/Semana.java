/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB03
 */
public class Semana 
{
         public static void main(String[] args)
         {
              int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
              switch(numero)
              
              {
                  case 1:
                  JOptionPane.showMessageDialog(null, "Lunes");
                  break;
                  case 2:
                  JOptionPane.showMessageDialog(null, "Martes");
                  break;
                  case 3:
                  JOptionPane.showMessageDialog(null, "Miercoles");
                  break;
                  case 4:
                   JOptionPane.showMessageDialog(null, "Jueves");
                  break;
                  case 5:
                   JOptionPane.showMessageDialog(null, "Viernes");
                  break;
                  case 6:
                   JOptionPane.showMessageDialog(null, "Sabado");
                  break;
                  case 7:
                   JOptionPane.showMessageDialog(null, "Domingo");
                  break;
              } 
              
         }
}
