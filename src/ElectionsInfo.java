import java.util.Observable;
import java.time.LocalTime;

public class ElectionsInfo extends Observable{

	private States state;
	private int pVoteDem;
	private int pVoteRep;
	private int eVote;
	private String legalMessage;

	public ElectionsInfo(){

	}
	// Object to use for pushing the information

	public void moreVotes () 
	{
		setChanged();
		notifyObservers(new InfoTemp(pVoteDem, pVoteRep, eVote, state, legalMessage));
	}

	public void setVotes (States state, int pVoteDem, int pVoteRep)
	{
		this.state = state;
		this.pVoteDem = pVoteDem;
		this.pVoteRep = pVoteRep;
		this.eVote= state.getElectoralVotes();
		this.legalMessage="All reports are purely observational and not legally binding in any way "+LocalTime.now();
		moreVotes();
	}


}
