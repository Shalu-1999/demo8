import java.util.Scanner;
class ReverseString{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
String n;
String rs="";
n=src.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.println(rs);
}
}
