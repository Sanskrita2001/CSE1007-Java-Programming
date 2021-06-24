import java.util.*;
public class Armstrong {
static int isArmstrong ( int n){
int temp = n;
int sum = 0 ;
for (;n> 0 ;n/= 10 ){
sum = sum + (n% 10 )*(n% 10 )*(n% 10 );
}
if (sum == temp){
return 1 ;
}
return 0 ;
}
public static void main (String []args){
Scanner ob = new Scanner(System.in);
System.out.print( "Enter a number:" );
int n = ob.nextInt();
if (isArmstrong(n) == 1 ){
System.out.println(n+ " is armstrong number" );
}
else {
System.out.println(n+ " is not an armstrong number" );
}
}
}
