package pageObject;

public interface SecondStep {
	
	//Accordions
	String AccordFrame = "iframe.demo-frame.lazyloaded";
	String AccordionHeader = "//*[@id='accordion']";

	// TabsAndWindow
	String clickHerebtn = "(//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here'])[1]";
	
	//DropDown
	String dropDown = "div[class='single_tab_div resp-tab-content resp-tab-content-active'] p select";
	
	//SelectElements
	String frame = "iframe.demo-frame.lazyloaded";
    String multiSelect = "//*[@id='selectable']";
    String Selectchild1= "//*[@id='selectable']/li[1]";
    String Selectchild2= "//*[@id='selectable']/li[2]";
    String Selectchild3= "//*[@id='selectable']/li[3]";
    String Selectchild4= "//*[@id='selectable']/li[4]";
    String Selectchild5= "//*[@id='selectable']/li[5]";
    String Selectchild6= "//*[@id='selectable']/li[6]";
    String Selectchild7= "//*[@id='selectable']/li[7]";
    
    
}
