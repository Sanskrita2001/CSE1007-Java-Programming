import java.util.*;
public class sum_first_last {
static int sum ( int n){
int sum = (n% 10 )+(n/ 1000 );
return sum;
}
public static void main (String []args){
Scanner ob = new Scanner(System.in);
System.out.println( "Enter a four digit number :" );
int num = ob.nextInt();
System.out.println( "Sum of first and last digit of " +num+ " is :
" +sum(num));
}
}
