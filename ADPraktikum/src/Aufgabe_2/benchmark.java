package Aufgabe_2;

import java.util.concurrent.TimeUnit;

import Aufgabe_1.Puffer;

public class benchmark {

	public static void main(String[] args) {
		int maxPufferSize = 1000000;
		Puffer testPuffer;

		testPuffer = new ArrayPuffer(maxPufferSize);
		benchmarkPuffer(testPuffer, maxPufferSize);

		testPuffer = new LinkedListPuffer(maxPufferSize);
		benchmarkPuffer(testPuffer, maxPufferSize);

	}

	private static void benchmarkPuffer(Puffer puffer, int maxPufferSize) {
		long start = System.nanoTime();

		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < maxPufferSize; i++)
				puffer.push("" + i);
			// String val;
			for (int i = 0; i < maxPufferSize; i++) {
				puffer.pop();
				// val = puffer.pop();
				// if (!val.equals("" + i))
				// System.out.println(val + " - " + i);
			}

		}

		long end = System.nanoTime();
		long runningTime = end - start;

		System.out.println(TimeUnit.MILLISECONDS.convert(runningTime, TimeUnit.NANOSECONDS));
	}

}
