import java.util.Scanner;
class PalindromeNumbers{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
int n;
int rd=0;
System.out.println("enter any positive number:");
n=src.nextInt();
int num=n;
while(n>0){

rd=rd*10+(n%10);
n=n/10;

}//for
if(num==rd){
System.out.println("it is palindrome:");}//if
else{
System.out.println("it is not palindrome:");
}//else
}//main()
}//Palindrome
