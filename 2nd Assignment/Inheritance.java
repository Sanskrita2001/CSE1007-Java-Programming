import java.util.*;
class Student {
int reg;
String name;
}
class Exam extends Student {
int marks[] = new int [ 6 ];
}
class Result extends Exam {
int total= 0 ;
Result( int regno,String Name, int m[]){
reg=regno;
name=Name;
for ( int i= 0 ;i< 6 ;i++)
marks[i]=m[i];
}
public void calculate ()
{
for ( int i = 0 ; i< 6 ;i++)
total+=marks[i];
}
public void displayResult (){
System.out.println( "Reg no: " +reg);
System.out.println( "Name: " +name);
System.out.println( "Total marks: " +total);
}
}
class Inheritance {
public static void main (String args[])
{
int marks[] = new int [ 6 ];
Scanner sc = new Scanner(System.in);
System.out.println( "Enter reg no: " );
int regno = sc.nextInt();
System.out.println( "Enter name: " );
String Name = sc.next();
System.out.println( "Enter marks: " );
for ( int i = 0 ; i< 6 ;i++)
marks[i]= sc.nextInt();
Student s = new Student();
Exam e = new Exam();
Result r = new Result(regno, Name, marks);
r.calculate();
r.displayResult();
}
}
