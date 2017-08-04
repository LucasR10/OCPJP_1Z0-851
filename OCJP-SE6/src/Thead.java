import java.util.ArrayList;

import org.junit.Test;

public class Thead {

	int startHere = 1;
 int endHere = 100;
	   
	@Test
	public void execute() {
		go();
		
		
}

	void go() {
		Runnable r = new Runnable() {

			@Override
			public void run() {

				for (int i = startHere; i <= endHere; i++) {
					System.out.println(i);
				}
			}
		};

	}

}