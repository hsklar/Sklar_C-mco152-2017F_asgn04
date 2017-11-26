import java.util.ArrayList;
public class DemBiasEle2 implements IReportElectoralCollege{
	
	private int demVotes;
	private int repVotes;
	
	public DemBiasEle2(){
		this.demVotes=0;
		this.repVotes=0;
	}
	
	//finds the state with the most electoral votes
	public void changeData(ArrayList<InfoTemp> copy){
		this.demVotes=0;
		this.repVotes=0;
		int maxVotes=0;
		States maxState=null;
		for (InfoTemp e: copy){
			if(e.eVote>maxVotes){
				maxVotes=e.eVote;
				maxState=e.state;
			}
		}
		for (InfoTemp e: copy){
			if (e.state.compareTo(maxState)==0){
				demVotes+=e.eVote;
			}
			else{
				if (e.pVoteDem>e.pVoteRep){
					demVotes+=e.eVote;
				}
				else {
					repVotes+=e.eVote;
				}
			}
		}
	}
	
	public int getEVotesDem(ArrayList<InfoTemp>copy){
		this.changeData(copy);
		return demVotes;
	}
	public int getEVotesRep(ArrayList<InfoTemp> copy){
		this.changeData(copy);
		return repVotes;
	}
}