package genericLibraries;

import java.time.LocalDateTime;

public class Time {

	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		String t = time.toString().replace(":", "-");
		System.out.println(t);

	}

}
