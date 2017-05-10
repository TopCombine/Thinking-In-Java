package com.hyt.chapter21;


/**
 * 定义任务
 * 
 * @author wangwen
 *
 * 2017-5-10下午03:58:23
 */
public class LiftOff implements Runnable {
	
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public LiftOff() {
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status(){
		return "#"+id+"("+(countDown>0?countDown:"Liftoff!")+").";
	}
	
	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.print(status());
			//将cpu从一个线程转移给另一个线程
			Thread.yield();
		}
	}

}
