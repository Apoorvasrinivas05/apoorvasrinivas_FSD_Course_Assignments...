package program.java.accessmodifiers;

public class Test2 {
        protected long h =432;
        
        public int x= 20;
        
        double pi = 56744;
        
        public void methodPublic(){     // public method
			methodPrivate();
		}
		
		protected void methodProtected(){   // protected method
			methodPrivate();
		}
		
		void methodDefault(){    //default method
			methodPrivate();
		}
		
		private void methodPrivate(){     // private method
			System.out.println("Class Test2: methodProtected");
			System.out.println("Value of public valye x"+ x);
			System.out.println("Value of long"+ h);
			System.out.println("value of double"+ pi);
		}
		

	

}
