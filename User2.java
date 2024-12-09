package synchronization_program;

public class User2 extends Thread{
	String name;
	IRCTC it;
	User2(String name, IRCTC it){
		this.name=name;
		this.it=it;
	}
	public void run() {
		it.bookTicket();
	}

}
