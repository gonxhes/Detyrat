import javax.swing.*;

public class BankAccount_B
{ private int balance;

public BankAccount_B(int initial_balance)
{if (initial_balance>=0){balance = initial_balance;}
 else{balance = 0;}

}

public boolean deposit(int amount)
{boolean result = false;
if (amount>=0){balance +=amount; result = true;}

else {JOptionPane.showMessageDialog(null,"BankAcccount error: bad deposit amount---ignored");}
      return result;


}

public boolean withdraw(int amount)
{boolean result = false;
if ( amount < 0 )
{ JOptionPane.showMessageDialog(null,
"BankAcccount error: bad withdrawal amount---ignored"); }
else if ( amount > balance )
{ JOptionPane.showMessageDialog(null,
"BankAcccount error: withdrawal amount exceeds balance");
}
else { balance = balance - amount;
result = true;
}
return result;
}

public int getBalance()
{ return balance;}
}


