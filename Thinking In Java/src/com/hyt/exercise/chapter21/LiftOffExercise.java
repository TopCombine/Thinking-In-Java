package com.hyt.exercise.chapter21;

public class LiftOffExercise implements Runnable {

	private int countDown = 0;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	
	
	public LiftOffExercise() {
		new Thread().start();
	}

	public LiftOffExercise(int countDown) {
		this.countDown = countDown;
	}

	@Override
	public void run() {
		if (countDown++ > 3) {
			System.out.println(countDown);
			Thread.yield();
		}else{
			System.out.println("close");
		}
	}

}
