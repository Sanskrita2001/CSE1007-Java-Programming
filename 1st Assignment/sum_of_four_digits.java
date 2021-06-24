import java.util.*;
public class sum_of_four_digits {
static int sum ( int n){
int sum = 0 ;
for (;n> 0 ;n/= 10 ){
sum = sum + (n% 10 );
}
return sum;
}
public static void main (String []args){
Scanner ob = new Scanner(System.in);
System.out.println( "Enter a four digit number :" );
int num = ob.nextInt();
System.out.println( "Sum of digits of " +num+ " is : " +sum(num));
}
}
