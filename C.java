public class producer extends Thread{
	
	static final int MAXQUEUE=5;
	private Vector messages = new Vector();
	
	public void run() {
		try {
			while(true) {
				putMessage();
				sleep(1000);
			}
		}catch(InterruptedException e) {}				
	}
	
	private synchronized void putMessage()
	throws InterruptedException {
	while (messages.size() ==MAXQUEUE) {
		wait();
		System.out.println("waiting");		
	}
	messages.addElement(new java.util.Date().toString());
	notify();
	}
	
	public synchronized String getMessage()
			throws InterruptedException {
		while (messages.size() ==0) 
			wait();
		
			try {
				sleep(1000);
			} catch(InterruptedException e) {}
			String message=(String) messages.firstElement();
			messages.removeElement(message);
			notify();
			return message;
					
			}
		}
	
	
public class consumer extends Thread{
	producer producer;
	
	consumer(producer p) {	producer = p ; }
	public void run() {
		try {
			while(true) {
				String message=producer.getMessage();
				System.out.println("got message:"+message);
				sleep(2000);
			}
		}catch (InterruptedException e) {}
	
	}
	public static void main(String args[]) {
		producer producer= new producer();
		producer.start();
		new consumer(producer).start();
		
	}
	
}
