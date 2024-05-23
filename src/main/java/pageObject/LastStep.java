package pageObject;

public interface LastStep {
	
//	SampleTest
	String uploadButton = "//*[@id='wpcf7-f2598-p2599-o1']/form/p/span/input";
	String Name = "//input[@id='g2599-name']";
	String email = "//input[@id='g2599-email']";
    String website = "//input[@id='g2599-website']";
    String Experience = "//select[@id='g2599-experienceinyears']";
    String FunctionalTesting = "//div[@id='contact-form-2599']/form/div[5]/label[2]/input";
    String AutomationTesting = "//*[@id='contact-form-2599']/form/div[5]/label[3]/input";
    String ManualTesting = "//*[@id='contact-form-2599']/form/div[5]/label[4]/input";
    String Education = "//div[@id='contact-form-2599']/form/div[6]/label[2]/input";
    String Alertbutton = "//*[@id='contact-form-2599']/form/button";
    String multiSelectCheckBox = "input[name='g2599-expertise[]']";
    String comment ="//*[@id='contact-form-comment-g2599-comment']";
    String Submit = "//*[@id='contact-form-2599\']/form/p[3]/button";
}
