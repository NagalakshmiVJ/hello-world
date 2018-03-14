import java.util.*;
class natnumbers
{
public static void main(String arg[])
{
int number;
int sum=0;
Scanner s= new Scanner(System.in);
number=s.nextInt();
for ( int i=0;i<=number;i++)
sum=sum+i;
System.out.println(sum);
}
}
