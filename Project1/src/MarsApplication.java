
public class MarsApplication {

	public static void main(String[] args) {
		MarsRobot spirit = new MarsRobot();
		spirit.status = "eksploracja";
		spirit.speed = 2;
		spirit.temperature = -60;
		
		MarsRobot opportunity = new MarsRobot();
		opportunity.status = "mozliosci";
		opportunity.speed = 1;
		opportunity.temperature = -70;
				

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
		
		opportunity.showAttributes();
		System.out.println("Zwiêkszanie prêdkosci do 3.");
		opportunity.speed = 3;
		opportunity.showAttributes();
		System.out.println("Zmiana temperatury na -90");
		opportunity.temperature = -90;
		opportunity.showAttributes();
		System.out.println("Sprawdzanie temperatury.");
		opportunity.checkTemperature();
		opportunity.showAttributes();
	}

}
