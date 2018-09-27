package 제07차시_2;

public class Car {
	String madeFrom;
	String kind;
	String color;
	String carNumber;
	double efficiency;
	int exhaustGas;
	int drStatus;
	String owner;
	int driveable;
	double currenSpeed;
	double currenFuelEco;

	void onCar() {
		System.out.println("Engine is on.");
	}

	void giarChange() {
		System.out.println("Gear changed.");
	}

	void speedControl() {
		System.out.println("Speed is adjusted.");
	}

	void changeDirec() {
		System.out.println("Direction is changed.");
	}

	void onDirecLight() {
		System.out.println("Direction lamp is on.");
	}

	void onEmLights() {
		System.out.println("Emergency lights on.");
	}

	void tootHorn() {
		System.out.println("The horn sounded.");
	}

	void openFuelInlet() {
		System.out.println("Open the fuel filler door.");
	}

	void openHood() {
		System.out.println("Opened the hood.");
	}

	void openSunRoof() {
		System.out.println("Opened the sunroof.");
	}

	void openTrunk() {
		System.out.println("Opened the trunk.");
	}
}