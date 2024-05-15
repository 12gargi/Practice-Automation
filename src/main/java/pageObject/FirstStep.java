package pageObject;

public interface FirstStep {
	
	//Tabs
	String AccordFrame = "//*[@id=\"post-2654\"]/div[2]/div/div/div[1]/p/iframe";
	String acordHeader = ".ui-accordion-header";
	String Accordions = "//*[@id=\"accordion\"]";
	
	
	//Sliders
	String redScanner = "/html[1]/body[1]/div[1]/span[1]";
	String blueScanner="//div[@id='blue']/span";
	
	//Tooltip
	String toolFrame = "//*[@id=\"post-2679\"]/div[2]/div/div/div[1]/p[1]/iframe";
	String texttooltip = "body > div:nth-child(1) > div > h3 > a";
	String ElementWithToolTip = "body > div:nth-child(1) > div";
	
	//DialogBox
	String frame ="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p[1]/iframe";
	String dialogbox = "//button[@id='create-user']";
	String Content = "body > div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.ui-dialog-buttons.ui-draggable.ui-resizable";
	String usename = "//*[@id=\"name\"]";
	String email = "//*[@id=\"email\"]";
	String password ="//*[@id=\"password\"]";
	String createButton = "/html/body/div[3]/div[3]/div/button[1]";
	
	//Progress Bar
	String frameProgress = "#post-2671 > div.twelve.columns > div > div > div.single_tab_div.resp-tab-content.resp-tab-content-active > p > iframe";
	String downloadButton = "//*[@id=\"downloadButton\"]";
	String FileDownload = "body > div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.ui-dialog-buttons.ui-draggable";
	String Progress = "//*[@id=\"progressbar\"]/div";
	String close = "/html/body/div[2]/div[3]/div/button";

}
