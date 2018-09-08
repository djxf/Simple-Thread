package com.djxf.thread;

public class thread_dome5 {

	public static void main(String[] args) {
		
		 new Thread() {
			@Override
			public void run() {
				 System.out.println(getName()+"匿名内部类使用多线程");
			}
			 
		 }.start();
		 new MyThread().start();
		 System.out.println(Thread.currentThread().getName()+"主线程");
	}
}

//传统使用线程方式
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+"传统使用线程方式");
	}
}
