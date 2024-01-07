//0+5+10+....+95+100


class Test{
public static void main(String args[]){

int i=0;
int sum=0;
for(i=0;i<=100;i=i+5)
{
System.out.print(i+"+");
sum=sum+i;

}
System.out.println("\b"+"="+sum);
}
}