package com.djxf.thread;

public class SaleTicketDome extends Thread {
	public static int ticket = 100;
	public SaleTicketDome(String threadname) {
		super(threadname);
	}
	@Override
	public void run() {
		
		while(true) {
		synchronized (Object.class) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");
				ticket--;
			}else {
				System.out.println("票已经卖完！");
				break;
			}
		}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
