import java.util.ArrayList;

public class RepBiasEle1 implements IReportElectoralCollege{

	//takes one state and has it always vote Republican. Otherwise it calculate the total
	//electoral votes for all other states accurately.
	public int getEVotesDem(ArrayList <InfoTemp> info){
		int total=0;
		for (InfoTemp i: info){
			if (i.state==States.OHIO){

			}
			else{
				if (i.pVoteDem > i.pVoteRep){
					total+=i.eVote;
				}
			}
		}
		return total;
	}
	public int getEVotesRep(ArrayList <InfoTemp> info){
		int total=0;
		for (InfoTemp i: info){
			if (i.state==States.OHIO){
				total+=i.eVote;
			}
			else{
				if (i.pVoteRep > i.pVoteDem){
					total+=i.eVote;
				}
			}
		}
		return total;
	}
}
