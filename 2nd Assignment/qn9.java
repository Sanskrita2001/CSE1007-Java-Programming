import java.util.*;
public class qn9 {
public static void main (String args[]){
Scanner ob = new Scanner(System.in);
int a[] = new int [ 2 ];
System.out.println( "Enter elements of array: " );
for ( int i = 0 ; i < 2 ; i++)
a[i] = ob.nextInt();
System.out.print(check_array(a));
}
public static boolean check_array ( int a[]){
for ( int i= 0 ; i< 2 ; i++)
{
if ((a[i]== 4 )||(a[i]== 7 ))
return true ;
}
return false ;
}
}
