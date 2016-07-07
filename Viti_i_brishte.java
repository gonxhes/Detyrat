import javax.swing.*;

public class Viti_i_brishte
{
  
    public static void main(String[]args)
   {  
     String s = JOptionPane.showInputDialog("Shkruani vitin me poshte ju lutem: ");
     int i = new Integer(s).intValue();
     
     int t = i%4;
     
     switch (t)
     { case 0: {System.out.println(i+" eshte vit i brishte.");
                break;
              }
       default: {System.out.println(i+" nuk eshte vit i brishte.");
                 break;
     }
     } } }
            