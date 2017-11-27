import java.util.ArrayList;

public interface IReportElectoralCollege {

	//the interface that specifies the required methods for any class that presumes to report on
	//the electoral vote
	int getEVotesDem(ArrayList<InfoTemp> info);
	int getEVotesRep(ArrayList<InfoTemp> info);

}