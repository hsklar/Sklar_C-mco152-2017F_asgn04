
import java.util.Observable;

//returns accurate data for both the republican and democrat vote
public class HonestReporter extends CentralObserver{

	public HonestReporter(Observable observable){
		super(observable, new HonestReportPop(), new HonestReportEle());
	}
}
