package com.djxf.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class thread_dome8 {
	public static void main(String[] args) {
		TicketTask ticketTask = new TicketTask();
		new Thread(ticketTask,"窗口1").start();
		new Thread(ticketTask,"窗口2").start();
		new Thread(ticketTask,"窗口3").start();
	}
}
//通过继承Runnable实现多线程如果使用同步方法，将会只有一个线程进入导致效率很低
class TicketTask implements Runnable{
	public  int ticket = 10;
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		while(true) {
			lock.lock();
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"-正在卖票"+ticket);
				ticket--;
			}else {
				break;
			}
			lock.unlock();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    }
		}
	}

