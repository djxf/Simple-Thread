package com.djxf.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPool_1 {
		public static void main(String[] args) {
			//newCachedThreadPool 
			ExecutorService threadpool = Executors.newCachedThreadPool();
			threadpool.execute(new Runnable() {
				@Override
				public void run() {
					 System.out.println(Thread.currentThread().getName()+"-正在执行");
				}
			});
			System.out.println(Thread.currentThread().getName()+"-正在执行");
		}
}
