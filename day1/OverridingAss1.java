package week3.day1;

public class OverridingAss1 extends OverloadingAss1{

	public void takeSnap() {
		System.out.println("takeSnap method from overloading Sub class");
	}
	
	public void reportStep() {
		System.out.println("reportStep method from overloading Sub class");
	}

	public static void main(String[] args) {
		OverridingAss1 ride=new OverridingAss1();
		ride.takeSnap();
		ride.reportStep();
	
		OverloadingAss1 load=new OverloadingAss1();
		load.takeSnap();
		load.reportStep();
		
	}

}
