import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class CentralObserver implements Observer{

	private ArrayList <InfoTemp> info;
	private IReportPopularVote popReport;
	private IReportElectoralCollege eleReport;
	private String legalMessage;
	private int pVoteDem;
	private int pVoteRep;
	private int eVote;
	private States state;

	public CentralObserver(Observable observable, IReportPopularVote popReport, IReportElectoralCollege eleReport) {
		observable.addObserver(this);
		this.popReport=popReport;
		this.eleReport=eleReport;
		this.info=new ArrayList<InfoTemp>();
	}

	public void update(Observable observable, Object stateObject)
	{
		if (stateObject instanceof InfoTemp)
		{
			InfoTemp data=(InfoTemp) stateObject;
			this.eVote=data.geteVote();
			this.pVoteDem=data.getpVoteDem();
			this.pVoteRep=data.getpVoteRep();
			this.state=data.getState();
			this.legalMessage=data.getLegalMessage();
			//class InfoTemp is a class that just contains the info from ElectionsInfo so it can be stored in the ArrayList
			info.add(new InfoTemp(pVoteDem,pVoteRep, eVote, state, legalMessage));
			display();
		}

	}
	public ArrayList<InfoTemp> getInfo(){
		ArrayList<InfoTemp> copy=new ArrayList<InfoTemp>();
		for (InfoTemp i: info){
			copy.add(new InfoTemp(i.pVoteDem, i.pVoteRep, i.eVote, i.state, i.legalMessage));
		}
		return copy;
	}

	public void display(){
		StringBuilder line= new StringBuilder();
		for (InfoTemp i: info){
			line.append(i.state);
			line.append(", ");
		}
		System.out.println(this.getClass().getName()
				+" reporting on " +line+
				"\nTotal Republican Popular Votes: " + this.popReport.getPVotesRep(this.getInfo())
				+"\nTotal Democrat Popular Votes: " + this.popReport.getPVotesDem(this.getInfo())
				+"\nTotal Republican Electoral Votes: " + this.eleReport.getEVotesRep(this.getInfo())
				+"\nTotal Democrat Electoral Votes: " + this.eleReport.getEVotesDem(this.getInfo())
				+"\n"+this.legalMessage+"\n");

	}
}
