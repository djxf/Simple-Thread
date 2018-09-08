package com.djxf.thread;

public class thread_dome2 {

	public static void main(String[] args) {
		new SaleTicketDome("窗口1").start();
		new SaleTicketDome("窗口2").start();
		new SaleTicketDome("窗口3").start();

	}

}
