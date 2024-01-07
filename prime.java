import java.util.Scanner;
class CheckPrime{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int inputNum=src.nextInt();
int count=0;
for(int i=1;i<=inputNum;i++)
{
if(inputNum%i==0)
{
count++;
System.out.print(i);
if(i!=inputNum)System.out.print(",");
}
}
System.out.print("\ncount of factors of"+inputNum+"is"+count);
if(count==2)System.out.println("prime");
else
System.out.println("not prime");
}
}