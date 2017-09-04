import java.util.*;
public class sor
{
public static void main(String[] s)
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
int b=a.length();
int c=sc.nextInt();
char[] d=a.toCharArray();
Arrays.sort(d);
int e=b-c;
int i;
for(i=0;i<e;i++)
{
System.out.print(d[i]);
}
}
}
