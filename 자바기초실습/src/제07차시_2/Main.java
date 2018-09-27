package 제07차시_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car myCar = new Car();
		
		myCar.madeFrom = "현대자동차";
		myCar.kind = "2019 아반떼";
		myCar.color = "빨간색";
		myCar.carNumber = "23가8943";
		myCar.efficiency = 17.8;
		myCar.exhaustGas = 1582;
		myCar.drStatus= 1;
		myCar.owner = "owner";
		myCar.driveable = 100000;
		myCar.currenSpeed =65;
		myCar.currenFuelEco =17.8;
		
		System.out.println(myCar.madeFrom);
		System.out.println(myCar.kind);
		System.out.println(myCar.color);
		System.out.println(myCar.carNumber);
		System.out.println(myCar.efficiency);
		System.out.println(myCar.exhaustGas);
		System.out.println(myCar.drStatus);
		System.out.println(myCar.owner);
		System.out.println(myCar.driveable);
		System.out.println(myCar.currenSpeed);
		System.out.println(myCar.currenFuelEco);
		
		myCar.onCar();
		myCar.giarChange();
		myCar.speedControl();
		myCar.changeDirec();
		myCar.onDirecLight();
		myCar.onEmLights();
		myCar.tootHorn();
		myCar.openFuelInlet();
		myCar.openHood();
		myCar.openSunRoof();
		myCar.openTrunk();
	}

}
