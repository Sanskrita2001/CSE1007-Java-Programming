import java.util.*;
public class Sum_of_series {
public static void main (String []args){
System.out.print( "Enter nth term: " );
Scanner ob = new Scanner(System.in);
int n= ob.nextInt();
int sumsq= 0 ;
for ( int i= 1 ;i<=n;i++)
sumsq+=i*i;
System.out.println( "Sum of series: " +sumsq);
}
}
