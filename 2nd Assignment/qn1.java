import java.util.*;
public class qn1 {
public static void main (String args[]){
Scanner ob = new Scanner(System.in);
System.out.print( "Enter size of array: " );
int n = ob.nextInt();
int arr[] = new int [n];
System.out.println( "Enter array elements: " );
for ( int i = 0 ; i < n; i++)
arr[i] = ob.nextInt();
System.out.println( "The third largest element of the array is :
" +third_largest_element(arr,n));
}
public static int third_largest_element ( int arr[], int n){
Arrays.sort(arr);
return arr[n- 3 ];
}
}
