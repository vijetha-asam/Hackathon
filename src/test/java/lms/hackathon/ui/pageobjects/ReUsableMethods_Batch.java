package lms.hackathon.ui.pageobjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReUsableMethods_Batch {

	
	public void multipleCheckbox(By ele, WebDriver driver) {
		
		
		
		List<WebElement> checkbox= driver.findElements(ele) ;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				for(int i=1; i<checkbox.size(); i+=2) {
					System.out.println("Selected checkbox is :"+checkbox.get(i).getAttribute("selected"));
					
					if(checkbox.get(i).getAttribute("selected") == null) {
						checkbox.get(i).click();
						
					}
				}
	}
			public void singleCheck(By ele, WebDriver driver) {	
				WebElement checkboxsingle=driver.findElement(ele);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(checkboxsingle.getAttribute("selected") == null) {
					checkboxsingle.click();
				}
	}	
				
			public void clickButton(By ele,WebDriver driver) {
				
				WebElement element=driver.findElement(ele);
				
				if(element.isDisplayed()) {
					if(element.isEnabled()) {
						
						Actions action = new Actions(driver);
						action.moveToElement(element).perform();;
						action.click(element).perform();
					
						
						return;
						}
					else {
						System.out.println("element is not displayed");
					}
					}
				else {
					System.out.println("element is not Enabled");
				}
				
			}
			
				
			}
	
	
