package fr.dauphine.ja.wormsamir.threads.threads;

/**
 * Hello world!
 *
 */
public class ThreadTest 
{
    
	public static int n = 0;
	public static final Object monitor = new Object();

	// Pas encore assez robuste
	public static Runnable hello(final int id) {
		
		return new Runnable() {

			int nb = id;
			
			public void run() {
			
				boolean flag = false;
				while(true) {
					synchronized (monitor) {
						if(n < 10000) {
							n++;
							flag = true;
						}
						else return;
					}
					if(flag) {
						System.out.println("Je suis le thread " + nb + ", et j'effectue l'itération " + n);
					}
					flag = false;
				}
			}
			
		};
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(ThreadTest.hello(1));
		Thread t2 = new Thread(ThreadTest.hello(2));
		
		t1.start();
		t2.start();
		
	}
	
}
