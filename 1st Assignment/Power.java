import java.util.*;
public class qn14 {
public static void main (String []args){
Scanner sc = new Scanner(System.in);
System.out.println( "Enter base number: " );
int a = sc.nextInt();
System.out.println( "Enter power number: " );
int b = sc.nextInt();
System.out.println( "Power of number is :" +power(a,b));
}
public static long power ( int m, int n)
{
long res= 1 ;
int temp=n;
for (;n!= 0 ;n--)
{
res=res*m;
}
return res;
}
}
