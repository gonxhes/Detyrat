import javax.swing.*;
import java.awt.*;
import java.text.*;




public class AccountController
{ private BankReader reader;
  private BankWriter writer;
  private BankAccount account;
  
 
 
 
  public AccountController(BankReader r, BankWriter w, BankAccount a)
  { reader = r;
    writer = w;
    account = a;
    
  }
  
  public void processTransactions()
  
  { char command = reader.readCommand("Command (D,W,Q) and amount: ");
  
   if (command == 'Q') {}
   
   else { if (command == 'D' )
              { int amount = reader.readAmount();
                boolean ok = account.deposit(amount);
                if (ok) { writer.showTransaction("Deposit of €"+amount);}
                else {writer.showTransaction("Deposit invalid"+amount);}
               }
         else if (command == 'W')
                { int amount = reader.readAmount();
                  boolean ok = account.withdraw(amount);
                  
                  if(ok) {writer.showTransaction("Withdraw of €"+amount);}
                  else {writer.showTransaction("Withdraw invalid"+amount);} 
                }
         
         else {writer.showTransaction("Illegal command: " + command);}
         
         this.processTransactions();
        }
        
  }}       
  