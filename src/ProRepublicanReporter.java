import java.util.Observable;
public class ProRepublicanReporter extends CentralObserver{

	//Biased toward the Republicans in both the popular and electoral votes
	//Implements RepBiasEle1 which takes one state and makes it always vote Republican
	public ProRepublicanReporter(Observable observable){
		super(observable, new RepBiasPop(), new RepBiasEle1());
	}
}
