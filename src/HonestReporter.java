
import java.util.Observable;

public class HonestReporter extends CentralObserver{

	public HonestReporter(Observable observable){
		super(observable, new HonestReportPop(), new HonestReportEle());
	}


}
