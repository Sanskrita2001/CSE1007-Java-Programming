import java.util.*;
public class qn4
{
public static void main (String[] args) {
int n;
System.out.println( "Enter the number of elements in the array:
" );
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int arr[] = new int [n];
int brr[] = new int [n];
System.out.println( "Enter the elements in the array: " );
for ( int i = 0 ; i<n; i++){
arr[i] = sc.nextInt();
}
int count = 0 ;
for ( int i = 0 ; i<n; i++){
if (arr[i]% 2 == 0 ){
brr[count] = arr[i];
count++;
}
}
for ( int i = 0 ; i<n; i++){
if (arr[i]% 2 != 0 ){
brr[count] = arr[i];
count++;
}
}
System.out.println( "The elements in the array after arranging
are as follows: " );
for ( int i = 0 ; i<n; i++){
System.out.print(brr[i]+ " " );
}
}
}
