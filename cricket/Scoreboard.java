package cricket;

import java.util.Random;

public class Scoreboard {

	Random rand = new Random();
	Team tbat, tball;
	Match m = new Match();
	int overs = 20;
	Batsman b = new Batsman();

	public int score(Team t) {
		int totscore = 0;
		int i = 0;
		while (b.getBalls() <= overs * 6 && b.getWickets() < 10 && i <= 10) {
			t.run[i] = b.bruns();
			System.out.println(t.player[i] + " - " + t.run[i]);
			i++;
		}
		for (int j = 0; j <= 10; j++) {
			totscore = totscore + t.run[j];
		}
		return totscore;

	}

	public void toss() {
		int t = rand.nextInt(2);
		if (t == 1) {
			System.out.println("INDIA WON THE TOSS");
			System.out.println();
			tbat = m.t1;
			tball = m.t2;
		} else {
			System.out.println("SRI LANKA WON THE TOSS");
			System.out.println();
			tbat = m.t2;
			tball = m.t1;

		}
	}

}
