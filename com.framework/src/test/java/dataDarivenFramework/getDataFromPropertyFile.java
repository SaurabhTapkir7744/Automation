package dataDarivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		String Path = "./src/test/resources/CommonData.properties";
		String key = "Browser";
		// create object of FileInputStream
		FileInputStream fis = new FileInputStream(Path);
		// create object Properties
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		System.out.println(data);
	}

}
