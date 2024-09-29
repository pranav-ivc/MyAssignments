package week3.day1;

public class OverloadingAss1 {
	
	public void reportStep() {
		System.out.println("reportStep method from overloading Super class");
	}
	
	
	public void reportStep(String msg,String status) {
		System.out.println("This is reportStep method with 2 parameters : "+msg+" "+status);
	}
	
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println("This is reportStep method with 3 parameters : "+msg+" "+status+" "+snap);

	}
	
	public void takeSnap() {
		System.out.println("takeSnap method from overloading Super class");
	}

	public static void main(String[] args) {
			
		OverloadingAss1 obj=new OverloadingAss1();
		obj.reportStep("Hello","Available");
		obj.reportStep("Hello","Available",true);
		
	}

}
