import java.util.*;
public class Fibonacci_Series {
static int fibonacci ( int n){
if (n== 0 )
return 0 ;
else if (n== 1 )
return 1 ;
else
return (fibonacci(n- 1 ))+(fibonacci(n- 2 ));
}
public static void main (String []args){
Scanner ob = new Scanner(System.in);
System.out.print( "Enter a number:" );
int n = ob.nextInt();
System.out.println( "Fibonacci series :" );
for ( int i= 0 ;i<n;i++){
System.out.print(fibonacci(i)+ " " );
}
}
}
