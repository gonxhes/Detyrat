import javax.swing.*;

public class BankReader_B
{private String input;
 


 public BankReader_B()
 { input = "";}
  


 public char readCommand(String message)
{ input = JOptionPane.showInputDialog(message).trim().toUpperCase();
 return input.charAt(0);
 }
 
 
 


 public int readAmount()
 { int answer = 0;
  String s = input.substring(1,input.length());
  s = s.trim();
  if (s.length()>0){double euros_cents = new Double(s).doubleValue();
  answer = (int)(euros_cents);}
  
  else {JOptionPane.showMessageDialog(null,"BankReader error: no number for transaction---zero used");}
  return answer;
  } 
  }