class Car {
	int gasolineGauge;

	Car(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}

}

class HybridCar extends Car {
	int electricGauge;

	HybridCar(int electricGauge, int gasolineGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;

	HybridWaterCar(int waterGauge, int electricGauge, int gasolineGauge) {
		super(electricGauge, gasolineGauge);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
		System.out.println("잔여 워터량: " + waterGauge);
	}
}