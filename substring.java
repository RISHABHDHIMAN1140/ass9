import java.util.Scanner;
import java.util.*;
class substring
{
public static void main(String[] args)
{
String str,sub;
int i,j,len;
Scanner s=new Scanner(System.in);
System.out.println("Enter a string : ");
str=s.nextLine();
len=str.length();
System.out.println("Substrings of "+str+" are :");
for(i=0;i<len;i++)
 {
 for(j=1;j<=len-i;j++)
  {
   sub=str.substring(i,i+j);
   System.out.println(sub);
  }
 }
}
}