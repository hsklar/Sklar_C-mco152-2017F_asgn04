import java.util.Observable;
public class ProRepublicanReporter extends CentralObserver{

	public ProRepublicanReporter(Observable observable){
		super(observable, new RepBiasPop(), new RepBiasEle1());
	}
}
