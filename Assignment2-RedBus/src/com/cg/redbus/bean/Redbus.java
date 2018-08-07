package com.cg.redbus.bean;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Redbus {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\vaishnav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/bus-tickets/");

		WebElement source = driver.findElement(By.id("txtSource"));
		source.sendKeys("Chennai Intl Airport");

		WebElement destination = driver.findElement(By.id("txtDestination"));
		destination.sendKeys("Bangalore Intl Airport");

		WebElement onDatetab = driver.findElement(By.id("txtOnwardCalendar"));
		onDatetab.click();

		WebElement date14 = driver.findElement(By.xpath("//*[@id=\"rb-calmiddle\"]/ul[2]/li[16]/span"));
		date14.click();

		WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[4]/button"));
		search.click();

		Thread.sleep(3000);
		search.sendKeys(Keys.TAB);
		search.sendKeys(Keys.TAB);
		search.sendKeys(Keys.ENTER);
		
		/*WebDriverWait wait = new WebDriverWait(driver,7);*/
		Thread.sleep(8000);
		WebElement viewSeats = driver.findElement(By.xpath("//*[@id=\"10655616\"]/div/div[2]/div[1]"));
		viewSeats.click();
	
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		Thread.sleep(6000);
		WebElement seats = driver.findElement(By.xpath("//*[@id=\"rt_10655616\"]/div/div/div/div[2]/div[2]/div[2]/canvas"));
	    Actions action = new Actions(driver);
	    action.moveToElement(seats, 270, 30).click().build().perform();

	    /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
	    Thread.sleep(5000);
		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"10655616\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button"));
		proceed.click();
	
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//*[@id=\"seatno-04\"]"));
		name.sendKeys("Sundar");

		WebElement gender = driver.findElement(By.xpath("//*[@id=\"22_0\"]"));
		gender.click();
	
		WebElement age = driver.findElement(By.id("seatno-01"));
		age.sendKeys("21");

		WebElement mailId = driver.findElement(By.id("seatno-05"));
		mailId.sendKeys("vaishu@gmail.com");
		
		WebElement phone = driver.findElement(By.id("seatno-06"));
		phone.sendKeys("9794513683");
		
		WebElement proceedtopay = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input"));
		proceedtopay.click();
	}
}
