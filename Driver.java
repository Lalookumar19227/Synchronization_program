package synchronization_program;

public class Driver {
	public static void main(String[] args) {
		IRCTC it=new IRCTC();
		
		User1 x=new User1("Mohan", it);
		User2 y=new User2("Sohan", it);
		User3 z=new User3("Rohan", it);
		
		x.start();
		y.start();
		z.start();
	}

}
