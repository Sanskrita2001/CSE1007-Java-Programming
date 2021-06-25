import java.util.*;
class JaggedArray {
public static void main (String args[]){
int arr[][]= new int [ 3 ][];
arr[ 0 ] = new int [ 12 ];
arr[ 1 ] = new int [ 10 ];
arr[ 2 ] = new int [ 8 ];
Scanner sc = new Scanner(System.in);
System.out.println( "Enter the attendance:" );
for ( int i = 0 ; i<arr.length;i++)
{
for ( int j = 0 ; j < arr[i].length; j++)
arr[i][j]=sc.nextInt();
}
double add = 0 ;
for ( int [] arr1D : arr)
{
for ( int i : arr1D)
{
if (i == 1 )
add++;
}
}
double total = 12 + 10 + 8 ;
System.out.println( "Total Percentage:" +(add/total)* 100 );
}
}
