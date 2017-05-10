package com.hyt.chapter21;

/**
 * 不由单独的线程驱动，在main中之间调用
 * 
 * @author wangwen
 *
 * 2017-5-10下午04:29:24
 */
public class MainThread {

	public static void main(String[] args) {
		LiftOff launch = new LiftOff();
		launch.run();
	}
	
}
