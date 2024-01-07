import java.util.Scanner;
class SumDigits{
public static void main(String args[]){

Scanner src=new Scanner(System.in);
int n;
int sd=0;
n=src.nextInt();
while(n>0){
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);
}
}