import java.util.*;
public class Sum_of_first_n_numbers {
public static void main (String []args){
System.out.print( "Enter the number :" );
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
int res = 0 ;
res = res + n*(n+ 1 )/ 2 ;
System.out.println(res);
}
}
