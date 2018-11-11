import java.util.Scanner;
import java.util.*;
class vowel
{
public static void main(String[] args)
{
String str1,str2;
Scanner s=new Scanner(System.in);
System.out.println("Enter a string : ");
str1=s.nextLine();
//Removing vowels
str2=str1.replaceAll("[aeiouAEIOU]","");
System.out.println("After removing vowels string is : ");
System.out.println(str2);
}
}