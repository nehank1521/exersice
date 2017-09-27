package PropertyFile;

import java.io.File;
import java.io.IOException;

public class myTempFile {

	public static void main(String[] args) {
		File tmpFile = null;
        try {
            tmpFile = File.createTempFile("MyTempFile", ".tmp");
            System.out.println("Created Temp File Location : " + tmpFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            
        } 
        System.out.println("Complexity will be O(n)");
    }
	}


