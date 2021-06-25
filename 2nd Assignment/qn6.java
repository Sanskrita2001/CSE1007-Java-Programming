import java.util.*;
public class qn6
{
public static void main (String[] args) {
System.out.println( "Enter the number of elements in the
array: " );
Scanner sc = new Scanner(System.in);
int n;
n = sc.nextInt();
int arr[] = new int [n];
System.out.println( "Enter the array elements: " );
for ( int i = 0 ; i<n; i++){
arr[i] = sc.nextInt();
}
if (arr[ 0 ] == arr[n- 1 ]){
System.out.println( "true" );
} else {
System.out.println( "false" );
}
}
}
