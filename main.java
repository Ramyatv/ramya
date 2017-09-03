import java.util.*;
class main
{
static void printFirstRepeating(int arr[])
{
int min=-1;
HashSet<Integer> Set=new hashSet<>();
for(int i=arr.length-1;i>=0;i--)
{
if(set.contains(arr[i]))
min=i;
else
set.add(arr[i]);
}
if(min!=-1)
System.out.println(arr[min]);
else
System.out.println("there is no repeating elements");
}
public static void main(String[] args)throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
printFirstRepeating(arr);
}
}
