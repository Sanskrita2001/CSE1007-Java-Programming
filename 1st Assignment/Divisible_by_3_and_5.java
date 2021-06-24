import java.util.*;
public class Divisible_by_3_and_5 {
public static void main (String []args){
System.out.print( "Enter a number :" );
Scanner ob = new Scanner(System.in);
int n = ob.nextInt();
if ((n% 3 == 0 ) && (n% 5 == 0 ))
System.out.println(n + " is divisible by 3 and 5" );
else
System.out.println(n + " is not divisible by 3 and 5" );
}
}
