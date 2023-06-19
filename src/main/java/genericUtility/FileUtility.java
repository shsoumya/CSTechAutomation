package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readData(String key) throws IOException
	{
		
		FileInputStream fis = new FileInputStream("./commonData/funtional.properties/");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
	}
}
