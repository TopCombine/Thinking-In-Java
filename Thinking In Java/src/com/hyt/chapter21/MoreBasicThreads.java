package com.hyt.chapter21;


/**
 * main中添加多个线程去执行任务
 * 
 * @author wangwen
 *
 * 2017-5-10下午04:35:58
 */
public class MoreBasicThreads {

	public static void main(String[] args) {
		//对于结果，每一次都可能不同(线程调度机制)；  对于不同的jdk也可能不同
		for (int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();
		}
		System.out.println("Waiting for LiftOff");
	}
}
