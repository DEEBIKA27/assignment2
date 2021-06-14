
public class Methods {

	public static void main(String[] args) {
		
		System.out.println("The result is " + add(4,5));
		PrintText();
		System.out.println("Hello " + appendstring("Deebika"));
		nothing();
		
	}
	
		// method returns integer 
		private static int add(int a, int b) {
			
			return  a + b;
	}
	
		// method returns void 
		private static void PrintText() {
			
			System.out.println("Return nothing");
	}
		
		// method return string
		private static String appendstring(String a) {
			
			return  a;
	}
	
		// method returns null
		private static Integer nothing() {
			
			return null;
	}
		
		
		

}
