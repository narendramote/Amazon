package pack12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	public static String screenshot(WebDriver driver, String testID) throws IOException {
		
		Date date=new Date();
		String DateTime=date.toString().replace(":","_")+".jpg";
		File  Source=(File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest =new File("G:\\Selenium\\CapttureScreenshot\\naru"+testID+DateTime+".jpg");
		FileHandler.copy(Source, Dest);  
		
		return testID;
		// screenshot
		
	}
	
	public static String getDataFromExcel(String sheet, int row,int cell) throws IOException, EncryptedDocumentException {
		
         String path = ("G:\\Test case design\\Worksheet1.xlsx") ;
		
		FileInputStream file = new FileInputStream(path);
		
		String value =  WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
			
		
		
		return value;
		
		
		
		
		
	}
		
		
		
		
		
		
	

}
