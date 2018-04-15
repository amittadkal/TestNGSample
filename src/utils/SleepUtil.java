package utils;

public class SleepUtil {

	public static void waitForSeconds(int i) {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

}
