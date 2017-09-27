package PropertyFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class readWriteValues{		
	public static void main(String[] args)
	{		try {		
		Properties properties = new Properties();	
		properties.setProperty("Name", "neha");		
		properties.setProperty("Company", "Innotical pvt. ltd.");		
		properties.setProperty("Profile", "Test Engineer");		
		File file = new File("test2.properties");		
		FileOutputStream fileOut = new FileOutputStream(file);		
		properties.store(fileOut, "");		
		fileOut.close();	
		} catch (FileNotFoundException e
				) {		
			e.printStackTrace();
} 
	catch (IOException e) {		
	e.printStackTrace();	
	
	}	
	}
	}