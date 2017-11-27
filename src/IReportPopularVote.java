import java.util.ArrayList;

public interface IReportPopularVote {
	//the interface that specifies the required methods for any class that presumes to report on
	//the electoral vote
	int getPVotesDem(ArrayList<InfoTemp> info);
	int getPVotesRep(ArrayList<InfoTemp> info);
}
