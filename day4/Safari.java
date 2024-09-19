package week2.day4;

public class Safari extends Browser{

	public void readerMode(){
		System.out.println("Reader Mode");
	}
	
	public void fullScreenMode(){
		System.out.println("Full Screen Mode");
	}
	
	public static void main(String[] args) {
		Safari sf=new Safari();
		System.out.println(sf.browserNmae);
		System.out.println(sf.browserVersion);
		sf.navigateBack();
		sf.openUrl();
		sf.closeBrowser();
		sf.readerMode();
		sf.fullScreenMode();
	}

}
