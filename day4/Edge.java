package week2.day4;

public class Edge extends Browser{
	
	public void takeSnap(){
		System.out.println("Take Snap");
	}
	
	public void clearCookies(){
		System.out.println("Clear Cookies");
	}
	
	public static void main(String[] args) {
		Edge ed=new Edge();
		System.out.println(ed.browserNmae);
		System.out.println(ed.browserVersion);
		ed.navigateBack();
		ed.openUrl();
		ed.closeBrowser();
		ed.takeSnap();
		ed.clearCookies();

	}

}
