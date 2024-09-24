package polymorphism;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		System.out.println("perform common tasks from LoginPage");

	}

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.performCommonTasks();
		lp.findElement();
		lp.enterText();
		lp.clickElement();
		
		BasePage bp=new BasePage();
		bp.performCommonTasks();

	}

}
