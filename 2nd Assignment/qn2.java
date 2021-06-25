import java.util.*;
class qn2 { 

	public static void main(String args[]) 
	{ 
		Student[] arr; 

		System.out.println("Enter n no. of students: ");
	 	Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		arr = new Student[n]; 
		for(int i =0; i<n; i++)
		{
			System.out.println("Enter details of Students :"+(i+1));
			System.out.println("Enter id: ");
			int id = ob.nextInt();
			System.out.println("Enter name: ");
			String name = ob.next();
			System.out.println("Enter cgpa: ");
			float cgpa = ob.nextFloat();
			System.out.println("Enter Programme_name: ");
			String Programme_name = ob.next();
			System.out.println("Enter School_name: ");
			String School_name = ob.next();
			System.out.println("Enter Proctor_name: ");
			String Proctor_Name = ob.next();
			arr[i]= new Student(id,name,cgpa,Programme_name,School_name,Proctor_Name);
		}
		//arr[0] = new Student(19BCB0059, "Sanskrita", "9.4f", "BCB", "SCOPE", "Paliviniel k"); 
		//arr[1] = new Student(1701289219, "Omm Prasad"); 
		//System.out.println("Student data in student arr 0: "); 
		//arr[0].display(); 
		//System.out.println("Student data in student arr 1: "); 
		//arr[1].display();
		for(int i =0; i<n ; i++ )
		{
			System.out.println("Student data in student arr "+(i+1)+": ");
			arr[i].display(); 
		}
	} 
} 


class Student { 

	public int id; 
	public String name; 
	public float cgpa;
	public String Programme_name;
	public String School_name;
	public String Proctor_Name;
	Student(int id, String name, float cgpa, String Programme_name, String School_name, String Proctor_Name) 
	{ 
		this.id = id; 
		this.name = name; 
		this.cgpa = cgpa;
		this.Programme_name = Programme_name;
		this.School_name = School_name;
		this.Proctor_Name = Proctor_Name;
	} 

	public void display() 
	{ 
		System.out.println("Student id is: " + id );
		System.out.println("Student name is: "+ name); 
		System.out.println("Student CGPA is: "+ cgpa);
		System.out.println("Student Programme_name is: "+ Programme_name);
		System.out.println("Student School_name is: "+ School_name);
		System.out.println("Student Proctor_Name is: "+ Proctor_Name);
		System.out.println(); 
	} 
}
