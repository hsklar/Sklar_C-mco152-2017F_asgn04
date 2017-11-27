import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class CentralObserver implements Observer{
	//The Central Observer receives the information from the Observable and stores it 
	//in an ArrayList. Each time a new state is pushed to the Observer the InfoTemp object that
	//contains the information is put in the Observer's ArrayList

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
	//Each time a new state's stats are pushed, update calls the display method to 
	//calculate total popular and electoral votes for all the states that were already entered
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
	//the display method is the only method that demonstrates the different functionality of all
	//the Observers. The methods getPVotesDem() and getPVotesRep() are requirements of the 
	//IReportPopular interface and skew popular vote results differently based on the class that
	//is calling them. The same is true for the getEVotesRep() and getEVotesDem() methods of the
	//IReportElectoralCollege interface.
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
