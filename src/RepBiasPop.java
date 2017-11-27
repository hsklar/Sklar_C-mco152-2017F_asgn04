import java.util.ArrayList;
public class RepBiasPop implements IReportPopularVote{

	//Reports 5% less of the total Democrat popular vote
	public int getPVotesDem(ArrayList<InfoTemp> info){
		int total=0;
		for (InfoTemp e: info){
			double d=e.pVoteDem*.95;
			total+=(int)d;
		}
		return total;
	}
	
	//calculates the total Republican popular vote accurately
	public int getPVotesRep(ArrayList<InfoTemp> info){
		int total=0;
		for (InfoTemp e: info)
		{
			total+=e.pVoteRep;
		}
		return total;
	}

}
