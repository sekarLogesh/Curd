package Exp_Coading;

public class DeadLock {

	public static void main(String[] args) {

		String val="value";
		String val2 = "value2";
		
		
		Thread t1= new Thread(
				()->{
					synchronized (val) {
						try {
							Thread.sleep(100);
							System.out.println("value");

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						synchronized (val2) {
							System.out.println("value2");
							
						}
						
					}
				}
				
				
				);
		
		
		
		
		
		
		
		
	}

}
