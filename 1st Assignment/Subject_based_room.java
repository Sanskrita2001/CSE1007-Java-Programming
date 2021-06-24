import java.util.*;
public class Subject_based_room {
public static void main (String []args){
System.out.print( "Enter room number: " );
Scanner ob = new Scanner(System.in);
int rno= ob.nextInt();
switch (rno){
case 604 : System.out.println( "Subject Name: Java Programming" );
break ;
case 605 : System.out.println( "Subject Name: Python Programming" );
break ;
default : System.out.println( "Invalid input" );
}
}
}
