import java.util.*;
public class Odd_numbers {
public static void main (String []args){
System.out.println( "All odd numbers divisible by 5 from the range of
integers 200 to 800. are: " );
for ( int i = 200 ; i<= 800 ; i++){
if (((i% 5 ) == 0 ) && ((i% 2 )!= 0 )){
System.out.println(i);
}
}
}
}
