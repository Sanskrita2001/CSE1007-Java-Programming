import java.util.*;
public class MethodOverloading
{
public static void sum ( int a[][])
{
int add = 0 ;
for ( int [] arr1D : a)
{
for ( int i : arr1D)
{
add += i;
}
}
System.out.println( "Addition of elements of integer double array:
" +add);
}
public static void sum ( float a[][])
{
float add = 0 ;
for ( float [] arr1D : a)
{
for ( float i : arr1D)
{
add += i;
}
}
System.out.println( "Addition of elements of float double array:
" +add);
}
public static void main (String[] args) {
Scanner ob = new Scanner(System.in);
System.out.println( "Enter number of rows:" );
int r = ob.nextInt();
System.out.println( "Enter number of cols:" );
int c = ob.nextInt();
int a[][] = new int [r][c];
float f[][] = new float [r][c];
System.out.println( "Enter elements of integer double array:" );
for ( int i = 0 ; i<r; i++ )
{for ( int j= 0 ; j<c ;j++ )
{
a[i][j]=ob.nextInt();
}
}
System.out.println( "Enter elements of float double array:" );
for ( int i = 0 ; i<r; i++ )
{
for ( int j= 0 ; j<c ;j++ )
{
f[i][j]=ob.nextFloat();
}
}
sum(a);
sum(f);
}
}
