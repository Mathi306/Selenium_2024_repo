package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getPropertyfromproperties(String key) throws IOException
	{
		FileInputStream Pfis = new FileInputStream("./propertiesFile/DemoLoginCred.properties");
		Properties prop = new Properties();
		prop.load(Pfis);
	    return prop.getProperty(key);
	}

}
