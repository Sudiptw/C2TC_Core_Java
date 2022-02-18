package technoServe;

class MyThread extends Thread{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Child thread");
		}
	}
}

public class Threaddemo {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.start();
		System.out.println("*************");
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
	
}
