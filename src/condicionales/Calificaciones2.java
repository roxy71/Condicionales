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
public class Calificaciones2 
{
     public static void main(String[] args)
    {
        
            float nota;
        
        nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota"));
        
              if (nota==7)
              {
              JOptionPane.showMessageDialog(null, "notable");
              
              }
         else
        if (nota>=6)
        { 
        JOptionPane.showMessageDialog(null, "bien");
        }  
                else
            
                if (nota >=4 && nota <=5)
                {
                  JOptionPane.showMessageDialog(null, "suficiente");  
                        
                        
                        }
                        else
                    if (nota>=0 && nota<=4)
                    { 
                      JOptionPane.showMessageDialog(null, "insuficiente");    
                    }
                      
    }
}
         
     
              


                  
          
            
        
            
        
              
          
         


