package genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

	public String getpropertyData(String key)
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(Autoconstant.propertfilepath);
		p.load(fis);
		return p.getProperty(key);
	}
}
