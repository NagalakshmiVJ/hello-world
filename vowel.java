import java.util.*;
class vowel
{
public static void main(String arg[])
{
char V;
Scanner s= new Scanner(System.in);
V=s.next().charAt(0);
if(V=='a'| V=='e'| V=='i' | V=='o'| V=='u')
System.out.println("Vowel");
else
System.out.println("Consonant");
}
}
