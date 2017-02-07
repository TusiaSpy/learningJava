
public class MarsApplication {

	public static void main(String[] args) {
		MarsRobot spirit = new MarsRobot();
		spirit.status = "eksploracja";
		spirit.speed = 2;
		spirit.temperature = -60;

		spirit.showAttributes();
		System.out.println("Zwiêkszanie prêdkosci do 3.");
		spirit.speed = 3;
		spirit.showAttributes();
		System.out.println("Zmiana temperatury na -90");
		spirit.temperature = -90;
		spirit.showAttributes();
		System.out.println("Sprawdzanie temperatury.");
		spirit.checkTemperature();
		spirit.showAttributes();
	}

}
