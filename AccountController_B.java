import javax.swing.*;
import java.awt.*;
import java.text.*;




public class AccountController_B
{ private BankReader_B reader;
  private BankWriter_B writer;
  private BankAccount_B account;
  
 
 
 
  public AccountController_B(BankReader_B r, BankWriter_B w, BankAccount_B a)
  { reader = r;
    writer = w;
    account = a;
    
  }
  
  public void processTransactions2()
  
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
         
         this.processTransactions2();
        }
        
  }}       
  