import java.util.*;
public class arithmetic_operation {
public static void main (String[] args) {
System.out.print( "Enter two numbers: " );
Scanner obj = new Scanner(System.in);
int a = obj.nextInt();
int b = obj.nextInt();
int sum = a + b;
int difference = a - b;
int product = a * b;
int quotient = a/b;
System.out.println( "Sum of " +a+ " and " +b+ " is " + sum);
System.out.println( "Difference of " +a+ " and " +b+ " is " +
difference);
System.out.println( "Product of " +a+ " and " +b+ " is " + product);
System.out.println( "Quotient of " +a+ " and " +b+ " is " + quotient);
}
}
