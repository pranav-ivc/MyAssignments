package week2.day4;

public class TestDataSubClass extends TestData{
	
	public void enterUserName() {
		System.out.println("SubClass Enter Username method");
	}
	
	public void enterPassword() {
		System.out.println("SubClass Enter Password method");
	}

	public static void main(String[] args) {
		TestDataSubClass subClass=new TestDataSubClass();
		subClass.enterCredentials();
		subClass.navigateToHomePage();
		subClass.enterUserName();
		subClass.enterPassword();

	}

}
