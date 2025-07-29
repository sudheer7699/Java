package Day8;

class mul1 extends Thread{
		public void run() {
			for(int i=1;i<=100;i++) {
				System.out.println(" Wipro Training :"+i);		}
		}
	}
	class mul2 extends Thread{
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println(" java Course"+i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

public class MultiThreading1 {
	      public static void main(String[] args) {
	    	  mul1 m1 = new mul1();
	    	 
	    	  mul2 m2 = new mul2();
	    	 // m2.setPriority(Thread.MAX_PRIORITY);
	    	//  System.out.println(m2.getPriority());
	    	  m1.start();
	    	  
	    	  try {
	    		  Thread.sleep(10);
	    	  }catch(InterruptedException e) {
	    		  e.printStackTrace();
	    	  }
	    	  m2.start();
	      }

	}
