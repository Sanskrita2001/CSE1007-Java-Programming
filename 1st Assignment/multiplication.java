import java.util.*;
public class multiplication {
public static void main (String []args){
Scanner sc = new Scanner(System.in);
System.out.println( "Enter two numbers: " );
int a = sc.nextInt();
int b = sc.nextInt();
int res = multi(a, b);
System.out.println( "Multiplication of two numbers is :" +res);
}
static int multi ( int a, int b){
int mul = 0 ;
for ( int i = 0 ; i<b; i++){
mul = mul + a;
}
return mul;
}
}
