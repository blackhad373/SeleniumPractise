package genericLibrary;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	private static final int CurrentDate = 0;

	public void getPhoto(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts getScreenshotAs(OutputType.FILE);
		int name;
		File dest=new File(AutoConstant.photoPath+CurrentDate+name+".php");
		FileUtils.copyFile(src, dest);
	}

}
