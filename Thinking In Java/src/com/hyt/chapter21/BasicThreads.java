package com.hyt.chapter21;

/**
 * 启动新线程调用
 * 
 * @author wangwen
 *
 * 2017-5-10下午04:29:57
 */
public class BasicThreads {

	public static void main(String[] args) {
		//启动新线程t来启动任务，main线程会继续执行(main与t同时执行)
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for liftOff");
	}
	
}
