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
	String currencyDropdown = "//*[@id=\"currency\"]";

}
