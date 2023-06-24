package file_handling_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_streamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/ashwini/Pictures/af.png");
	    File file2 = new File("/home/ashwini/Pictures/abcd.jpeg");
	  FileInputStream input = new FileInputStream(file);
	  FileOutputStream output = new FileOutputStream(file2);
	  int i = input.read(); 
	  while(i!=-1)
	  {
	    output.write(i);
	    i =input.read(); 
	  }
	  output.flush();
	  output.close();
		
		
	}
	

}
