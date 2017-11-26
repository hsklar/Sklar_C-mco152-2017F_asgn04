import java.util.ArrayList;
public class Program {
	public static void main (String[] args){

		ElectionsInfo election = new ElectionsInfo();
		HonestReporter display1 = new HonestReporter(election);
		ProRepublicanReporter display2=new ProRepublicanReporter(election);
		ProDemocratReporter display3 = new ProDemocratReporter(election);
		HalfandHalfReporter display4=new HalfandHalfReporter(election);
		ProDemocratPartial display5= new ProDemocratPartial(election);

		election.setVotes(States.OHIO, 19854, 17411);
		election.setVotes(States.GEORGIA, 17233, 15412);
		election.setVotes(States.TEXAS, 34908, 38103);
		election.setVotes(States.PENNSYLVANIA, 20456, 21009);
		election.setVotes(States.FLORIDA, 28567, 25896);
		
		ArrayList<InfoTemp> list=display1.getInfo();
		
		System.out.println("These are the final stats for each of the states according to the most accurate reporter:\n");
		System.out.printf("               Dem.   Rep.    Electoral%n");
		for (InfoTemp e: list)
			 System.out.printf("%13s %6d %6d %4d %n",e.getState(),e.getpVoteDem(), e.getpVoteRep(), e.geteVote());
	}

}

