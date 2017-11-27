import java.util.ArrayList;

public class DemBiasEle1 implements IReportElectoralCollege{

	@Override
	public int getEVotesDem(ArrayList<InfoTemp> copy) {
		//changes the data to switch 2% of Republican popular votes to Democrat then calculates
		//the total of the democrat vote
		int twoPercent=0;
		int total=0;
		for (InfoTemp e: copy){
			twoPercent=(int)(e.pVoteRep*.02);
			e.pVoteRep-=twoPercent;
			e.pVoteDem+=twoPercent;
			if (e.pVoteDem>e.pVoteRep){
				total+=e.eVote;
			}
		}
		return total; 
	}

	@Override
	public int getEVotesRep(ArrayList<InfoTemp> copy) {
		//changes the data to switch 2% of Republican popular votes to Democrat then calculates 
		//the total of the Republican Electoral votes
		int twoPercent=0;
		int total=0;
		for (InfoTemp e: copy){
			twoPercent=(int)(e.pVoteRep*.02);
			e.pVoteRep-=twoPercent;
			e.pVoteDem+=twoPercent;
			if (e.pVoteRep>e.pVoteDem){
				total+=e.eVote;
			}
		}
		return total; 
	}
}
