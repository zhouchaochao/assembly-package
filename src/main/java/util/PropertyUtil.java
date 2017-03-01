package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertyUtil {
	private PropertyUtil(){}
	private static Logger logger = LoggerFactory.getLogger(PropertyUtil.class);
	private static Properties properties = new Properties();
	static{
		
		try {
			String[] fileNames = new String[]{"global.properties"};
			for (String fileName : fileNames) {
				InputStream inputStream = PropertyUtil.class.getClassLoader().getResourceAsStream(fileName);
				properties.load(inputStream);
				inputStream.close();
				
			}
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
		}
	}
	
	public static String getProperties(String key){
		return (String) properties.get(key);
	}
	public static Set<Object> getPropertyKeys(){
		return  properties.keySet();
	}
}
