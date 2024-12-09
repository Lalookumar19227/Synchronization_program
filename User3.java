package synchronization_program;

public class User3 extends Thread{
	String name;
	IRCTC it;
	User3(String name, IRCTC it){
		this.name=name;
		this.it=it;
	}
	public void run() {
		it.bookTicket();
	}

}
