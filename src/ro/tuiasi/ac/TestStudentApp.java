package ro.tuiasi.ac;

public class TestStudentApp {

	public static void main(String[] args) {
		System.out.println("Main for Student App project");
		//declares a student
		Student s1 = new Student(10,"Popescu","Ionut");
		Student s2 = new Student(10,"Ionescu","Raluca");
		Student s3 = new Student(9,"ANC","Raluca");
		Student s4 = new Student(10,"QWE","Razvan");
		Student s5 = new Student(10,"QWE","Mihai");
		
		System.out.println(s1);
		System.out.println(s4+" "+s5);
		s1.print3();
		s2.print3();
		
		//System.out.println(t1);
		
		System.out.println("Salut 2023");
		
	}

}
