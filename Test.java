package League;

public class Test { // this is your project test class
	public static void main(String[] args) { // this is main function
		LeagueInformation li=new LeagueInformation("Fenerbahçe", "YellowCanarias", "1907"); // this is new object from li class
		TeamInformation ti=new TeamInformation("Fenerbahçe", "YellowCanarias", "1907", "Arda Güler", "Left", 10, 17, 65, 175);
		PlayerInformation pi=new PlayerInformation(null, null, null, null, null, 0, 0, 0, 0, null, null, 0, 0, 0, false, false, false);
		System.out.println(li.getName()); // you can control your class is running
		System.out.println(ti.getPlayerName());
		System.out.println(pi.getAge());
		System.out.println(li); } } // close your class and main function