import java.util.*;
public class Add_until_user_exists {
public static void main (String []args){
char ch;
do {
System.out.print( "Enter two numbers: " );
Scanner ob = new Scanner(System.in);
int a= ob.nextInt();
int b= ob.nextInt();
int sum=a+b;
System.out.println( "Sum of " +a+ " and " +b+ " is: " +sum);
System.out.println( "Do you want to continue? Press 'Y' for yes and
'N' for no \nEnter your choice: " );
ch = ob.next().charAt( 0 );
}
while (ch== 'y' || ch== 'Y' );
}
}
