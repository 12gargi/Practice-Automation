package pageObject;

public interface SecondStep {
	
	//Accordions
	String AccordFrame = "//iframe[@class='demo-frame lazyloaded']";
	String AccordionHeader = "//*[@id=\"accordion\"]";

	// TabsAndWindow
	String clickHerebtn = "//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/a";
	
	//DropDown
	String dropDown = "//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select";
	
	//SelectElements
	String frame = "//*[@id=\"post-2649\"]/div[2]/div/div/div[1]/p/iframe";
    String multiSelect = "//*[@id=\"selectable\"]";
    String Selectchild1= "//*[@id=\"selectable\"]/li[1]";
    String Selectchild2= "//*[@id=\"selectable\"]/li[2]";
    String Selectchild3= "//*[@id=\"selectable\"]/li[3]";
    String Selectchild4= "//*[@id=\"selectable\"]/li[4]";
    String Selectchild5= "//*[@id=\"selectable\"]/li[5]";
    String Selectchild6= "//*[@id=\"selectable\"]/li[6]";
    String Selectchild7= "//*[@id=\"selectable\"]/li[7]";
    
    
}
