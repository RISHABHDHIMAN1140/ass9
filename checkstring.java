import java.util.*;
class checkstring
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int count=1;
System.out.println("Enter String : ");
String str1=s.nextLine();
System.out.println("Enter another string : ");
String str2=s.nextLine();
  if(str1.contains(str2))
   {
    count++;
   System.out.println("no.of times string occurred :"+count);
   }
  else
   {
    System.out.println("This string is not available in another string");
   }
}
}