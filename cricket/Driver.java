package cricket;

public class Driver {
	public static void main(String[] args) {
		Scoreboard sb = new Scoreboard();
		sb.toss();
		System.out.println("TEAM :" + sb.tbat.Teamname);
		int t1score = sb.score(sb.tbat);
		System.out.println();
		System.out.println("Total Score : " + t1score);
		System.out.println();
		System.out
				.println("Match Status : " + sb.tball.Teamname + " needs " + (t1score + 1) + " runs to win the match");
		System.out.println();
		System.out.println("TEAM : " + sb.tball.Teamname);
		int t2score = sb.score(sb.tball);
		System.out.println();
		System.out.println("Total Score : " + t2score);
		System.out.println();
		if (t1score > t2score)
			System.out.print("Match Status : " + sb.tbat.Teamname + "  won the match");
		else if (t2score > t1score)
			System.out.print("Match Status : " + sb.tball.Teamname + "  won the match");
		else
			System.out.print("The match is tie between both the teams");

	}

}