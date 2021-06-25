import java.util.Scanner;
public class Employee {
int empid;
String name;
float salary;
public void getInput () {
Scanner in = new Scanner(System.in);
System.out.print( "Enter the empid : " );
empid = in.nextInt();
System.out.print( "Enter the name : " );
name = in.next();
System.out.print( "Enter the salary : " );
salary = in.nextFloat();
}
public void display () {
if (salary < 100000 ){
System.out.println( "Employee id = " + empid);
System.out.println( "Employee name = " + name);
}
}
public static void main (String[] args){
Employee e[] = new Employee[ 3 ];
for ( int i= 0 ; i< 3 ; i++) {
e[i] = new Employee();
e[i].getInput();
}
System.out.println( "**** Names and Employee IDs of Employess less than
100000 ****" );
for ( int i= 0 ; i< 3 ; i++) {
e[i].display();
  }
}
}
