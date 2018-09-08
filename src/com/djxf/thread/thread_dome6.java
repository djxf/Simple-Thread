package com.djxf.thread;

public class thread_dome6 {

	public static void main(String[] args) {
		 MyRunnable2 myRunnable = new MyRunnable2();
		 new Thread(myRunnable).start();
		 new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"匿名内部类创建线程");
			}
		 }).start();
		 System.out.println(Thread.currentThread().getName()+"over");
	}
}

//通过实现Runnable，创建线程传统方式2
class MyRunnable2 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-传统线程方式");
	}
}
