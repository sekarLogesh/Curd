package BasicCoadingPratices;


public class DeadLock  {
	 static public class A{};
	 static	public class B{};

	

	public static void main(String[] args) {
		A aa= new A();
		B b = new B();
		
		Thread t1= new Thread(()->{
			synchronized (aa) {
				System.out.println("thread a");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized (b) {
					System.out.println("thread b");
					
				}
				
				
			}
			
		});
		Thread t2= new Thread(()->{
			synchronized (b) {
				System.out.println("thread b");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized (aa) {
					System.out.println("thread a");
					
				}
				
				
			}
			
		});
				

		t1.start();
		t2.start();

		
	}

}
