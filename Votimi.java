import javax.swing.*;
public class Votimi {
public static void main(String[]args)
	{
   
int count = 5;   
int limit = 0;

while (count < limit)
{

String em=JOptionPane.showInputDialog("Emri dhe mbiemri:");
String m=JOptionPane.showInputDialog("Mosha:");

int mosha = new Integer(m).intValue();

if (mosha<18)
{JOptionPane.showMessageDialog(null,"Ju jeni ende i/e mitur per te votuar!");}
else
{
String zgjedhja = JOptionPane.showInputDialog("Shtypni 1 per kandidatin e pare ose 2 per te dytin ");
int zgj =new Integer(zgjedhja).intValue();
if (zgj == 1)
{
JOptionPane.showMessageDialog(null, "Ju votuat per kandidatin 1.");


JOptionPane.showMessageDialog(null,"Falemnderit qe ndate kohen te jeni pjese e votimit.");

}

else
{
if(zgj == 2)
{
JOptionPane.showMessageDialog(null, "Ju votuat per kandidatin 2.");

JOptionPane.showMessageDialog(null,"Falemnderit qe ndate kohen te jeni pjese e votimit !");}



else
{

JOptionPane.showMessageDialog(null,"Mund shkruani vetem numrin 1 ose 2, perndryshe vota juaj eshte e pavlefshme. ");
}
count++;
}
}
}
}
}

	
