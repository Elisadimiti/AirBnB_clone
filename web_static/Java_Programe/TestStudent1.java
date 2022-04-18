//TestStudent1.java
class Student{
	//declare instance variables
	int id;
	String name;
	String course;
	int year;
	String dept;
	String fac;
}

class TestStudent1{
	public static void main(String[] args){
		//create a new student
		Student s1 = new Student();
		//assign values - initialize the object
		s1.id = 101;
		s1.name = "Patrick Odoi";
		s1.course = "DGK";
		s1.dept = "Computer Science";
		s1.fac = "Science";
		System.out.println("Welcome to the Students Database:");
		//accessing the members and displaying results
		System.out.println("Student #1 Details:");
		System.out.println("ID: " + s1.id);
		System.out.println("Name: " + s1.name);
		System.out.println("Course: " + s1.course);
		System.out.println("Department: " + s1.dept);
		System.out.println("Faculty: " + s1.fac);
		
		//Create another student
		Student s2 = new Student();
		s2.id = 102;
		s2.name = "Winnifred Apiyo";
		s2.course = "DGK";
		s2.dept = "Computer Science";
		s2.fac = "Science";
		System.out.println("Student #2 Details:");
		System.out.println("ID: " + s2.id);
		System.out.println("Name: " + s2.name);
		System.out.println("Course: " + s2.course);
		System.out.println("Department: " + s2.dept);
		System.out.println("Faculty: " + s2.fac);
		
		//Another student
		Student s3 = new Student();
		s3.id = 103;
		s3.name = "Elisa Hezekiah";
		s3.course = "DGK";
		s3.dept = "Computer Science";
		s3.fac = "Science";
		System.out.println("Student #3 Details:");
		System.out.println("ID: " + s3.id);
		System.out.println("Name: " + s3.name);
		System.out.println("Course: " + s3.course);
		System.out.println("Department: " + s3.dept);
		System.out.println("Faculty: " + s3.fac);

        //Another Student
        Student s4 = new Student();
        s4.id = 104;
        s4.name = "Ojok Simon";
        s4.course = "BCS";
        s4.dept = "Computer Science";
        s4.fac = "Science";
        System.out.println("Student #4 Details:");
        System.out.println("ID: " + s4.id);
        System.out.println("Name: " + s4.name);
        System.out.println("Course: " + s4.course);
        System.out.println("Depart: " + s4.dept);
        System.out.println("Faculty: " + s4.fac);
	}
}