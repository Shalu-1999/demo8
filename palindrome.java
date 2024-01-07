import java.util.Scanner;
class Palindrome{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);

String n;
String rs="";
n=src.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}//for
if(n.equals(rs)){
System.out.println("it is palindrome:");}//if
else{
System.out.println("it is not palindrome:");
}//else
}//main()
}//Palindrome
