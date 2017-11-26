import java.util.ArrayList;

public class HonestReportEle implements IReportElectoralCollege{

	public int getEVotesDem(ArrayList<InfoTemp> info){
		int total=0;
		for (InfoTemp e: info)
		{
			if(e.pVoteDem>e.pVoteRep)
				total+=e.eVote;
		}
		return total;
	}
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
