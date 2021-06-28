
public class User {
	private int age;

	public int getAge() {
		return age;
	}
	// called code (called in main method)
	public void setAge(int a) throws AgeException {
		if(a<18) {
			throw new AgeException("age cannot be less than 18");
		} else {
		age = a;
		}
	}
	
	// calling code
	public static void main(String[] args) {
		User user = new User();
		try {
			user.setAge(17);	// shouldn't accept age < 18
		} catch (AgeException e) {
			
			e.printStackTrace();
		}  
		System.out.println(user.getAge());
	}
}
