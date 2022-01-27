package program.java.accessmodifiers;

public class Test3 {

	public static void main(String[] args){
			new Test1().methodPublic();
			new Test1().methodProtected();
			new Test1().methodDefault(); 
			new Test2().methodPublic();
			new Test2().methodProtected();
			new Test2().methodDefault(); 
			System.out.println("Value of long"+ new Test1().k);	
			System.out.println("Value of long"+ new Test2().h);	
			
		}

		public void methodPublic() {
			System.out.println("Class Test3: methodPublic");
		}

		protected void methodProtected() {
			System.out.println("Class Test3: methodProtected");
			
		}

		void methodDefault() {
			System.out.println("Class Test3: methodDefault");
		}
        
		private void methodPrivate() {
			System.out.println("Class Test3: methodPrivate");
		}

	}



