import javax.swing.*;
import java.awt.*;
import java.text.*;

public class BankWriter extends JPanel

{ private int WIDTH=300;
  private int DEPTH =200;
  private BankAccount bank;
  private String last_transaction;
  
  public BankWriter(String title,BankAccount b)
  { bank = b;
  JFrame my_frame = new JFrame();
my_frame.getContentPane().add(this);
my_frame.setTitle(title);
my_frame.setSize(WIDTH, DEPTH);
my_frame.setVisible(true);
my_frame.setLocation(WIDTH+255,DEPTH-100);   
   }
   
   public void paintComponent(Graphics g)
  { 
    g.setColor(Color.white);
    g.fillRect(0,0,WIDTH,DEPTH);
    g.setColor(Color.black);
    int t_margin = 50;
    int t_baseline= 50;
    g.drawString(last_transaction,t_margin,t_baseline);
    g.drawString("Current balance = "+ unconvert(bank.getBalance())+" €",t_margin,t_baseline+20);
    
    }
    
    
   private String unconvert(int i)
   { double euros_cents = i; 
     return new DecimalFormat("0.00").format(euros_cents);
   }
   
   
   
   public void showTransaction(String message)
   { last_transaction = message;
     this.repaint();
     
   }
   }    