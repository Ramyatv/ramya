import java.util.*;
public class dig
{
public static void main(String[] s)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
while(a>0)
{
a=a/10;
count++;
}
System.out.println(count);
}
}
