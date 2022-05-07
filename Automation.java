package week3.day1;

public class Automation implements Language,TestTool

{

	public static void main(String[] args) 
	{
		Automation auto =new Automation();
		
		auto.Selenium();
		auto.Java();
		auto.automation();

	}
	
	public void automation()
	{
		System.out.println("Necessary tool for Selenium in Automation");
		this.Selenium();
		this.Java();
	}
	public void Selenium() 
	{
    System.out.println("Selenium is required");		
	}

	public void Java() 
	{
		System.out.println("Java 8 is required");		
	}

}
