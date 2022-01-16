package program.java.methods;

public class StudentConstructor {
	
	String name;
	int age;
	char section;
	char gender;
	int subject1;
	int subject2;
	int subject3;
	
	StudentConstructor(String n, int a, char s, char g,int s1,int s2, int s3) {
		name = n;
		age = a;
		section = s;
		gender = g;
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
	}
	public int marks(){
		return subject1+subject2+subject3;
	}
	public float percentage(){
		return (marks()*100)/300;
	}
	public static void main(String[] args){
		StudentConstructor s1 = new StudentConstructor("Yugal", 24,'A','M',77,79,89);
		StudentConstructor s2 = new StudentConstructor("Nikhil", 29,'B','M',0,56,65);
		StudentConstructor s3 = new StudentConstructor("shrey", 21,'A','M',0,89,66);
		StudentConstructor s4 = new StudentConstructor("Gayu", 24,'B','F',79,98,87);
	
		System.out.println("Marks of Student s1 "+ s1.marks() + " percentage of student");
		System.out.println("Marks of Student s2 "+ s2.marks() + " percentage of student");
		System.out.println("Marks of Student s3 "+ s3.marks() + " percentage of student");
		System.out.println("Marks of Student s4 "+ s4.marks() + " percentage of student");
		
	}
	
}
