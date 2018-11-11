import java.util.Scanner;
import java.util.*;
class countword
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int word=1,i;
System.out.println("Enter the sentence : ");
String str=s.nextLine();
for(i=0;i<str.length();i++)
 {
 if(str.charAt(i)==' ')
  {
   word++;
  }
 }
System.out.println("Number of words : "+word);
}
}