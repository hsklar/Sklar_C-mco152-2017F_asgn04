
public class InfoTemp {


	int pVoteDem;
	int pVoteRep;
	int eVote;
	States state;
	String legalMessage;

	public InfoTemp(int a, int b, int c, States d, String e){
		this.pVoteDem=a;
		this.pVoteRep=b;
		this.eVote=c;
		this.state=d;
		this.legalMessage=e;
	}
	protected States getState() {
		return state;
	}

	protected int getpVoteDem() {
		return pVoteDem;
	}

	protected int getpVoteRep() {
		return pVoteRep;
	}

	protected int geteVote() {
		return eVote;
	}

	protected String getLegalMessage() {
		return legalMessage;
	} 
	public String toString(){
		return state+"   "+pVoteDem+"   "+pVoteRep+"   "+eVote;
	}
}
