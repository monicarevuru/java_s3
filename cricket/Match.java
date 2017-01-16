package cricket;

public class Match {
	Team t1, t2;

	Match() {
		t1 = new Team("INDIA", "M.S Dhoni", "Virat Kohli", "Gautham Gambhir", "Sachin Tendulkar", "Virendra Sehwag",
				"Suresh Raina", "Yuvraj Singh", "Haribhajan Singh", "Zaheer Khan", "S Shreesanth", "Munaf Patel");
		t2 = new Team("SRILANKA", "K Sangakkara", "Upul Tharanga", "Tillakaratne Dilshan", "M jayawardene",
				"Thilan Samaraweera", "Chamara Kapugedera", "Nuwan Kulasekara", "Thissara Perera", "Suraj Randiv",
				"Lasith Malinga", "Muttiah Muralitharan");
	}

}