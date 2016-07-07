import javax.swing.*;

public class Cards_Game 
{
   public static void main(String[] args) 
   {
      int[] cards = new int[13];
      for (int i =0; i < cards.length; i++) 
      {
         cards[i] = i;
      }
      String answer = "";
      int spreadCards = Integer.parseInt(JOptionPane.showInputDialog("How many players are going to play? "));
      if (spreadCards > 10) 
      {
         JOptionPane.showMessageDialog(null, "Only 10 players are allowed to play");
      } 
      else 
      {
         for (int i =0; i < spreadCards; i++) 
         {
            answer += "\n \n Player " + (i+1) + ": \n";
            for (int j = 0; j <5; j++) 
            {
               int card = (int)(Math.floor(13*Math.random()));
               cards[card] = cards[card] + 1;
               if (cards[card] - card > 4) 
               {
                  j--;
               }  
               else 
               {
                  answer += card + " ";
               }
            }
         }
      }
      System.out.println(answer);
   }
}