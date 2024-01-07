import java.util.Scanner;
class ProductDigit{
public static void main(String ags[]){
Scanner src=new Scanner(System.in);
int n;
int pd=1;
System.out.print("enter positive integer:");
n=src.nextInt();
while(n>0){
pd=pd*(n%10);
n=n/10;
}
System.out.println(pd);
}
}
