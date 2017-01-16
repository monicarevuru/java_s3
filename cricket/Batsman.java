package cricket;

import java.util.Random;

public class Batsman {

	Random rand = new Random();
	int r = 0, wickets = 0, balls = 0;
	int max = 6, min = 0;

	public int bruns() {
		int runsscored = 0;
		do {
			r = rand.nextInt(6);
			balls++;
			runsscored = runsscored + r;

		} while (r == 0);
		if (r == 0) {
			wickets++;
		}
		return runsscored;

	}

	public int getWickets() {
		return wickets;
	}

	public int getBalls() {
		return balls;
	}

}