package cricket;

public class Team {

	String Teamname;
	String[] player = new String[11];
	int run[] = new int[11];

	Team(String n, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9,
			String s10, String s11) {
		Teamname = n;
		player[0] = new String(s1);
		player[1] = new String(s2);
		player[2] = new String(s3);
		player[3] = new String(s4);
		player[4] = new String(s5);
		player[5] = new String(s6);
		player[6] = new String(s7);
		player[7] = new String(s8);
		player[8] = new String(s9);
		player[9] = new String(s10);
		player[10] = new String(s11);

	}

}
