public class AccountManager_B
{ public static void main(String[]args)
 { BankReader_B reader = new BankReader_B();
   BankAccount_B account = new BankAccount_B(0);
   BankWriter_B writer = new BankWriter_B("Bank Writer B",account);
   
   AccountController_B controller = new AccountController_B(reader,writer,account);
   
   controller.processTransactions2();
   
  }
  } 
    