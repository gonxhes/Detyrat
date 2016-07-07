public class Detyra_7_7_2
{

public static String removeDuplicateLetters(String s)
{ String answer = "";
  for ( int i = 0;  i != s.length();  i = i + 1 )
             { if ( notFoundIn(answer, s.charAt(i)) )
            { answer = answer + s.charAt(i); }
       }
       System.out.println(answer);
  return answer;
}
private static boolean notFoundIn(String a, char c)
{ boolean notfound = true;
  for ( int j = 0;  j != a.length();  j = j + 1 )
    
      { notfound = notfound  &&  (c != a.charAt(j)); }
  return notfound;
}

public static void main(String[]args)
{ removeDuplicateLetters("Mississippi");
}
}
