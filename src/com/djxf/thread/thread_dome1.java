package com.djxf.thread;
/**
 * 
 * @author Administrator
 *
 */
public class thread_dome1 {

	public static void main(String[] args) {
		//然后分配该类的实例，在创建线程实例的时候作为一个参数来传递
		MyRunnable runable = new MyRunnable();
		Thread t = new Thread(runable,"子线程");//构造方法时可以传入一个参数作为子线程的名称
		//如Thread t = new Thread(runable,"子线程");
		t.start();
		System.out.println("over");

	}
	
}

//创建线程的另一种方法是实现Runable类，然后实现run方法
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread());
		}
		
	}
	
}