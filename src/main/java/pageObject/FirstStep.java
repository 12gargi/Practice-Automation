package pageObject;

public interface FirstStep {
	
	
	//Sliders
	String Sliderframe = "//iframe[@class='demo-frame lazyloaded']";
	String redScanner = "/html[1]/body[1]/div[1]/span[1]";
	String blueScanner="//div[@id='blue']/span";
	
	//Tooltip
	String toolFrame = "//iframe[@class='demo-frame lazyloaded']";
	String texttooltip = "body > div:nth-child(1) > div > h3 > a";
	String ElementWithToolTip = "body > div:nth-child(1) > div";
	
	//DialogBox
	String frame ="//iframe[@class='demo-frame lazyloaded']";
	String dialogbox = "//button[@id='create-user']";
	String Content = "body > div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.ui-dialog-buttons.ui-draggable.ui-resizable";
	String usename = "//*[@id=\"name\"]";
	String email = "//*[@id=\"email\"]";
	String password ="//*[@id=\"password\"]";
	String createButton = "/html/body/div[3]/div[3]/div/button[1]";
	
	//Progress Bar
	String frameProgress = "//iframe[@class='demo-frame lazyloaded']";
	String downloadButton = "//*[@id=\"downloadButton\"]";
	String FileDownload = "body > div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.ui-dialog-buttons.ui-draggable";
	String Progress = "//*[@id=\"progressbar\"]/div";
	String close = "/html/body/div[2]/div[3]/div/button";

}
