package core.programs;

public class DataTypeProgram {

	public static void main(String[] args) {
	
        boolean status = true;
        System.out.println("iam printing status" + status );
        char gender = 'M';
        System.out.println("iam printing gender" + gender );
        int age = 45;
        System.out.println("iam printing age" + age );
        long distance = 56456468564346535L;
        System.out.println("iam printing distance" + distance);
        float percentage = 56.89f;
        System.out.println("iam printing percentage" + percentage);
        double pi = 3.1498879789789868;
        System.out.println("iam printing pi" + pi);
      
        int i = 100;
        long l = i;
        System.out.println("long value" + i);
        
        int o =(int) l;
        System.out.println("int value" + o);
        
        char t = (char) i;
        System.out.println("char value" + t);
        
        double d =1906767489768480.674897648993547;
        float r = (float)d;
        System.out.println("float value" + r);
        System.out.println("double value" + d);
        
        double d2 =144575786745654.00006765456;
        long l2 = (long)d2;
        int i2 =(int)l2;
        System.out.println("double value" + d2);
        System.out.println("long value" + l2);
        System.out.println("int value" + i2);
        
        float f = l;
        System.out.println("double value" + f);
        
        byte b;
        int ii = 257;
        double dd = 323.142;
        System.out.println("coversion of int to byte_");
        b = (byte) ii;
        System.out.println("ii = " + ii + "b = " + b);
        
        System.out.println("\nconversion of double to byte_");
        
        b =(byte) dd;
        System.out.println("dd = " + dd + "b = " + b);
        
        

        



	}

}
