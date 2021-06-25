import java.util.*;
public class qn8
{
public static void main (String[] args) {
int arr1[] = new int [ 3 ];
int arr2[] = new int [ 3 ];
Scanner sc = new Scanner(System.in);
System.out.println( "Enter the elements of the first array:
" );
for ( int i = 0 ; i< 3 ; i++){
arr1[i] = sc.nextInt();
}
System.out.println( "Enter the elements of the second
array: " );
for ( int i = 0 ; i< 3 ; i++){
arr2[i] = sc.nextInt();
}
int arr[] = new int [ 2 ];
arr[ 0 ] = arr1[ 0 ];
arr[ 1 ] = arr2[ 2 ];
System.out.println(arr[ 0 ]+ " " +arr[ 1 ]);
}
}
