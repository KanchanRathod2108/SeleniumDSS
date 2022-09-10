package Program;

public class Screenshot_full_page {

	public static void main(String[] args) {
		
				 System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
				    
				    WebDriver driver=new ChromeDriver();
				        
				    driver.get("http://makeseleniumeasy.com/2017/04/02/hierarchy-of-selenium-classes-and-interfaces/");
				        
				    driver.manage().window().maximize();
				      
				    Thread.sleep(2000);
				        
				    File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				        
				    File d = new File("C:/Users/Aakash/Pictures/Saved Pictures.bmp");
				        
				    FileUtils.copyFile(s, d);
				        
				        

				  }

			
	}


