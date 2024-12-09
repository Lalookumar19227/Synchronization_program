package synchronization_program;

public class User1 extends Thread{
	String name;
	IRCTC it;
	User1(String name, IRCTC it){
		this.name=name;
		this.it=it;
	}
	public void run() {
		it.bookTicket();
	}

}
