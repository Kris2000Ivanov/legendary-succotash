package Quest;

public class Program extends Training{
private String exercise;
private int numberOfRepetion;
private String whatMuscleWillBeTrained;
public Program(String dateOfTraining,String whatMuscleWillBeTrained,int timeOfTraining,String exercise,int numberOfRepetition) {
	super(dateOfTraining,timeOfTraining);
	this.exercise=exercise;
	this.numberOfRepetion=numberOfRepetition;
	this.whatMuscleWillBeTrained=whatMuscleWillBeTrained;
}
public String getExercise() {
	return exercise;
}
public int getNumberOfRepetion() {
	return numberOfRepetion;
}
public String getWhatMuscleWillBeTrained() {
	return whatMuscleWillBeTrained;
}
public void setAll(String dateOfTraining,String whatMuscleWillBeTrained,int timeOfTraining,String exercise,int numberOfRepetition) {
	this.dateOfTraining=dateOfTraining;
	this.whatMuscleWillBeTrained=whatMuscleWillBeTrained;
	this.timeOfTraining=timeOfTraining;
	this.exercise=exercise;
	this.numberOfRepetion=numberOfRepetition;
}
public void deleteAll(String dateOfTraining,String whatMuscleWillBeTrained,int timeOfTraining,String exercise,int numberOfRepetition) {
this.dateOfTraining=null;
this.whatMuscleWillBeTrained=null;
this.timeOfTraining=0;
this.exercise=null;
this.numberOfRepetion=0;
}
}
