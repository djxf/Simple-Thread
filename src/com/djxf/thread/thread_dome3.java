package com.djxf.thread;

public class thread_dome3 {

	public static void main(String[] args) {
		  new EnterTrain("1").start();
		  new EnterTrain("2").start();
		  new EnterTrain("3").start();
		  new EnterTrain("4").start();
		  new EnterTrain("5").start();
		  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  
		 new EnterTrain("admin").setOpen(true);
	}
}

class EnterTrain extends Thread{
	public EnterTrain(String threadName) {
		super(threadName);
	}
	public static boolean isOpen;
	public static void setOpen(boolean b) {
		isOpen = b;
	}
	@Override
	public void run() {
		synchronized (Object.class) {
			if(isOpen) {
				isOpen = false;
				System.out.println(getName()+"进站了，三秒之后放行旅客！");
				
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Object.class.notify();//随机开放一条线程，随机选取一个乘客进站
				//Object.class.notifyAll();//不分先后的让所有乘客放行。
			}else {
				System.out.println(getName()+"进入排队状态");
				try {
					Object.class.wait();
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println(getName()+"进站了");
			}
		}
	}
}