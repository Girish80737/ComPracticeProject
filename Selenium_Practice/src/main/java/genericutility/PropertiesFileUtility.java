package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtility 
{
	public String getDataFromPropertiesFile(String key) throws IOException
	  {
		  FileInputStream fis=new FileInputStream("./testdata/commondata2.properties");
		  Properties pobj=new Properties();
		  pobj.load(fis);
		  String data = pobj.getProperty(key);
		  
		  return data;
	  }
}
