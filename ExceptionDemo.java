
public class ExceptionDemo {
	public static void main(String[] args) {
		int a,b,c;
		
		a=10;
		b=0;
		try{
			c=a/b; // exception thrown
			System.out.println("c is " + c);
			
			String str = "hello";
			System.out.println(str.charAt(2));
			
			//Object obj = null;
			//System.out.println(obj.toString()); // this exception handled in generic
			
		}  catch(ArithmeticException | StringIndexOutOfBoundsException  e) {
			e.printStackTrace();
		}
		/*catch(ArithmeticException e) {	//exception handling			
			System.out.println("Value of b cannot be 0");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("invalid string index");
		} */catch (Exception e) {				//generic exception handling
			System.out.println("ERROR");
		} finally {			//to run irrespective of the exception
			System.out.println("Finally block");
		}
	}
}
