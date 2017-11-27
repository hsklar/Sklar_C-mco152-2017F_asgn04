import java.util.ArrayList;

//returns accurate calculations of both Democrat and Republican popular vote
public class HonestReportPop implements IReportPopularVote{
	public int getPVotesDem(ArrayList<InfoTemp> info){
		int total=0;
		for (InfoTemp e: info)
		{
			total+=e.pVoteDem;
		}
		return total;
	}
	public int getPVotesRep(ArrayList<InfoTemp> info){
		int total=0;
		for (InfoTemp e: info)
		{
			total+=e.pVoteRep;
		}
		return total;
	}

}
