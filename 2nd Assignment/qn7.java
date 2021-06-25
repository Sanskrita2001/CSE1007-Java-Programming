import java.util.*;
public class qn7 {
public static void main (String args[]){
Scanner ob = new Scanner(System.in);
System.out.print( "Enter size of arrays: " );
int n = ob.nextInt();
int a[] = new int [n];
int b[] = new int [n];
if (n >= 2 ){
System.out.println( "Enter array elements of array1: " );
for ( int i = 0 ; i < n; i++)
a[i] = ob.nextInt();
System.out.println( "Enter array elements of array2: " );
for ( int i = 0 ; i < n; i++)
b[i] = ob.nextInt();
System.out.print(check_array(a,b,n));
}
else {
System.out.println( "Size of array must be greater than 2" );
}
}
public static boolean check_array ( int a[], int b[], int n){
if (a[ 0 ]==b[n- 1 ])
return true ;
else
return false ;
}
}
