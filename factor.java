import java.util.Scanner;
class Factor{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int inputNum=src.nextInt();
for(int i=1;i<=inputNum;i++)
{
if(inputNum %i==0)
{
System.out.print(i);
if(i!=inputNum)System.out.print(",");
}
}
}
}
