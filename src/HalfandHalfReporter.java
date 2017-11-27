import java.util.Observable;
public class HalfandHalfReporter extends CentralObserver{
	
	//Biased in favor of Democrats in the popular vote and Republicans in the electoral vote using
	//RepBiasEle2 (splits the electoral vote when "to close to call")
	public HalfandHalfReporter(Observable observable){
		super(observable, new DemBiasPop(), new RepBiasEle2());
	}
}
