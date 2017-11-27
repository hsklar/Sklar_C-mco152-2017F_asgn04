import java.util.ArrayList;

public class HonestReportEle implements IReportElectoralCollege{

	//loops thru the ArrayList and calculates the accurate total of the Democrat vote
	public int getEVotesDem(ArrayList<InfoTemp> info){
		int total=0;
		for (InfoTemp e: info)
		{
			if(e.pVoteDem>e.pVoteRep)
				total+=e.eVote;
		}
		return total;
	}
	//loops thru the ArrayList and calculates the accurate total of the Republican vote
	public int getEVotesRep(ArrayList<InfoTemp> info){
		int total=0;
		for (InfoTemp e: info)
		{
			if(e.pVoteRep>e.pVoteDem)
				total+=e.eVote;
		}
		return total;
	}


}
