
public class MarsRobot {
	String status;
	int speed;
	float temperature;
	
	void checkTemperature() {
		if (temperature < -62) {
			status = "powr�t do domu";
			speed = 5;
		}
	}
	void showAttributes (){
		System.out.println("Status: " + status);
		System.out.println("Pr�dko��:"  +speed);
		System.out.println("Temperatur: "  + temperature);
	}
	

}
