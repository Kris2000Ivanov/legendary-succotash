package Quest;

public class App {
public static void main(String[] args) {
	Program obj=new Program("19.01.2018", "Shoulders", 70, "Shoulder Press", 40);
	obj.setAll("18.01.2018", "Chest", 100, "Bench PRess", 100);
	obj.deleteAll(null, null, 0, null, 0);
}
}
