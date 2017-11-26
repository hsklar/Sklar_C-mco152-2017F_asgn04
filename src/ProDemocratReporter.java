import java.util.Observable;
public class ProDemocratReporter extends CentralObserver {

	public ProDemocratReporter(Observable observable){
		super(observable, new DemBiasPop(), new DemBiasEle1());
	}
}
