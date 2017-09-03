import java.util.*;
public class digint
{
public static void main(String[] s)
{
Scanner sc=new Scanner(System.in)
int a=sc.nextInt();
int result=0;
int rem;
while(a>0)
{
rem=a%10;
a=a/10;
result=result*10+rem;
}
System.out.println(result);
}
}
