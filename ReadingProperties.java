package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("user.dir"));
		 
		Properties Prop= new Properties();
		FileInputStream fp= new FileInputStream(System.getProperty("user.dir")+"//src//Config//student.properties");
		Prop.load(fp);
		System.out.println(Prop.getProperty("name"));
		

	}

}
