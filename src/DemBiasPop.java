import java.util.ArrayList;
public class DemBiasPop implements IReportPopularVote{


	//receives an array of info. Finds the array with the highest Rep. vote and ignores it by setting it to 0

	public int getPVotesRep(ArrayList<InfoTemp> info){
		int max=0;
		for (int i=0; i<info.size();i++){
			if (info.get(i).pVoteRep>max){
				max=info.get(i).pVoteRep;
			}
		}
		int total=0;
		for (InfoTemp e: info)
		{
			if (e.pVoteRep==max){
				
			}
			else
			total+=e.pVoteRep;	
			}
		return total;	
	}

	public int getPVotesDem(ArrayList<InfoTemp> info){
		int total=0;
		for (InfoTemp e: info)
		{
			total+=e.pVoteDem;
		}
		return total;
	}
}
