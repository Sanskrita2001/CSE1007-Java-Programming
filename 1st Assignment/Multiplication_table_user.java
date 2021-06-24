import java.util.*;
public class Multiplication_table_user {
public static void main (String []args){
System.out.print( "Enter the number: " );
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
int res = 1 ;
for ( int i = 1 ; i<= 10 ; i++){
res = n * i;
System.out.println(n + " X " + i + " = " + res+ " " );
}
}
}
