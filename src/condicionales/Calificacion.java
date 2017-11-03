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
public class Calificacion 
{
    public static void main(String[] args)
    {
        
            float nota1, nota2, nota3, promedio;
        
         nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nota1"));
         nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nota2"));
         nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nota3"));
         
         promedio=(nota1 + nota2 + nota3) /3;
           JOptionPane.showMessageDialog(null, "El promedio es; "+promedio);
           
         if (promedio>=4)//Aqui va una condicion
         
         {
          //Si la condicion se cumple se ejecutara este codigo
          JOptionPane.showMessageDialog(null, "Aprobo");
         }
         else//Si no se cumple la condicion se ejecuta esto
         {
          JOptionPane.showMessageDialog(null, "Reprobo");
           
          }
              
          }
         }

