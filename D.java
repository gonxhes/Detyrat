//Mathematical definitions computed with definite-itiration loops

import javax.swing.*;
public class D
{ 
 /**Method summation computes summation
    @param s - the argument which is the last added number
    @ return computed summation */
 
   public static int summation(int s)
   {  
      int count= 1;
      int sum=0;
      if (s >1)
      {
         while (s>=count)
         
         { sum+=count;
            count++;}
      }
      else{JOptionPane.showMessageDialog(null,"Warning! Negative number "+s);} 
      return sum;}


/** Method product calculates the product of two non-negative arguments
    @param a - the first number from which product begins
    @param b - the multiplying stops when reaches b, this is the final number
    @return the product from number a to b*/
    
   public static int product(int a,int b)
   { 
      int count = a;
      int result=1;
      int p = 1;
      
      if (a<0||b<0)
      { JOptionPane.showMessageDialog(null,"Warning! The first number is bigger than the second one.");}
else{ if(a<=b){p=a;
         while (count!=b)
         { 
            count++;
            p*=count;   }
      }
          } return p;
}
   
/** Method nFactorial calculates the factorial of a positive argument
    @param c - the number whose factorial's going to be found*/
   
   public static long nFactorial(long c)
   { 
      long n = c;
      int count = 0;
      long result=1;
      long r =1;
      if(n!=0)
      {
         while (c>count)
         {count++;
            result*=count;
         }     
      }
      
      
      else{c=1;}
    
      return result;   
   }

/**Method sine calculates the sine value of its argument
   @param x - the value whose sine is desired
   @return the sine as calculated by the formula*/
   public static double sine(double x)
   { double sin = x;
      int count = 3;
      while (count<=19)
      {double d = Math.pow(x,count)/nFactorial(count);
         switch(count%4)
         { 
            case 3:
               {sin-=d;
                  break;}
            default:
               {sin+=d;}
         }
         count+=2;
      }
      return sin;}  

/**Method cosine calculates the cosine value of its argument
   @param x - the value whose cosine is desired
   @return the cosine as calculated by the formula*/    
   public static double cosine(double x)
   { double cos = 1;
      int count = 2;
      while (count<=20)
      { double d = Math.pow(x,count)/nFactorial(count);
         switch(count%4)
         { 
            case 2:
               {cos-=d;
                  break;}
            default:
               {cos+=d;}
         }
         count+=2;
      }
      return cos;
   }   
   
   public static void main (String[]args)
   { int number1 = new Integer(JOptionPane.showInputDialog("Summation of which number would you like to find? :")).intValue();
     int number2= new Integer(JOptionPane.showInputDialog("At which number would you like your multiplying to start:")).intValue();
     int number3 = new Integer(JOptionPane.showInputDialog("Where would you like to stop multiplying:")).intValue();
     int number4 = new Integer(JOptionPane.showInputDialog("Factorial of which number would you like to find? :")).intValue();
     int number5 = new Integer(JOptionPane.showInputDialog("Sine of which number would you like to find? :")).intValue();
     int number6 = new Integer(JOptionPane.showInputDialog("Cosine of which number would you like to find? :")).intValue();
    
     JOptionPane.showMessageDialog(null,"The summation of "+number1+" is " + summation(number1));
     JOptionPane.showMessageDialog(null,"The product of " +number2+" to "+number3+ " is " +product(number2,number3));
     JOptionPane.showMessageDialog(null,"The factorial of "+number4+" is " + nFactorial(number4));
     JOptionPane.showMessageDialog(null,"The sine of " +number5+" is " + sine(number5));
     JOptionPane.showMessageDialog(null,"The cosine of " +number6+ " is " +cosine(number6));
     
   }
  
}

