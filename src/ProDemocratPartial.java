import java.util.Observable;
public class ProDemocratPartial extends CentralObserver{

	public ProDemocratPartial(Observable observable){
		super(observable, new DemBiasPop(), new HonestReportEle());
	}
}
