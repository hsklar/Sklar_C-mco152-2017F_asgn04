import java.util.Observable;
public class HalfandHalfReporter extends CentralObserver{
	
	public HalfandHalfReporter(Observable observable){
		super(observable, new DemBiasPop(), new RepBiasEle2());
	}

}
