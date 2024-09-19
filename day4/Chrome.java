package week2.day4;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Open incognito");
	}
	public void clearCache(){
		System.out.println("Clear Cache");
	}
	
	public static void main(String[] args) {
		Chrome cr=new Chrome();
		System.out.println(cr.browserNmae);
		System.out.println(cr.browserVersion);
		cr.navigateBack();
		cr.openUrl();
		cr.closeBrowser();
		cr.openIncognito();
		cr.clearCache();

	}

}
