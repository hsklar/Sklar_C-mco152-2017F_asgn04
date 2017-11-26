import java.util.ArrayList;

public class RepBiasEle2 implements IReportElectoralCollege{
	private int demVotes;
	private int repVotes;

	public RepBiasEle2(){
		this.demVotes=0;
		this.repVotes=0;
	}
	private void changeData(ArrayList<InfoTemp> copy){
		
		//First find the state with the closest difference
		demVotes=0;
		repVotes=0;
		int diff= 100000000;
		States minDiffState=null;
		for (InfoTemp i: copy){
			if (i.pVoteDem > i.pVoteRep){
				if ((i.pVoteDem-i.pVoteRep)<diff){
					diff=i.pVoteDem-i.pVoteRep;
					minDiffState=i.state;
				}
			}
		}
		//Now split the amount of electoral votes for that state
		for (InfoTemp i: copy){
			if (i.state.compareTo(minDiffState)==0){
				demVotes+= (i.eVote/2);
				repVotes+= ((i.eVote+1)/2);
			}
			else if (i.pVoteDem>i.pVoteRep){
				demVotes+=i.eVote;
			}
			else{
				repVotes+=i.eVote;
			}
		}
	}

	@Override
	public int getEVotesDem(ArrayList<InfoTemp> copy) {
		changeData(copy);
		return demVotes;
	}

	@Override
	public int getEVotesRep(ArrayList<InfoTemp> copy) {
		changeData(copy);
		return repVotes;
	}

}
