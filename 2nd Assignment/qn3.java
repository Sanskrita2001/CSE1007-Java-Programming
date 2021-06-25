import java.util.*;
public class qn3 {
public static void main (String args[]){
Scanner ob = new Scanner(System.in);
System.out.print( "Enter size of array: " );
int n = ob.nextInt();
int arr[] = new int [n];
System.out.println( "Enter array elements: " );
for ( int i = 0 ; i < n; i++)
arr[i] = ob.nextInt();
sorted_array(arr,n);
System.out.println( "The desired array to be shown is:" );
int c= 0 ,c1=n- 1 ;
for ( int i= 0 ;i<n;i++)
{
if (i% 2 == 0 )
System.out.println(arr[c1--]);
else
System.out.println(arr[c++]);
}
}
public static void sorted_array ( int arr[], int n){
int temp;
for ( int i= 0 ;i<n;i++)
{
for ( int j = i+ 1 ; j < n;j++)
{
if (arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
}}
