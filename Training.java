package Quest;

public class Training {
protected int timeOfTraining;
protected String dateOfTraining;

Training(String dateOfTraining,int timeOfTraining){
	this.dateOfTraining=dateOfTraining;
	this.timeOfTraining=timeOfTraining;
}
public String getDateOfTraining() {
	return dateOfTraining;
}
public int getTimeOfTraining() {
	return timeOfTraining;
}
public void setDateOfTraining(String dateOfTraining) {
	this.dateOfTraining = dateOfTraining;
}
}
