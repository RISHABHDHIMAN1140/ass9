import java.util.Scanner;
import java.util.*;
class reverse
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String orig,rev="";
System.out.println("Enter a string to reverse :");
orig=s.nextLine();
int len=orig.length();
int i;
for(i=len-1;i>=0;i--)
 {
  rev=rev+orig.charAt(i);
 }
System.out.print("Reverse of string = "+rev);
}
}