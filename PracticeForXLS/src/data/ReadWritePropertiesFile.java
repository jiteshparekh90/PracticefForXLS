package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {


		FileInputStream fi = new FileInputStream("C:\\QA\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fi);
		
		String abc = prop.getProperty("browser");
		System.out.println(abc);
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("incorrectemail"));
		
		prop.setProperty("name", "Jitesh");
		System.out.println(prop.getProperty("name"));
		
		FileOutputStream fo = new FileOutputStream("C:\\QA\\Testing\\prop.properties");
		prop.store(fo, "Adding to Properties File");	

	}

}
