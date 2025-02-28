package Hooks;

import org.testng.annotations.BeforeTest;

public class Hooks {

	@BeforeTest
	public void delayBeforeTest() {
	    try {
	        long delay = Thread.currentThread().getId() * 3000;
	        System.out.println("Delaying Thread " + Thread.currentThread().getId() + " by " + delay + " ms");
	        Thread.sleep(delay);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

}
