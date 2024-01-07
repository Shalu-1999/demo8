import java.util.Scanner;
class SumDigits{
public static void main(String args[]){

Scanner src=new Scanner(System.in);
int n;
int rd=0;
//System.out.print("enter any postitiv integer:");
n=src.nextInt();
while(n>0){
rd=rd*10+n%10;
n=n/10;
}
System.out.println(rd);
}
}