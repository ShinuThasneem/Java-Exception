package java_exceptions;

public class try_catch_method {
	public static void main(String[] args) {
		
		try {
//    code that generate exception
			int divideByZero=5/1;
			System.out.println("Rest of code in try block");

		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException =>"+e.getMessage());
			
		}
		
		System.out.println("Hello Java");
		String a="Helllo";
	
		
//	null pointer exception
		String n=null;
		try {
			System.out.println(n.length());
		}
		catch(NullPointerException e){
			System.out.println("null pointer exception");
		}
		
	}

}
