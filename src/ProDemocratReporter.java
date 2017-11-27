import java.util.Observable;
public class ProDemocratReporter extends CentralObserver {

	//Biased toward the Democrats in both the popular and electoral vote
	public ProDemocratReporter(Observable observable){
		super(observable, new DemBiasPop(), new DemBiasEle1());
	}
}
