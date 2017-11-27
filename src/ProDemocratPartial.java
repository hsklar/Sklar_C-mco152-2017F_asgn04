import java.util.Observable;
public class ProDemocratPartial extends CentralObserver{

	//Biased toward the democrats in the popular vote, but accurate in the reporting the 
	//electoral vote
	public ProDemocratPartial(Observable observable){
		super(observable, new DemBiasPop(), new HonestReportEle());
	}
}
