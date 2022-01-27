package program.java.oops;

public class Encaps {

	 private int age;
	 private String name;
	 private int deptNo;
		
		
		
		
		
		public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getDeptNo() {
		return deptNo;
	}





	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}





		public static void main(String[] args) {
			Encaps obj =new Encaps();
			obj.setName("Harsh"); 
	        obj.setAge(19); 
	        obj.setDeptNo(51); 
	        System.out.println("My name: " + obj.getName()); 
	        System.out.println("My age: " + obj.getAge()); 
	        System.out.println("My roll: " + obj.getDeptNo());      


		}

	}

