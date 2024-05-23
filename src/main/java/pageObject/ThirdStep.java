package pageObject;

public interface ThirdStep {
	
	//Sortables
	
	String sortframe = "//iframe[@class='demo-frame lazyloaded']";
	String feeds = "/html/body/div[1]/div[1]/div[1]";                  
	String shopping = "/html/body/div[2]/div";
	String Links = "/html/body/div[3]/div[1]";
	String Images = "/html/body/div[3]/div[2]";
	String News = "/html/body/div[1]/div[2]";
	
	
	//Spinner
	String spinerframe = "//iframe[@class='demo-frame lazyloaded']";
	String spinnerInput = "/html/body/p[1]/span";
	String upArrow ="/html/body/p[1]/span/a[1]";
	String downArrow = "/html/body/p[1]/span/a[2]";
	String currencyDropdown = "//*[@id='currency']";
	
	
	//ToolBar
	String toolbarframe = "//iframe[@class='demo-frame lazyloaded']";
	String Printbutton = "//button[@id='print']";
	String undobutton = "//button[@id='undo']";
	String redobutton = "//button[@id='redo']";
	String zoomdropdown ="//*[@id='zoom-button']";
	String zoomOptions = "//ul[@id='zoom-menu']/li";
	
	//Datepicker
	String dateFrame = "//iframe[@class='demo-frame lazyloaded']";
	String dateinput = "//*[@id='datepicker']";
	String datebox = "#ui-datepicker-div";
	String daterow = "//*[@id='ui-datepicker-div']/table/tbody/tr";
	String datecol = "//*[@id='ui-datepicker-div']/table/tbody/tr/td";
	
	//DragAndDrop
	String dragiframe = "//iframe[@class='demo-frame lazyloaded']";
	String listImage = "//*[@id='gallery']";
	String SecondPosition = "//*[@id='gallery']/li[2]";
	String ThirdPosition = "//*[@id='gallery']/li[3]";
	String ForthPosition = "//*[@id='gallery']/li[4]";
	String FirstPosition = "//*[@id='gallery']/li[1]";
	String Trash = "//div[@id='trash']";
	
	//Draggable Box
	String Boxiframe = "//iframe[@class='demo-frame lazyloaded']";
	String DragBox ="(//div[@id='draggable'])[1]";

}
