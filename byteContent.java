package PropertyFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class byteContent {
	
		 
	    public static void main(String[] args) {
	         
	        OutputStream opStream = null;
	        try {
	            String strContent = "Creating byte content";
	            byte[] byteContent = strContent.getBytes();
	            File myFile = new File("//home//aj.txt");
	            if (!myFile.exists()) {
	                myFile.createNewFile();
	            }
	            opStream = new FileOutputStream(myFile);
	            opStream.write(byteContent);
	            opStream.flush();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{
	                if(opStream != null) opStream.close();
	            } catch(Exception ex){
	                 
	            }
	        }
	    }
}
