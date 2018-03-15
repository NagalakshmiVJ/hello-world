import java.util.*;
class numbertype
{
static int n;
public static void main(String Arg[])
{
Scanner s = new Scanner(System.in);
n=s.nextInt();
if(n>0)
System.out.println("Positive");
else if(n<0)
System.out.println("Negative");
else
System.out.println("Zero");
}
}
